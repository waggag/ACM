package cn.waggag.interview.Thread;

import java.util.concurrent.CountDownLatch;

public class Thread_sync_wait_notify_latch {

    private static CountDownLatch latch = new CountDownLatch(1);

    public static void main(String[] args) {

        final Object object = new Object();

        char[] aI = "1234567".toCharArray();
        char[] aC = "ABCDEFG".toCharArray();

        new Thread(()->{
            try {
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (object){
                for (char c : aC) {
                    System.out.println(c);
                    //唤醒其他线程
                    object.notify();
                    try {
                        //当前线程让出锁进入等待队列
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                object.notify();
            }
        },"thread1").start();

        new Thread(()->{
            synchronized (object){
                for (char c : aI) {
                    System.out.println(c);
                    latch.countDown();
                    object.notify();
                    try {
                        object.wait(); //让出锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                object.notify();
            }
        },"thread2").start();

    }
}

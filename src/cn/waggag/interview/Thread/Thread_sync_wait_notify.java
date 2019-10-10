package cn.waggag.interview.Thread;

/**
 * 同步和等待
 */
public class Thread_sync_wait_notify {

    public static void main(String[] args) {
        final Object object = new Object();

        char[] aI = "1234567".toCharArray();
        char[] aC = "ABCDEFG".toCharArray();

        new Thread(() -> {
            synchronized (object) {
                for (char c : aI) {
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
        }, "thread1").start();

        new Thread(() -> {
            synchronized (object) {
                for (char c : aC) {
                    System.out.println(c);
                    object.notify();
                    try {
                        object.wait(); //让出锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                object.notify();
            }
        }, "thread2").start();
    }
}

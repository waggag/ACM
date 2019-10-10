package cn.waggag.interview.Thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 阻塞队列
 */
public class Thread_BlockQueue {

    static BlockingQueue<String> queue1 = new ArrayBlockingQueue<>(1);
    static BlockingQueue<String> queue2 = new ArrayBlockingQueue<>(1);

    public static void main(String[] args) {

        char[] aI = "1234567".toCharArray();
        char[] aC = "ABCDEFG".toCharArray();

        new Thread(()->{
            for (char c : aI) {
                System.out.println(c);
                try {
                    queue1.put("ok");
                    queue2.take();   //取出内容为空阻塞线程
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "thread1").start();

        new Thread(()->{
            for (char c : aC) {
                try {
                    queue1.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(c);
                try {
                    queue2.put("ok");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "thread1").start();
    }




}

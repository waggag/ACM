package cn.waggag.interview.Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread_AtomicInteger {

    static AtomicInteger threadNo = new AtomicInteger(1);

    public static void main(String[] args) {
        char[] aI = "1234567".toCharArray();
        char[] aC = "ABCDEFG".toCharArray();

        new Thread(()->{
            for (char c : aI) {
                while (threadNo.get() != 1){}
                System.out.println(c);
                threadNo.set(2);
            }
        }, "thread1").start();

        new Thread(()->{
            for (char c : aC) {
                while (threadNo.get() != 2){}
                System.out.println(c);
                threadNo.set(1);
            }
        }, "thread2").start();
    }
}

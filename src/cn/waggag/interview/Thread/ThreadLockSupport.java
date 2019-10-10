package cn.waggag.interview.Thread;

import java.util.concurrent.locks.LockSupport;

public class ThreadLockSupport {

    private static Thread thread1 = null;
    private static Thread thread2 = null;

    public static void main(String[] args) {

        char[] aI = "1234567".toCharArray();
        char[] aC = "ABCDEFG".toCharArray();

        thread1 = new Thread(()->{
            for (char c : aI) {
                System.out.println(c);
                //唤醒线程2
                LockSupport.unpark(thread2);
                //阻塞当前线程
                LockSupport.park();
            }
        });

        thread2 = new Thread(()->{
            for (char c : aC) {
                LockSupport.park();
                System.out.println(c);
                LockSupport.unpark(thread1);
            }
        });
        thread1.start();
        thread2.start();
    }
}

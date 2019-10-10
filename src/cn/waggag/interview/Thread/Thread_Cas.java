package cn.waggag.interview.Thread;

public class Thread_Cas {

    enum ReadyToRun {T1, T2}

    //为什么要volatile
    static volatile  ReadyToRun r = ReadyToRun.T1;

    public static void main(String[] args) {

        char[] aI = "1234567".toCharArray();
        char[] aC = "ABCDEFG".toCharArray();

        new Thread(()->{
            for (char c : aI) {
                while (r != ReadyToRun.T1){}
                System.out.println(c);
                r = ReadyToRun.T2;

            }
        }, "thread1").start();
        new Thread(()->{
            for (char c : aC) {
                while (r != ReadyToRun.T2){}
                System.out.println(c);
                r = ReadyToRun.T1;
            }
        }, "thread1").start();
    }
}

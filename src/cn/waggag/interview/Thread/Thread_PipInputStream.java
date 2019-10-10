package cn.waggag.interview.Thread;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 管道循环输出 注意数组的大小
 */
public class Thread_PipInputStream {

    public static void main(String[] args) throws IOException {
        char[] aI = "1234567".toCharArray();
        char[] aC = "ABCDEFG".toCharArray();

        PipedInputStream inputStream1 = new PipedInputStream();
        PipedInputStream inputStream2 = new PipedInputStream();
        PipedOutputStream outputStream1 = new PipedOutputStream();
        PipedOutputStream outputStream2 = new PipedOutputStream();

        inputStream1.connect(outputStream2);
        inputStream2.connect(outputStream1);

        String msg = "Return";

        new Thread(() -> {
            byte[] buffer = new byte[6];
            for (char c : aI) {
                try {
                    inputStream1.read(buffer);
                    if (new String(buffer).equals(msg)) {
                        System.out.println(c);
                    }
                    outputStream1.write(msg.getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, "thread1").start();

        new Thread(() -> {
            byte[] buffer = new byte[6];

            try {
                for (char c : aC) {
                    System.out.println(c);
                    outputStream2.write(msg.getBytes());
                    int read = inputStream2.read(buffer);
                    if (new String(buffer).equals(msg)) {
                        continue;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }, "thread2").start();
    }
}

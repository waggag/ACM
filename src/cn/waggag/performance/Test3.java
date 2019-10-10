package cn.waggag.performance;

import java.util.ArrayList;

/**
 * @description:
 * @author: waggag
 * @time: 2019/7/30 19:42
 * @Company http://www.waggag.cn
 */
public class Test3 {
    private static long stratTime;
    private static long endTime;

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        stratTime = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
        }
        endTime = System.nanoTime();
        System.out.println("未优化list耗时：" + (endTime - stratTime));

        int len = list.size();
        stratTime = System.nanoTime();
        for (int i = 0; i < len; i++) {
        }
        endTime = System.nanoTime();
        System.out.println("优化list耗时：" + (endTime - stratTime));

    }
}

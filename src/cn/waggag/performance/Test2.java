package cn.waggag.performance;

/**
 * @description:
 * @author: waggag
 * @time: 2019/7/30 19:42
 * @Company http://www.waggag.cn
 */
public class Test2 {
    private static long stratTime;
    private static long endTime;

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        stratTime = System.nanoTime();
        for (int i = 0; i < 100000000; i++) {
            i = i * a * b;
        }
        endTime = System.nanoTime();
        System.out.println("未提取耗时：" + (endTime - stratTime));

        int c = a * b;
        stratTime = System.nanoTime();
        for (int i = 0; i < 100000000; i++) {
            i = i * c;
        }
        endTime = System.nanoTime();
        System.out.println("提取耗时：  " + (endTime - stratTime));
    }
}

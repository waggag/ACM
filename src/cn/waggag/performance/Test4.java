package cn.waggag.performance;

/**
 * @description:
 * @author: waggag
 * @time: 2019/7/30 19:42
 * @Company http://www.waggag.cn
 */
public class Test4 {
    private static long stratTime;
    private static long endTime;

    public static void test() {
        stratTime = System.nanoTime();
        for (int i = 0; i < 100000000; i++) {
            try {
            } catch (Exception e) {
            }
        }
        endTime = System.nanoTime();
        System.out.println("在内部捕获异常耗时：" + (endTime - stratTime));

        stratTime = System.nanoTime();
        try {
            for (int i = 0; i < 100000000; i++) {
            }
        } catch (Exception e) {
        }
        endTime = System.nanoTime();
        System.out.println("在外部捕获异常耗时：" + (endTime - stratTime));
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            test();
            System.out.println("====================");
        }
    }
}

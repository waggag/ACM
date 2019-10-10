package cn.waggag.performance;

/**
 * @description:
 * @author: waggag
 * @time: 2019/7/30 19:10
 * @Company http://www.waggag.cn
 */
public class Test {
    private static long startTime;
    private static long endTime;

    public static void main(String[] args) {
        /**
         * Returns the current value of the running Java Virtual Machine's
         * high-resolution time source, in nanoseconds.
         * nanoTime()
         * 返回最准确的可用系统计时器的当前值，以毫微秒为单位。
         */
        //外小内大
        startTime = System.nanoTime();
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j < 1000000000; j++) {
            }
        }
        endTime = System.nanoTime();
        System.out.println("外小内大耗时："+(endTime - startTime));

        //外大内小
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000000; i++) {
            for (int j = 0; j < 10; j++) {
            }
        }
        endTime = System.nanoTime();
        System.out.println("外大内小耗时："+ (endTime - startTime));
    }

}

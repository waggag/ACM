import cn.waggag.common.BubbleSort;

import java.util.Scanner;

/**
 * @description:
 * @author: waggag
 * @time: 2019/7/17 19:48
 * @Company http://www.waggag.cn
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[total];
        int[] num2 = new int[total / 2];
        for (int i = 0; i < total; i++) {
            numbers[i] = scanner.nextInt();
        }
        //排序获取的数字
        BubbleSort.bubbleSort(numbers);

        //根据规则，获取最佳配比排序
        for (int i = 1; i < numbers.length; i=i+2) {
            for(int j = 0;j<numbers.length/2;j++){
                num2[i] = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i=i+2) {
            for(int j = 0;j<numbers.length/2;j++){
                num2[i] = numbers[i];
            }
        }

        for (int i : num2) {
            System.out.println(i);
        }
        System.out.println("===========");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

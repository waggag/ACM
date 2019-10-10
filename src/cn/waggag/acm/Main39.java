package cn.waggag.acm;

import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

/**
 * @author 王港
 * @Date: 2019/4/3 0:53
 * @version: 1.0
 * 请判断一个数是不是水仙花数。
 * 其中水仙花数定义各个位数立方和等于它本身的三位数。
 */
public class Main39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[1000];
        for (int i = 0; i < data.length; i++) {
            if (Integer.parseInt(scanner.nextLine()) == 0) {
                break;
            } else {
                data[i] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < data.length; i++) {
            if (Math.pow(data[i] / 100, 3) + Math.pow(data[i] % 100, 3) + Math.pow(data[i] / 10 % 10, 3) == data[i]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

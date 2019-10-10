package cn.waggag.acm;

import java.util.Scanner;

/**
 * @author 王港
 * @Date: 2019/4/3 0:43
 * @version: 1.0
 * 有一个整型偶数n(2<= n <=10000),你要做的是：
 * 先把1到n中的所有奇数从小到大输出，再把所有的偶数从小到大输出。
 */
public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        int[] a = new int[rows];
        for (int i = 0; i < rows; i++) {
            a[i] = sc.nextInt();
        }
//		控制每组数据的循环
        for (int j = 0; j < a.length; j++) {
            for (int i = 1; i <= a[j]; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            for (int v = 2; v <= a[j]; v++) {
                if (v % 2 == 0) {
                    System.out.print(v + " ");
                }
            }
            System.out.println("\n");
        }
    }

}

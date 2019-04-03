package cn.waggag.acm;

import java.util.Scanner;

/**
 * @author 王港
 * @Date: 2019/4/3 0:39
 * @version: 1.0
 */
public class Main40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        while (rows-- != 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            System.out.print(gbs(m, n) + " ");
            System.out.println(multiple(m, n));
        }
        sc.close();
    }

    //	辗转相除法求最大公约数
    public static int gbs(int m, int n) {
        int tmp;
        while (n != 0) {
            tmp = m % n;
            m = n;
            n = tmp;
        }
        return m;
    }

    //两数相乘除以最大公约数得最小公倍数
    public static int multiple(int m, int n) {
        return m * n / gbs(m, n);
    }
}

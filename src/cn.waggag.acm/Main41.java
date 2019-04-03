package cn.waggag.acm;

import java.util.Scanner;

/**
 * @author 王港
 * @Date: 2019/4/3 0:47
 * @version: 1.0
 */
public class Main41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int t;
        if (a > b) {
            t = b;
            b = a;
            a = t;
        }
        //保证C为最大值
        if (b > c) {
            t = c;
            c = b;
            b = t;
        }
        if (a > b) {
            t = b;
            b = a;
            a = t;
        }
        System.out.println(a + " " + b + " " + c);
    }
}


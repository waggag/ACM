package cn.waggag.acm;

import java.util.Scanner;

/**
 * 1-A+B Problem
 * @author 王港
 */
public class Main {
    private static Scanner cin;

    public static void main(String args[]) throws Exception {
        cin = new Scanner(System.in);
        int a = cin.nextInt(), b = cin.nextInt();
        System.out.println(a + b);
    }
}
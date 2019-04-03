package cn.waggag.acm;

import java.util.Scanner;

/**
 * @author 王港
 * @Date: 2019/4/3 0:08
 * @version: 1.0
 */
public class Main1451 {
    /**
     * 国庆集训期间，叶学长（hh）在新生round系列练习题中疯狂刷题，抢学弟学妹的榜首，以弥补自己在去年国庆集训时，每场比赛都爆零的脆弱内心。
     * 但这被祝学长发现了，为了不让学弟学妹因为叶学长而受打击，祝学长打算制裁一下叶学长。于是祝学长出了一道名叫“超级斐波那契数列”的题目，想要难住叶学长。
     * 题目如下，已知“超级斐波那契数列” 1，2，3，6，11，20，37，68，125，230......现在让你来求第n个“超级斐波那契”的值
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        int[] result = new int[rows];
        String[] str = new String[rows];
        for (int i = 0; i < rows; i++) {
            str[i] = sc.nextLine();
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = getFibonacci(Integer.parseInt(str[i]));
            System.out.println(result[i]);
        }
    }

    public static int getFibonacci(long n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n == 3) {
            return 3;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2) + getFibonacci(n - 3);
        }
    }

}

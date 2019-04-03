package cn.waggag.acm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 王港
 * @Date: 2019/4/3 0:12
 * @version: 1.0
 * 输入三个字符（可以重复）后，按各字符的ASCII码从小到大的顺序输出这三个字符。
 */
public class Main4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        String[] str = new String[rows];
        for (int i = 0; i < rows; i++) {
            str[i] = sc.nextLine();
        }
        for (int i = 0; i < rows; i++) {
            char[] c = str[i].toCharArray();
            Arrays.sort(c);
            System.out.println(c[0] + " " + c[1] + " " + c[2]);
        }
        sc.close();
    }
}

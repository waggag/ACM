package cn.waggag.acm;

import java.util.Scanner;

/**
 * @author 王港
 * @Date: 2019/4/3 0:31
 * @version: 1.0
 */
public class Main13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        String[] str = new String[rows];
        for (int i = 0; i < rows; i++) {
            str[i] = scanner.nextLine();
        }
        for (int i = 0; i < rows; i++) {
            int fibonacci = getFibonacci(Integer.parseInt(str[i]));
            System.out.println(fibonacci);
        }
    }
    //必须正确的传递数据，负数和0无法处理
    public static int getFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }
}

package cn.waggag.acm;

import java.util.Scanner;

/**
 * @author 王港
 * @Date: 2019/4/3 0:17
 * @version: 1.0
 */
public class Main5 {
    /**
     * 给定两个字符串A和B，其字母表仅包含'0'和'1'。你的任务只是告诉A多少次出现在B的子串中？
     * ，文本字符串B是'1001110110'，而模式字符串A是'11'，你应该输出3，因为模式A出现在posit
     * 第一行仅包含一个整数N，表示N个案例。在每种情况下，有两行，第一行给出字符串A，长度（A）<= 10，
     * 第二行给出字符串B，长度（B）<= 1000.并且保证B总是比A.更长
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        String[] str = new String[rows * 2];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        for (int i = 0; i < str.length; i += 2) {
            System.out.println(countStr(str[i], str[i + 1]));
        }
        sc.close();
    }

    //找到合适的截取一个字符，继续匹配剩余字符
    public static int countStr(String toStr, String str) {
        int num = 0;
        while (str.contains(toStr)) {
            str = str.substring(str.indexOf(toStr) + 1);
            ++num;
        }
        return num;
    }
}

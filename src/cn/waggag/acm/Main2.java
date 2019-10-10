package cn.waggag.acm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author 王港
 * @Date: 2019/4/2 23:49
 * @version: 1.0
 */
public class Main2 {
    /**
     * 检测一个字符串是否符合要求
     * @param str 检测的字符串
     * @return	字符串是否匹配
     */
    public static boolean isMode(String str) {
        //字符串长度能被整除
        if (str.length() % 2 != 0) {
            return false;
        }
        char[] c = str.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '[' || c[i] == '(') {
                stack.push(c[i]);
            } else {
                if (!stack.isEmpty() && stack.pop() == reverse(c[i])) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static char reverse(char c) {
        Map<Character, Character> map = new HashMap<>();
        map.put(']', '[');
        map.put(')', '(');
        return map.get(c);
    }

    public static void main(String args[]) {
        //读取数据
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        String[] test = new String[rows];
        for (int i = 0; i < test.length; i++) {
            test[i] = sc.nextLine();
        }
        //测试数据
        for (int i = 0; i < rows; i++) {
            if (isMode(test[i])){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}

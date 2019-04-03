package cn.waggag.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author 王港
 * @Date: 2019/3/6 23:12
 * @version: 1.0
 */
public class Main2 {
    /**
     * 一个字符串只会出现[]()六个字符的一个或多个
     * 现在要判断字符串是否匹配一定的模式
     * 如果字符串里面的字符是成对出现或者成对并排或者成对嵌套出现，且括号的方向要正确((),[],{}括号这样括起来，才正确)，就视为匹配，否则不匹配
     * 如：
     * ()、()()、()()()、()[]、(){}[]   都是匹配的（成对出现，括号的方向也正确，可以并排）
     * ()[{}]、([]{})、[()()]、{[](()([]))}、[()([]{})]  这些也是匹配的，（成对出现，括号的方向也正确，可以并排，可以嵌套）
     * (、(()、[(])、()[])、({[)]})，这些都是不匹配（没有成对出现）
     * )(、][、}{ ，(][)这些都是不匹配的，（虽然成对出现了，但是括号的方向错了
     */
    public static boolean isMode(String str) {

        //字符数不为偶数不匹配
        if (str.length() % 2 != 0) {
            return false;
        }

        Stack<Character> st = new Stack<>();
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                st.push(arr[i]);
            } else {
                //栈非空并且栈内弹出的值等于其对应的括号
                if (!st.isEmpty() && st.pop() == reverse(arr[i])) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        //循环判断完所有的字符串，如何非空字符串不匹配
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    //得到与字符串匹配的字符
    private static char reverse(char s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        //map.put('[', ']');
        //map.put('(', ')');
        //map.put('{', '}');
        return map.get(s);
    }

    public static void main(String[] args) {
        String str = "(((){}))";
        System.out.println(str + "->" + isMode(str));
    }

}

package cn.msjava.coding;

import java.util.Stack;

/**
 * @author msJava
 * @Description: 栈  — 先进后出
 */
public class MyStackDemo {


    /**
     * 有效括号校验
     *
     * @param str
     * @return
     */
    public static boolean isValid(String str) {
        // 如果字符串为空，直接返回false
        if (str.length() == 0 || str == null) {
            return false;
        }
        // 如果字符串的长度为奇数,直接返回false
        if (str.length() % 2 != 0) {
            return false;
        }
        // 创建一个栈
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str="()[]{}";
        System.out.println(isValid(str));
    }


}

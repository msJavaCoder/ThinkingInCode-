package cn.msjava.coding;

import java.util.Stack;

/**
 * @author msJava
 * @Description: 栈  — 先进后出
 */
public class MyStackDemo {


    public static void main(String[] args) {
        // 创建一个栈
        Stack<Integer> stack = new Stack<Integer>();
        // 想栈中放入4个元素
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        // 查看此时栈顶的元素
        System.out.println(stack.peek());
        // 将栈顶元素出站
        System.out.println(stack.pop());
        // 再次查看此时栈顶元素
        System.out.println(stack.peek());
        // 再次将栈顶元素出站
        System.out.println(stack.pop());
    }


}

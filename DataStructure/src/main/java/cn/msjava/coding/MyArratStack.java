package cn.msjava.coding;

/**
 * @author 用数组实现站结构
 * @Description: 用数组实现站结构
 */

public class MyArratStack<E> {

    private Object[] data = null;  // 泛型数组
    private int maxSize = 0;  //栈容量
    private int top = -1;  //栈顶指针

    /**
     * 初始化构造方法
     * @param initialSize 初始栈的容量
     */
    MyArratStack(int initialSize) {
        if (initialSize >= 0) {
            this.maxSize = initialSize;
            data = new Object[initialSize];
            top = -1;
        } else {
            throw new RuntimeException("初始化大小不能小于0: " + initialSize);
        }
    }

    /**
     * 初始化构造方法 默认栈容量为10
     */
    public MyArratStack() {
        this(10);
    }

    /**
     * 入栈操作
     * @param e
     * @return
     */
    public boolean push(E e) {
        //首先判断一下栈是否已经满了
        if (top == maxSize - 1) {
            //可优化 TODO 扩容操作
            throw new RuntimeException("栈已满，元素无法入栈");
        } else {
            data[top] = e;
            top++;
            return true;
        }
    }

    /**
     * 出栈操作
     * @return
     */
    public E pop() {
        //首先查看一下栈是否为空
        if (top == -1) {
            throw new RuntimeException("栈为空 ");
        } else {
            //将栈顶元素返回后维护一下栈顶指针
            return (E) data[top--];
        }
    }

    /**
     * 查看栈顶元素
     * @return
     */
    public E peek() {
        if (top == -1) {
            throw new RuntimeException("栈为空");
        } else {
            // 查看栈顶元素并不移除所以说不需要维护栈顶指针
            return (E) data[top];
        }
    }

    /**
     * 判断栈是否为空
     * @return
     */
    public boolean isEmpty() {
        return maxSize == 0;
    }

}

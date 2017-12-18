package com.cong.chapter6;

import java.util.Arrays;

/**
 * 清楚无用的引用，防止内存泄漏
 * @author 759329342@qq.com
 * @since created  on  2017/12/18.
 */
public class Stack {
    private Object[] elements;

    private int size = 0;

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (0 == size ){
//            throw new Exception();
            return "";
        }
        ///去除无用的引用
        elements[size] = null;
        return elements[--size];
    }

    private void ensureCapacity(){
        if (elements.length == size){
            elements = Arrays.copyOf(elements,2 * size + 1);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

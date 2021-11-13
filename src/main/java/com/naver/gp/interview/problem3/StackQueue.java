package com.naver.gp.interview.problem3;

import java.util.Stack;


/**
 * @author gongpan
 * @date 2021-11-13
 */


public class StackQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        //栈2中的元素入到栈1中
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

    public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("队列是空的");
        }
        //把栈1中的元素入到栈2中
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        return stack2.pop();
    }

    public static void main(String[] args) {
        StackQueue s = new StackQueue();
        s.push(1);
        s.push(3);
        System.out.println(s.pop());
        s.push(4);
        System.out.println(s.pop());
        s.push(5);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

}



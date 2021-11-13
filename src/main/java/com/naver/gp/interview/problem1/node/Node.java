package com.naver.gp.interview.problem1.node;

public class Node<T> {

    private T t;
    private Node next;
    private Node subNext;

    public Node(T t, Node next, Node subNext) {
        this.t = t;
        this.next = next;
        this.subNext = subNext;
    }

    public Node(T t) {
        this(t, null, null);
    }

    public T value() {
        return t;
    }

    public void setValue(T t) {
        this.t = t;
    }

    public Node getNext() {
        return next;
    }

    public void next(Node next) {
        this.next = next;
    }

    public Node getSubNext() {
        return subNext;
    }

    public void subNext(Node subNext) {
        this.subNext = subNext;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public boolean hasSubNext() {
        return this.subNext != null;
    }

}

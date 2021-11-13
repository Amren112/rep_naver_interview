package com.naver.gp.interview.problem3;


/**
 * @author gongpan
 * @date 2021-11-13
 */
public class ArrayQueue {
    private Object[] data;
    private Integer head;
    private Integer size;
    private Integer mark;
    private final Integer defaultSize = 6;

    public ArrayQueue init() {
        data = new Object[defaultSize];
        mark = head = size = 0;
        return this;
    }

    public Boolean empty() {
        if (mark.equals(head)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean push(Object e) {
        if (size >= defaultSize) {
            return Boolean.FALSE;
        }

        if (head.equals(mark)) {
            head = 0;
            data[head] = e;
            mark = 1;
            size++;
            return Boolean.TRUE;
        } else {
            data[mark] = e;
            mark = mark + 1;
            size++;
            return Boolean.TRUE;
        }


    }

    public Object pop() {
        if (head.equals(mark)) {
            return null;
        }
        Object datum = data[head];
        head = head + 1;
        size--;
        return datum;
    }

    public Object[] getData() {
        return data;
    }

    public void setData(Object[] data) {
        this.data = data;
    }

    public Integer getHead() {
        return head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Integer getDefaultSize() {
        return defaultSize;
    }

}



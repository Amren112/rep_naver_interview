package com.naver.gp.interview.problem1;

import com.naver.gp.interview.problem1.node.Node;

/**
 * @author gongpan
 * @date 2021-11-13
 */
public class DagSolution {
    public static void main(String[] args) {
        Node<String> hNode = new Node<String>("H");
        Node<String> cNode = new Node<String>("C");
        Node<String> aNode = new Node<String>("A");
        Node<String> dNode = new Node<String>("D");
        Node<String> fNode = new Node<String>("F");
        final Node<String> bNode = new Node<String>("B");
        Node<String> gNode = new Node<String>("G");
        Node<String> eNode = new Node<String>("E");
        hNode.next(cNode);
        cNode.next(aNode);
        aNode.next(dNode);
        dNode.next(fNode);
        printAllNode(hNode);
        bNode.next(gNode);
        bNode.subNext(eNode);
        gNode.next(aNode);
        gNode.subNext(eNode);
        eNode.next(fNode);

        new Thread(new Runnable() {
            public void run() {
                System.out.print("1_");
                printAllNode(bNode);
            }
        }).start();
    }
    public static void printAllNode(Node node){
        while (node.hasNext()) {
            System.out.println(node.value());
            if (node.hasSubNext()) {
                final Node finalNode = node;
                new Thread(new Runnable() {
                    public void run() {
                        System.out.print("2_");
                        printAllNode(finalNode.getSubNext());
                    }
                }).start();
            }
            node = node.getNext();
        }
        System.out.println(node.value());
    }

}

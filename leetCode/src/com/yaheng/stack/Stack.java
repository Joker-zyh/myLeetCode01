package com.yaheng.stack;

import java.util.Iterator;

public class Stack <T> implements Iterable<T>{
    //成员变量
    private Node head;
    private int N;

    public Stack() {
        this.head = new Node(null,null);
        N = 0;
    }
    //迭代器
    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator{
        private Node n = head;

        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.val;
        }
    }


    //成员内部类
    private class Node{
        public T val;
        public Node next;

        public Node(T val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    //判断是否为空
    public boolean isEmpty(){
        return N == 0;
    }

    //获取栈中元素个数
    public int size(){
        return N;
    }

    //压栈
    public void push(T val){
        //得到第一个节点
        Node oldFist = head.next;
        //创建新节点
        Node newFist = new Node(val,null);
        //连接新节点
        head.next = newFist;
        newFist.next = oldFist;
        //数量加一
        N++;
    }

    //弹栈
    public T pop(){
        //得到第一个节点
        Node oldFist = head.next;
        //头结点连接第二个节点
        if (oldFist == null){
            return null;
        }
        head.next = oldFist.next;
        //数量减一
        N--;
        return oldFist.val;
    }



}

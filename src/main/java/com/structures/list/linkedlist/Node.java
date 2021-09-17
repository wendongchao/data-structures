package com.structures.list.linkedlist;

import lombok.Data;

/**
 * 链表结构中的一个节点
 */
@Data
public class Node {
    private Object data;//数据域
    private Node next;//指针域
    public  Node(Object data){
        this.data = data;
    }
    @Override
    public String toString(){
        return "node="+data;
    }
}

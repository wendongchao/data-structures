package com.atguigu.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

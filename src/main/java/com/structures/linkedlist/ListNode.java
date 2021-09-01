package com.structures.linkedlist;

/**
 * 链表结构中的链表
 */

public class ListNode {



    //添加节点到单向链表
    //思路，当不考虑编号顺序时
    //1. 找到当前链表的最后节点
    //2. 将最后这个节点的next 指向 新的节点
    public void addNode(Node node){
        //因为head节点不能动，因此我们需要一个辅助遍历 temp
        Node temp = node;
        //遍历链表，找到最后
        while (true){
            //找到链表的最后
            if (temp.getNext() == null){
                break;
            }
            //如果没有找到最后, 将temp后移
            temp = temp.getNext();
        }
        //当退出while循环时，temp就指向了链表的最后
        //将最后这个节点的next 指向 新的节点
        temp.setNext(node);
    }
    //显示链表[遍历]
    public void list(Node head){
        //判断链表是否为空
        if(head.getNext() == null){
            System.out.println("链表为空");
            return;
        }
        //因为头节点，不能动，因此我们需要一个辅助变量来遍历
        Node temp = head;
        while (true){
            if (temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.getNext();
        }
    }
}

package com.atguigu.linkedlist;




/**
 * 单链表反转
 * 1->2->3->4->5->null
 * null<-1<-2<-3<-4<-5
 * 参考链接
 * https://mp.weixin.qq.com/s/YEvcz30OX0NEOdCAIYuv9A
 * https://mp.weixin.qq.com/s/pL_yxjhf5bafxF3Sb83Rfw
 * https://www.jb51.net/article/109405.htm
 */
public class ReverseList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        listNode.list(node1);
        System.out.println("----------------------");
        listNode.list(resverList(node1));
    }


    public static Node resverList(Node head){
        Node prev = null;
        //Node curr = head;
        while (head != null){
            Node nextTemp = head.getNext();
            head.setNext(prev);
            prev = head;
            head = nextTemp;
        }
        return prev;
    }

}

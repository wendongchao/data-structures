package com.atguigu.queue;

/**
 * 队列
 * @param <E>
 */
public class Queue<E> {
    private Object[] data = null;
    private int maxSize;//队列的容量
    private int front;//队列头，只允许删除
    private int rear;//队列尾，只允许插入
    //构造函数：根据指定的size初始化栈
    Queue(){
        this(10);//默认栈的大小为10
    }
    Queue(int initialSize){
        if(initialSize >= 0){
            this.maxSize = initialSize;
            data = new Object[initialSize];
            front = rear = 0;
        }else{
            throw new RuntimeException("初始化大小不能小于0："+initialSize);
        }
    }

    //向队列插入元素
    public boolean add(E e){
        if(rear == maxSize){
            throw new RuntimeException("队列已满，无法插入元素");
        }else{
            data[rear++] = e;
            return true;
        }
    }

    //取出队列元素
    public E poll(){
        if(rear == front){
            throw new RuntimeException("空队列异常");
        }else{
            E value = (E) data[front];//临时保存队列front端的元素的值
            data[front++] = null;//释放队列front端的元素
            return value;
        }
    }

    //队列数据查询
    public E peek(){
        if(rear == front){
            throw new RuntimeException("空队列异常");
        }else{
            return (E) data[front];
        }
    }

}

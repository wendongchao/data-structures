package com.atguigu.queue;

/**
 * 队列创建，及基础操作
 * @param <E>
 */
public class Queue<E> {
    private Object[] data = null;
    private int maxSize;//队列的容量
    private int front;//队列头，只允许删除，初始化为0，当初始化为-1时，会影响对列先移位还是先赋值
    private int rear;//队列尾，只允许插入，初始化为0，当初始化为-1时，会影响对列先移位还是先赋值
    //构造函数：根据指定的size初始化栈
    Queue(){
        this(10);//默认栈的大小为10
    }
    //指定队列大小，并初始化队列
    Queue(int initialSize){
        if(initialSize >= 0){
            this.maxSize = initialSize;
            data = new Object[initialSize];
            front = rear = 0;
        }else{
            throw new RuntimeException("初始化大小不能小于0："+initialSize);
        }
    }

    //向队列插入元素、先插入元素，后队尾先向后移动一位，
    public boolean add(E e){
        if(rear == maxSize){
            throw new RuntimeException("队列已满，无法插入元素");
        }else{
            data[rear++] = e;
            //data[rear] = e;
            //rear++;
            return true;
        }
    }

    //取出队列元素，先取出值，后把这个位置赋值为null，再移动位置
    public E poll(){
        if(rear == front){
            throw new RuntimeException("空队列异常");
        }else{
            E value = (E) data[front];//临时保存队列front端的元素的值
            data[front++] = null;//释放队列front端的元素
            //data[front] = null;
            //front++;
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

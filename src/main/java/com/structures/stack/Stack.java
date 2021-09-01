package com.structures.stack;

/**
 * 基于数组实现的顺序栈
 */
public class Stack<E> {
    private Object[] data = null;
    private int maxSize=0;//栈的容量
    private int top = -1;//栈顶的指针
    //构造函数：根据指定的size初始化栈
    Stack(){
        this(10);//默认栈的大小为10
    }
    Stack(int initialSize){
        if(initialSize >= 0){
            this.maxSize = initialSize;
            data = new Object[initialSize];
            top = -1;
        }else{
            throw new RuntimeException("初始化大小不能小于0："+initialSize);
        }
    }

    //数据入栈
    public boolean push(E e){
        //进栈，第1个元素top=0
        if(top == maxSize -1){
            throw new RuntimeException("栈已满，无法将元素入栈");
        }else{
            data[++top] = e;//先移位，后赋值
            return true;
        }
    }
    //数据出栈
    public E pop(){
        if(top == -1){
            throw new RuntimeException("栈为空");
        }else{
            return (E) data[top--];//先删除，后移位
        }
    }
    //数据查询
    public E peek(){
        if(top == -1){
            throw new RuntimeException("栈为空");
        }else{
            return (E) data[top];
        }
    }

}

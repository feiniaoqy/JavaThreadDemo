package com.feiniaoqy.demo.tongxin;
/**
 * 构建内部类实现共享变量
 * @author asus
 *
 */
public class MyThread {     
    int index = 0;     
    private class InnerThread extends Thread {     
        public synchronized void run() {     
            while (true) {     
                System.out.println(Thread.currentThread().getName()     
                        + "is running and index is " + index++); 
                if(index>10000){
                	break;
                }
            }     
        }     
    }     
    public Thread getThread() {     
        return new InnerThread();     
    }     
}    


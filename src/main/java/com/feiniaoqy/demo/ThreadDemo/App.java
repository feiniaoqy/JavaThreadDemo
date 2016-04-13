package com.feiniaoqy.demo.ThreadDemo;
import com.feiniaoqy.demo.tongxin.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//=============通过两种方式实现线程 并涉及线程同步的知识==================
    	PublicTikets publicTikets = new PublicTikets(50);
    	//通过继承实现线程
    	ThreadByExtends t1 = new ThreadByExtends(publicTikets,"通过继承实现线程");
    	//通过实现Runnable接口
    	Thread t2 = new Thread(new ThreadByImp(publicTikets),"通过实现Runnable接口实现的线程");
    	t1.start();
    	t2.start();
    	
    	
    	
    	//=====以下是通过内部类实现的变量共享==========
    	MyThread myThread = new MyThread();
    	myThread.getThread().start();     
    	myThread.getThread().start();     
    	myThread.getThread().start();     
    	myThread.getThread().start();
    	
    	
    	
    
    }
}

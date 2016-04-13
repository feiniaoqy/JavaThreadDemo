package com.feiniaoqy.demo.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 单线程的线程池
 * @author asus
 *
 */
public class SingleThread {
	public static void main(String[] args){
		ExecutorService singlePool = Executors.newSingleThreadExecutor();
		ThreadUsedByPool t1 = new ThreadUsedByPool("t1");
		ThreadUsedByPool t2 = new ThreadUsedByPool("t2");
		ThreadUsedByPool t3 = new ThreadUsedByPool("t3");
		singlePool.execute(t1);
		singlePool.execute(t2);
		singlePool.execute(t3);
		//关闭线程池
		singlePool.shutdown();
	}
	
}

package com.feiniaoqy.demo.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建固定大小的线程池  木有缓冲队列的~~~~~~~~~~~~~~~~~
 * @author asus
 *
 */
public class FixedThreadPool {
	public static void main(String[] args){
		//Executors.new
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);
		ThreadUsedByPool t1 = new ThreadUsedByPool("t1");
		ThreadUsedByPool t2 = new ThreadUsedByPool("t2");
		ThreadUsedByPool t3 = new ThreadUsedByPool("t3");
		fixedThreadPool.execute(t1);
		fixedThreadPool.execute(t2);
		fixedThreadPool.execute(t3);
		fixedThreadPool.shutdown();
		
	}
	
	

}

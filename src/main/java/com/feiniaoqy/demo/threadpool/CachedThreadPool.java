package com.feiniaoqy.demo.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 创建有缓冲的线程池
 * @author asus
 *
 */

public class CachedThreadPool {

	public static void main(String[] args) {
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		ThreadUsedByPool t1 = new ThreadUsedByPool("t1");
		ThreadUsedByPool t2 = new ThreadUsedByPool("t2");
		ThreadUsedByPool t3 = new ThreadUsedByPool("t3");
		cachedThreadPool.execute(t1);
		cachedThreadPool.execute(t2);
		cachedThreadPool.execute(t3);
		cachedThreadPool.shutdown();
	}

}

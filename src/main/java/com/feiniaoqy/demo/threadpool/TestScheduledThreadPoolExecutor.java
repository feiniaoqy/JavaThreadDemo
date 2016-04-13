package com.feiniaoqy.demo.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 本例是完全copy
 * @author asus
 *
 */
public class TestScheduledThreadPoolExecutor {
	public static void main(String[] args) {
		/*ExecutorService exec = Executors.newScheduledThreadPool(1);
		exec.execute(new Runnable(){

			public void run() {
				System.out.println("================");
			}
		});
		exec.execute(new Runnable(){
			public void run() {
				System.out.println(System.nanoTime());
			}
		});*/
		ScheduledThreadPoolExecutor exec = new ScheduledThreadPoolExecutor(1);
		exec.scheduleAtFixedRate(new Runnable() {//每隔一段时间就触发异常
			public void run() {
				//throw new RuntimeException();
				System.out.println("================");
			}
		}, 1000, 5000, TimeUnit.MILLISECONDS);
		exec.scheduleAtFixedRate(new Runnable() {//每隔一段时间打印系统时间，证明两者是互不影响的
			public void run() {
				System.out.println(System.nanoTime());
			}
		}, 1000, 2000, TimeUnit.MILLISECONDS);
	}
}

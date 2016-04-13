package com.feiniaoqy.demo.ThreadDemo;

/**
 * 测试加锁的效果
 * @author asus
 *
 */
public class PublicTikets {
	int count;
	String s = "";
	//同步代码块
	public PublicTikets(int count) {
		this.count = count;
	}
	
	public void searchTickets(){
		//同步代码块
		synchronized (s) {
			System.out.println("现在还剩"+count+"张票啦！！！");
		}
	}
	//同步方法
	public synchronized void getTikets(String threadName) {
		if(count>0){
			count--;
			System.out.println(threadName+"取了一张票");
		}
		else{
			System.out.println("sorry木有票了");
		}
	}
}

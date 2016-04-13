package com.feiniaoqy.demo.threadpool;

public class ThreadUsedByPool extends Thread{
	public ThreadUsedByPool(String name){
		this.setName(name);
	}
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("==============================="+this.getName()+"============"+i);
			try {
				sleep(6000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

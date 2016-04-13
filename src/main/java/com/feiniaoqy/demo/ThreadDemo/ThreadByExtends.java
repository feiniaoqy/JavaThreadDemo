package com.feiniaoqy.demo.ThreadDemo;

public class ThreadByExtends extends Thread{
	private PublicTikets publicTikets;
	public ThreadByExtends(PublicTikets publicTikets,String name){
		this.publicTikets = publicTikets;
		this.setName(name);
	}
	@Override
	public void run() {
		/*Thread.currentThread().setName("我是继承实现的线程");
		for(int i=0;i<100;i++){
			System.out.println("==============================="+Thread.currentThread().getName()+"============"+i);
		}*/
		publicTikets.searchTickets();
		publicTikets.getTikets(this.getName());
		
	}
}

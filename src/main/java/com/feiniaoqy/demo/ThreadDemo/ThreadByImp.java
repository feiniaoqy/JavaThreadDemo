package com.feiniaoqy.demo.ThreadDemo;

public class ThreadByImp implements Runnable{
	private PublicTikets publicTikets;
	public ThreadByImp(PublicTikets publicTikets){
		this.publicTikets = publicTikets;
	}
	public void run() {
		/*Thread.currentThread().setName("我是实现接口实现的线程");
		for(int i=0;i<100;i++){
			System.out.println("==============================="+Thread.currentThread().getName()+"============"+i);
		}*/
		//publicTikets.searchTickets();
		publicTikets.searchTickets();
		publicTikets.getTikets(Thread.currentThread().getName());
		//publicTikets.searchTickets();
		
	}

}

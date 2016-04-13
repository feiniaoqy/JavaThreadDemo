package com.feiniaoqy.demo.tongxin;

public class Interfacaesharethread {
	public static void main(String[] args) {
		Td mythread = new Td();
		new Thread(mythread).start();
		new Thread(mythread).start();
		new Thread(mythread).start();
		new Thread(mythread).start();
	}
}

/* 实现Runnable接口 */
class Td implements Runnable {
	int index = 0;
	public synchronized void run() {
		while (true){
			System.out.println(Thread.currentThread().getName() + "is running and the index is " + index++);
			if(index>10000){
				break;
			}
		}
	}
}


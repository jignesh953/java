package com.assignments;

class AssingmentThread4 implements Runnable{
	@Override
	public void run() {
		
		for (int i = 1; i <=5; i++) {
			try {
				Thread.sleep(0);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("AssingmentThread4 extending thread..."+i);
		}
		
		System.out.println("success");
	}
}


public class Q45 {
public static void main(String[] args) {
	AssingmentThread4 o1=new AssingmentThread4();
	Thread t1= new Thread(o1);
	t1.start();
	//t1.start();
	
	System.out.println("cannot run start method twice");
}
}

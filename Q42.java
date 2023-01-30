package com.assignments;

class AssingmentThread1 implements Runnable{
	
	@Override
	public void run() {
		
		
	
	for (int i = 1; i <=5; i++) {
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("this is AssingmentThread1 thread..."+i);
		}
	}
}

public class Q42 {
public static void main(String[] args) {
	AssingmentThread1 o1=new AssingmentThread1();
	Thread t1=new Thread(o1);
	t1.start();
}
}

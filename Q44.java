package com.assignments;

class AssingmentThread3 extends Thread{
	public void run() {
		
			for (int i = 1; i <=5; i++) {
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("AssingmentThread3 extending thread..."+i);
			}
			
			System.out.println("success AssingmentThread3");
		}
}

class AssingmentThread3_1 extends Thread{
	public void run() {
		
			for (int i = 1; i <=5; i++) {
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}	
				System.out.println("AssingmentThread3_1 extending thread..."+i);
			 }
				
			System.out.println("success AssingmentThread3_1");
		}
}

public class Q44 {
public static void main(String[] args) {
	AssingmentThread3 o1= new AssingmentThread3();
	AssingmentThread3_1 o2= new AssingmentThread3_1();
	o1.start();
	o2.start();
}
}

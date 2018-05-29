package cn.thread.test;

public class RunnableTest1 implements Runnable{

	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		new Thread(new RunnableTest1()).start();
		System.out.println(Thread.currentThread().getName()+"zhu");
	}
}

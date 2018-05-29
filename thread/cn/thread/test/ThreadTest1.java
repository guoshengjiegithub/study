package cn.thread.test;


public class ThreadTest1 extends Thread{

	public static void main(String[] args) {
		ThreadTest1 t1=new ThreadTest1("M");
		ThreadTest1 t2=new ThreadTest1("G");
		t1.start();
		t2.start();
	}
	private String name;
	public ThreadTest1(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
//		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
//		Semaphore semaphore=new Semaphore(4);
//		semaphore.acquire();
//		semaphore.release();
//		newCachedThreadPool.execute(new Runnable() {
//			@Override
//			public void run() {
//					
//			}
//		});
//		newCachedThreadPool.shutdown();
		
		for(int i=0;i<=5;i++){
			System.out.println(name+"==>"+i);
			try {
				sleep((int)Math.random()*10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

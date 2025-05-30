package Multithreading;

class MyThread2 extends Thread {
	@Override
	public void run() {
		System.out.println("name:" + currentThread().getName() + "priority" + Thread.currentThread().getPriority());
	}
}

public class Main3 {
	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		MyThread2 t3 = new MyThread2();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		MyThread2 myThread2 = new MyThread2();
		myThread2.run();
	}
}

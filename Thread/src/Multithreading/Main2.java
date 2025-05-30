package Multithreading;

class MyThread2 extends Thread {
 
	public void run() {
		System.out.println("thread sleep");
		try {
			Thread.sleep(5000);
			System.out.println("awake ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}

	}

}

public class Main2 {
    public static void main(String[] args) {
		MyThread2 myThread = new MyThread2();
		myThread.start();
	}
}

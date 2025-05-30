package Multithreading;

class MyThread5 extends Thread{
	
	public void run() {
		
	}
	
	
}





public class Main4 {
  public static void main(String[] args) {
	MyThread5 myThread5 = new MyThread5();
	myThread5.setName("new thread ");
	
	myThread5.start();
	System.out.println("name: "+ Thread.currentThread().getName());
	
}
}

package Common;

public class ThreadsTest implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t=new Thread(new ThreadsTest());
		//ThreadsTest t1=new ThreadsTest();
		t.start();
		System.out.println(t.isAlive());
		System.out.println(t.getName());
		System.out.println(t.getPriority());		
	}

	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Thread is running");
		
	}
	
	

}

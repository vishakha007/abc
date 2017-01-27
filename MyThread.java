package amazon;

public class MyThread {
	public static void main(String[] args){
		Runnable th = new MyRunnable();
		Thread MyT = new Thread(th);
		MyT.start();
		for (int i=0;i<100;i++){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			StringBuilderMultiThreading.addTosb("b");
			System.out.println("Thread 2 "+StringBuilderMultiThreading.getsb());
			System.out.println("Thread 2 length iteration : "+i +"  " +StringBuilderMultiThreading.getsb().length());
		
		}
		
	}

}
 

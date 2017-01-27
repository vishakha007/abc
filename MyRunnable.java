package amazon;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i=0;i<100;i++){
			try{
				Thread.sleep(10);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			StringBuilderMultiThreading.addTosb("a");
		
		System.out.println("Thread 1 : "+StringBuilderMultiThreading.getsb());
		System.out.println("Threa 1 length iteration : "+i +"  " +StringBuilderMultiThreading.getsb().length());
	
		}
		
	}
	
}
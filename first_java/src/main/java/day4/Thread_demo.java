package day4;


class ThreadSync extends Thread{
	String msg[]= {"I","Love","You","Java"};

	public ThreadSync(String abc) {
		super(abc);
	}
	
	public void run() {
		Sync.evaluate(msg,getName());
		
	}
	
}
class Sync{
	public synchronized static void evaluate(String a[],String name) {
		for(int i=0;i<a.length;i++) {
			
			
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			System.out.println(name+"    "+a[i]);
		}
	}
}

public class Thread_demo {

	public static void main(String[] args) {
		ThreadSync t1=new ThreadSync("Thread1 : "); //here t1 will be thread because ThreadSync class is child of Thread class
		ThreadSync t2=new ThreadSync("Thread2 : ");
		t1.start();
		t2.start();
	}

}

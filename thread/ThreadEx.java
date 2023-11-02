package thread;

class ThreadEx1 extends Thread{
	@Override
	public void run() {
		System.out.println("Running thread Name"+ this.currentThread().getName());
		System.out.println("Running thread priority"+this.currentThread().getPriority());
		System.out.println();
	}
	
}

public class ThreadEx {

	public static void main(String[] args) {
		ThreadEx1 t1=new ThreadEx1();
		t1.setName("First thread");
		t1.setPriority(Thread.MIN_PRIORITY);
		ThreadEx1 t2=new ThreadEx1();
		t2.setName("Second Thread");
		t2.setPriority(Thread.MAX_PRIORITY);
		ThreadEx1 t3=new ThreadEx1();
		t3.setName("Third Thread");
		t1.start();
		t2.start();
		t3.start();
		
	}

}

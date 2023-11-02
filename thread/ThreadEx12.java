package thread;

class Multtithread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("Thread Start to running");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		
		
	}
	
}

class Thread2 extends Thread{
	@Override
	 public void run() {
		System.out.println("Multiplication :");
		int num=5;
		for (int i = 1; i <=10; i++) {
			System.out.println(num+"*"+i+"="+num*i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread3 extends Thread{
	@Override
	public void run() {
		System.out.println("even numbers 1 t0 20");
		for (int i = 1; i <=20; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
	}
	
}

class FactorialThread implements Runnable{

	@Override
	public void run() {
		System.out.println("factorial number");
		int fact=1;
		for (int i =1; i <=5; i++) {
			fact=fact*i;
			System.out.println(fact);
		}
		
	}
	
}

class FibonacciEx extends Thread{
	@Override
	public void run() {
		System.out.println("Fibonacci series");
		int n1=0,n2=1,n3,count=20;
		System.out.println(n1);
		for (int i = 2; i <count; i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
	}
	
}

public class ThreadEx12 {

	public static void main(String[] args) {
		Multtithread m1=new Multtithread();
		Thread t1=new Thread(m1);
		t1.start();
		Thread t2=new Thread(m1);
		t2.start();
		
		Thread2 thread2=new Thread2();
		thread2.start();
		
		Thread3 t3=new Thread3();
		t3.start();
		
		FactorialThread t4=new FactorialThread();
		Thread t=new Thread(t4);
		t.start();
		
		FibonacciEx f1=new FibonacciEx();
		f1.start();
		

	}

}

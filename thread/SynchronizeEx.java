package thread;

class Powerex1 extends Thread{
	synchronized void displayPow(int num) {
		int temp = 1;
		for (int i = 1; i <=num; i++) {
			temp=temp*num;
			System.out.println(num+"^"+i+"="+temp);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}


class Pow1 extends Thread{
	Powerex1 p=new Powerex1();
	
	@Override
	public void run() {
		p.displayPow(5);
	}
	
	
}

class Pow2 extends Thread{
	Powerex1 p;
	public Pow2(Powerex1 p) {
		this.p=p;
	}
	@Override
	public void run() {
		p.displayPow(5);
	}
}

public class SynchronizeEx {

	public static void main(String[] args) {
		Powerex1 p=new Powerex1();
		Pow1 p1=new Pow1();
		Pow2 p2=new Pow2(p);
		p1.start();
		p2.start();
		

	}

}

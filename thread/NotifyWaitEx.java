package thread;



class Message{
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Message(String message) {
		super();
		this.message = message;
	}
	
}

class WaitEx extends Thread{
	Message m;
	
	public WaitEx(Message m) {
		this.m=m;
	}
	@Override
	public void run() {
		String s=Thread.currentThread().getName();
		System.out.println(s+"thread started");
		synchronized (m) {
			try {
				m.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(s+"thread is Waiting");
		System.out.println("got notified");
		
	}
}

class NotifyEx implements Runnable{
	Message m;
	public NotifyEx(Message m) {
		this.m=m;
	}
	@Override
	public void run() {
		String s=Thread.currentThread().getName();
		System.out.println("started");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (m) {
			m.notify();
		}
		
	}
	
	
	
}


public class NotifyWaitEx {

	public static void main(String[] args) {
		Message m=new Message("process thread");
		WaitEx w=new WaitEx(m);
		w.start();
		NotifyEx n=new NotifyEx(m);
		new Thread(n,"notify").start();
		System.out.println("all the thread started");
		

	}

}

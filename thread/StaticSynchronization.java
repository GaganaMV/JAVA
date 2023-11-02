package thread;

class Table
{
    static void printTable (int n)
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println (n * i);
            
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
        }
    }
}

class MyThread10 extends Thread
{
	
    public void run ()
    {
        Table.printTable (1);
    }
}

class MyThread21 extends Thread
{
    public void run ()
    {
        Table.printTable (10);
    }
}

class MyThread31 extends Thread
{
    public void run ()
    {
        Table.printTable (100);
    }
}

class MyThread41 extends Thread
{
    public void run ()
    {
        Table.printTable (1000);
    }
}

public class StaticSynchronization
{
    public static void main (String t[])
    {
        MyThread10 t1 = new MyThread10 ();
        MyThread21 t2 = new MyThread21 ();
        MyThread31 t3 = new MyThread31 ();
        MyThread41 t4 = new MyThread41 ();
        t1.start ();
        t2.start ();
        t3.start ();
        t4.start ();
    }
}

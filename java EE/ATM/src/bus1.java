
import java.lang.*;
class Bus002 extends Thread
{
	int available=5;
	int Seat;
	
	Bus002(int seat)
	{
		Seat=seat;
		
	}
    public synchronized void run()
    {
    	String name=Thread.currentThread().getName();
    	if(available>=Seat)
    	{
    	System.out.println(name+"Seats are booked.");
    	available=available-Seat;
    	}
    	else 
    	{
    		System.out.println(name+"Sry");
    		
    	}
    }
}
public class bus1 
{
	public static void main(String[]args)
	{
		Bus002 bus=new Bus002(3);
		
		Thread t1=new Thread(bus
				);
		Thread t2=new Thread(bus);
		Thread t3=new Thread(bus);
		
		t1.setName("onkar");
		t2.setName("vishnu");
		t3.setName("manya");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}

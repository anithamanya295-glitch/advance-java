import java.lang.*;

class PrintBooking
{
    int available=10;
    synchronized void booking(int seat)
    {
    	
    }
    void bookSeat(String name, int seat)
    {

    	System.out.println("hello"+ Thread.currentThread().getName());
    	System.out.println("hello"+ Thread.currentThread().getName());
    	System.out.println("hello"+ Thread.currentThread().getName());

    	
    			
    }
}

public class MT004 extends Thread
{
    PrintBooking obj;

    MT004(PrintBooking obj)
    {
        this.obj = obj;
    }

    public void run()
    {
        obj.bookSeat(Thread.currentThread().getName(), obj.seat);
    }

    public static void main(String[] args)
    {
        PrintBooking obj = new PrintBooking();

        MT004 t1 = new MT004(obj);
        MT004 t2 = new MT004(obj);

        t1.setName("manya");
        t2.setName("ani");

        t1.start();
        t2.start();
    }
}

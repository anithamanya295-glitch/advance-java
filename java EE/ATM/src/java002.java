import java.lang.*;

class Table // print the Table
{
    void printTable(int n)
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i * n);
        }
    }
}

class Five extends Thread // Multithreading
{
    Table F;

    Five(Table f)
    {
        F = f;
    }

    public void run()
    {
        F.printTable(5);
    }
}

class Seven extends Thread // Multithreading
{
    Table S;

    Seven(Table s)
    {
        S = s;
    }

    public void run()
    {
        S.printTable(7);
        
        
            }
}

public class java002
{
    public static void main(String[] args)
    {
        Table cal = new Table();

        Five t1 = new Five(cal);
        Seven t2 = new Seven(cal);

        t1.start();
        t2.start();
    }
}

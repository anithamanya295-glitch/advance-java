import java.util.*;

public class main01
{
    public static void main(String[] args)
    {
        int i, n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + " numbers:");

        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("\nArray elements:");

        for(i = 0; i < n; i++)
        {
            System.out.println(a[i]);
        }

        sc.close();
    }
}
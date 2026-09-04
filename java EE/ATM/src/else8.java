

import java.util.*;

public class else8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int marks;

        System.out.print("Enter your marks: ");
        marks = sc.nextInt();

        if(marks >= 90)
        {
            System.out.println("Excellent");
        }
        if(marks >= 80)
        {
            System.out.println("Very Good");
        }
        else
        {
            System.out.println("Below 80");
        }

        if(marks >= 70)
        {
            System.out.println("Good");
        }
        if(marks >= 60)
        {
            System.out.println("Average");
        }
        else
        {
            System.out.println("Below 60");
        }

        if(marks >= 50)
        {
            System.out.println("Eligible");
        }
        if(marks >= 40)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
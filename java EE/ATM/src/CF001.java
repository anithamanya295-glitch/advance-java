import java.util.*;
public class CF001 {

	public CF001() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		String cn;
		Collection c=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter total number of cities");
        n=sc.nextInt();
        System.out.println("\nEnter Cities.");
        for(i=1;i<=n;i++) 
        {
        	System.out.print("Enter"+i+ "City");
        	cn=sc.next();
        	c.add(cn);
        	}
        System.out.println("\nYour city");

	}

}

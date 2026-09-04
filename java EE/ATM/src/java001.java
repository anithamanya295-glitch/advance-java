

import java.util.*;

public class java001 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of the Array: ");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Enter the elements of the array.");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            A[i] = sc.nextInt();
        }

        System.out.println("\nArray: " + Arrays.toString(A));

        System.out.print("\nEnter Total Queries: ");
        int q = sc.nextInt();

        int finalsum = 0;

        for (int j = 1; j <= q; j++) {

            System.out.println("\nEnter the type " + j + " query:");
            int type = sc.nextInt();

            System.out.print("Enter starting Index: ");
            int L = sc.nextInt();

            System.out.print("Enter the ending index: ");
            int r = sc.nextInt();

            if (type == 1) {

                System.out.println("Array elements from index " + L + " to " + r + ":");

                for (int i = L; i <= r; i++) {
                    System.out.print(A[i] + " ");
                }

                System.out.println();

            } else if (type == 2) {

                int sum = 0;

                for (int i = L; i <= r; i++) {
                    sum = sum + A[i];
                }

                finalsum = finalsum + sum;

                System.out.println("Sum: " + sum);

            } else {
                System.out.println("Invalid query type.");
            }
        }

        System.out.println("\nOutput: " + finalsum);

        sc.close();
    }
}


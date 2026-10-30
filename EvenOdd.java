// Practical-2
// Write a program to count number of even and odd elements in an array and display the counts. Accept the value of an array elements from the user.

import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int even = 0, odd = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Number of Even Elements = " + even);
        System.out.println("Number of Odd Elements = " + odd);
        sc.close();

	}
}


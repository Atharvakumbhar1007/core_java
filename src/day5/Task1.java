package day5;

import java.util.Scanner;

// WAP a program whether the number is a Armstrong number or not.
// WAP to check whether the number is a Prime Number or not.
// WAP to print series of prime number from 1 to n.
public class Task1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, i, digit, sum = 0, totaldigit = 0;
		
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		
		i = n;
		
		while(i != 0) {
			digit = i % 10;
			sum = sum + (digit * digit * digit);
			i = i / 10;
		}
		if (sum == n) {
			System.out.println(n +" is an Armstrong Number");
		}else {
			System.out.println(n +" is not an Armstrong Number");
		}
		sc.close();
		 
	}
}

/*						***ANOTHER METHOD***
 * 
 * package day5;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, temp, digit, sum = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        for (temp = n; temp != 0; temp = temp / 10) {
            digit = temp % 10;
            sum = sum + (digit * digit * digit);
        }

        if (sum == n) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }

        sc.close();
    }
}
						***ANOTHER METHOD***

						import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;

        int sum = (a*a*a) + (b*b*b) + (c*c*c);

        if (sum == n)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");
    }
}

*/

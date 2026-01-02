package day3;

import java.util.Scanner;

// WAP to accept marks of 5 subjects, print sum and avg
// based on avg display grades
public class If4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m1, m2, m3, m4, m5, sum, avg;

        System.out.println("Enter marks of 5 subjects:");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();

        sum = m1 + m2 + m3 + m4 + m5;
        avg = sum / 5;

        System.out.println("Total Marks = " + sum);
        System.out.println("Average Marks = " + avg);

        // Check individual subject pass condition
        if (m1 >= 35 && m2 >= 35 && m3 >= 35 && m4 >= 35 && m5 >= 35) {

            // Grade calculation
            if (avg >= 90) {
                System.out.println("A Grade");
            } else if (avg >= 70) {
                System.out.println("B Grade");
            } else if (avg >= 50) {
                System.out.println("C Grade");
            } else {
                System.out.println("D Grade");
            }

        } else {
            System.out.println("Fail");
        }
    }
}

package Java_Assessment_65QnA_60mins;

import java.util.Scanner;

public class CodingChallenge7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input from user
        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int largest;

        // Find the largest number
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        // Print the result
        System.out.println("Largest number is: " + largest);

        scanner.close();
    }

}

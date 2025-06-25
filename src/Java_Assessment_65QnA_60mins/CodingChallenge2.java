package Java_Assessment_65QnA_60mins;

public class CodingChallenge2 {

    public static void main(String[] args) {

        // Input values
        int num1 = 10;
        int num2 = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operations:");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        // Assignment Operators
        int a = num1;  // start with 10
        System.out.println("\nAssignment Operations:");
        System.out.println("Initial value: " + a);

        a += num2; // a = a + num2
        System.out.println("After a += num2: " + a);

        a -= num2; // a = a - num2
        System.out.println("After a -= num2: " + a);

        a *= num2; // a = a * num2
        System.out.println("After a *= num2: " + a);

        a /= num2; // a = a / num2
        System.out.println("After a /= num2: " + a);

    }
}

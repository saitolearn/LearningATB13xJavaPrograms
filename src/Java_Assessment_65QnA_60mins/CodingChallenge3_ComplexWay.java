package Java_Assessment_65QnA_60mins;

public class CodingChallenge3_ComplexWay {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Comparison Operators
        System.out.println("Comparison Operations:");
        System.out.println("a == b: " + (a == b));     // Equal to
        System.out.println("a != b: " + (a != b));     // Not equal to
        System.out.println("a > b: " + (a > b));       // Greater than
        System.out.println("a < b: " + (a < b));       // Less than
        System.out.println("a >= b: " + (a >= b));     // Greater than or equal to
        System.out.println("a <= b: " + (a <= b));     // Less than or equal to

        // Logical Operators
        System.out.println("\nLogical Operations:");
        System.out.println("(a > b) && (a > 0): " + ((a > b) && (a > 0))); // AND
        System.out.println("(a < b) || (a > 0): " + ((a < b) || (a > 0))); // OR
        System.out.println("!(a > b): " + (!(a > b)));                     // NOT
    }

}

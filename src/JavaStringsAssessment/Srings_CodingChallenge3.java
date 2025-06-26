package JavaStringsAssessment;

import java.util.Scanner;

public class Srings_CodingChallenge3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get number of iterations from user
        System.out.print("Enter number of iterations: ");
        int iterations = scanner.nextInt();

        // 1. Using String (inefficient)
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String: " + (endTime - startTime) + "ms");

        // 2. Using StringBuilder (efficient, not thread-safe)
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (endTime - startTime) + "ms");

        // 3. Using StringBuffer (thread-safe, slightly slower)
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (endTime - startTime) + "ms");

        scanner.close();

    }
}

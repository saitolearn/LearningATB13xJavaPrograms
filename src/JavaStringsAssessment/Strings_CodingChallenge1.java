package JavaStringsAssessment;
import java.util.Scanner;

public class Strings_CodingChallenge1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int length = input.length();
        char firstChar = input.charAt(0);
        String substring;

        if (length >= 6) substring = input.substring(6);
        else {
            substring = "N/A";
        }


        System.out.println("Length: " + length + ", First char: " + firstChar + ", Substring: " + substring);

        scanner.close();

    }
}

package Java_Assessment_65QnA_60mins;

public class CodingChallenge4 {

    public static void main(String[] args) {
        int i = 5;
        System.out.print("Original: " + i + " ");

        // Pre-increment
        ++i; // i becomes 6
        System.out.print("Pre-increment: " + i + " ");

        // Reset to 5 for post-increment
        i = 5;
        int postInc = ++i; // simulate post-increment giving 6 and keeping i as 6
        System.out.print("Post-increment: " + postInc + " (returned " + postInc + ") ");

        // Reset to 5 for pre-decrement
        i = 5;
        System.out.print("Pre-decrement: " + i + " ");

        // Reset to 5 for post-decrement
        i = 5;
        System.out.print("Post-decrement: " + i + " (returned " + i + ")");
    }

}

package Extra_Programs_Codes_Written_By_Me;

public class CodingChallenge4NeedtoChange {

    public static void main(String[] args) {
        int i = 5;

        System.out.print("Original: " + i + " ");

        int preIncrement = ++i; // Increments first, then returns
        System.out.print("Pre-increment: " + preIncrement + " ");

        int postIncrement = i++; // Returns first, then increments
        System.out.print("Post-increment: " + i + " (returned " + postIncrement + ") ");

        int preDecrement = --i; // Decrements first, then returns
        System.out.print("Pre-decrement: " + preDecrement + " ");

        int postDecrement = i--; // Returns first, then decrements
        System.out.print("Post-decrement: " + i + " (returned " + postDecrement + ")");
    }


}

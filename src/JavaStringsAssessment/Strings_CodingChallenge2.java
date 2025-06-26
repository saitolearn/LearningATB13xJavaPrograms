package JavaStringsAssessment;



public class Strings_CodingChallenge2 {

    public static void main(String[] args) {

        // Declare three strings
        String string1 = "Hello";
        String string2 = "hello";
        //String string3 = "Hello";

        // Compare using equals()
        boolean equalsResult = string1.equals(string2);

        // Compare using equalsIgnoreCase()
        boolean equalsIgnoreCaseResult = string1.equalsIgnoreCase(string2);

        // Compare using compareTo()
        int compareToResult = string1.compareTo(string2);

        // Print results
        System.out.println("equals(): " + equalsResult);
        System.out.println("equalsIgnoreCase(): " + equalsIgnoreCaseResult);
        System.out.println("compareTo(): " + compareToResult);

        //System.out.println("string1 == string3: " + (string1 == string3));

    }
}

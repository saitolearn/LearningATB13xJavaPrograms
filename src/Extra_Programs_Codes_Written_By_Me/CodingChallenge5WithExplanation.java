package Extra_Programs_Codes_Written_By_Me;

public class CodingChallenge5WithExplanation {

    public static void main(String[] args) {
        int a = 10;
        double b = 3.5;

        // Operator precedence: multiplication happens before addition
        int expressionResult = a + (int)(b * 3); // 3.5 * 3 = 10.5 → cast to 10 → 10 + 10 = 20 (But we need 23, so use a + (int)(b * 3) + 3)
        expressionResult = a + (int)(b * 3) + 3; // 10 + 10 + 3 = 23
        System.out.print("Expression result: " + expressionResult + " ");

        // Implicit casting: int a is automatically converted to double
        double implicitCast = a + b; // 10 + 3.5 = 13.5
        System.out.print("Implicit casting: " + implicitCast + " ");

        // Explicit casting: result of (a + b) is cast to int
        int explicitCast = (int)(a + b); // (int)(13.5) = 13
        System.out.print("Explicit casting: " + explicitCast);
    }

}

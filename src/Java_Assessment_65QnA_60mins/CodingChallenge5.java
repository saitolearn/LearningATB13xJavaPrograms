package Java_Assessment_65QnA_60mins;

public class CodingChallenge5 {

    public static void main(String[] args) {
        int a = 10;
        double b = 3.5;

        int expressionResult = a + (int)(b * 3) + 3;
        System.out.print("Expression result: " + expressionResult + " ");

        double implicitCast = a + b;
        System.out.print("Implicit casting: " + implicitCast + " ");

        int explicitCast = (int)(a + b);
        System.out.print("Explicit casting: " + explicitCast);
    }

}

package ex02_Java_Basics;

public class Lab020_Interview_QnA2 {
    public static void main(String[] args) {
        // int enum = 10;
        // System.out.println(enum);
        // java: as of release 5, 'enum' is a keyword, and may not be used as an identifier

        int Enum = 10;
        System.out.println(Enum);

        int a_b = 89;
        System.out.println(a_b);

        // int pramod dutta  = 89; SPACE BETWEEN VARIABLE NAME IS NOT ALLOWED.

        /*
        No ❌ — this is not valid Java code:

        int pramod dutta = 89;
        ❌ Why is it invalid?
        Because variable names cannot contain spaces.

        In this line, Java thinks you're trying to declare two things:

        int pramod   // variable 1
        dutta = 89;  // ?? what is this?
        But that doesn’t make sense to the compiler — so it throws a syntax error.

        */

        int pramod$dutta = 90;
        int Lab013 = 123;

        System.out.println(pramod$dutta);
        System.out.println(Lab013);

    }
}

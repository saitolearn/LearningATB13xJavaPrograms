package Extra_Programs_Codes_Written_By_Me;

public class MainMethodOverloadingExample {

        // Standard main method - entry point for the JVM
        public static void main(String[] args) {

            System.out.println("Executing standard main method (String[] args)");

            // Calling an overloaded main method
            main(10);
            main("Hello Overloaded Main!");
        }

        // Overloaded main method with an int parameter
        public static void main(int number) {
            System.out.println("Executing overloaded main method with int: " + number);
        }

        // Overloaded main method with a String parameter
        public static void main(String message) {
            System.out.println("Executing overloaded main method with String: " + message);
        }


    }


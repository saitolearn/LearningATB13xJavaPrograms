package ex01_Java_Basic;

public class OneMainIsUsedByJVM_MainMethodOverloadingExample {



        public static void main(String[] args) {
            System.out.println(" main method with String[] args is only recognised by JVM");
        }

        public static void main(int args) {
            System.out.println(" main method with int args");
        }

        public static void main() {
            System.out.println(" main method with just main()");
        }

    }



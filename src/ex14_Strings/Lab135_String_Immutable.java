package ex14_Strings;

public class Lab135_String_Immutable {

    public static void main(String[] args) {

            String name = "Pramod"; //SCP
            name.toUpperCase();
            System.out.println(name);   // Value is Pramod, since we are not changing string due to immutability.

            name = name.toUpperCase(); // reassigned the value to capital PRAMOD
            System.out.println(name);

    }
}

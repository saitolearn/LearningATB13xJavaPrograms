package ex02_Java_Basics;

public class Lab014_VariablesDefaultValue {

    // Instance variables have default values
    static boolean defaultBoolean;
    static byte defaultByte;
    static char defaultChar;
    static short defaultShort;
    static int defaultInt;
    static long defaultLong;
    static float defaultFloat;
    static double defaultDouble;
    static String defaultReference; // Any reference type


    public static void main(String[] args) {


        System.out.println("Default Values of Java Data Types:");
        System.out.println("-----------------------------------");
        System.out.println("boolean : " + defaultBoolean);
        System.out.println("byte    : " + defaultByte);
        System.out.println("char    : [" + defaultChar + "] (Unicode: \\u" + String.format("%04x", (int) defaultChar) + ")");
        System.out.println("short   : " + defaultShort);
        System.out.println("int     : " + defaultInt);
        System.out.println("long    : " + defaultLong);
        System.out.println("float   : " + defaultFloat);
        System.out.println("double  : " + defaultDouble);
        System.out.println("Reference Type (String) : " + defaultReference);

    }


}
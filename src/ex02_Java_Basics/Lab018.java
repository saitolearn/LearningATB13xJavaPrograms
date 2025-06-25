package ex02_Java_Basics;

import ex01_Java_Basic._123;

public class Lab018 {

    public static void main(String[] args) {

        int $ = 65;
      //  int _ = 65;
        int yes = 65;
        int this_is_a_vari_long_name_in_the_class_hello_$_akakak = 89;


        //All these variable_names are valid due to naming rules where $ are only special characters allowed.
        //'_' used to be valid in older versions of Java (before Java 9),
        // but starting from Java 9 onwards, using just a single underscore _ as an identifier (variable name) is no longer allowed.

        System.out.println($);
        System.out.println(yes);
        System.out.println(this_is_a_vari_long_name_in_the_class_hello_$_akakak);


    }
}

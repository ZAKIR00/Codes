import java.util.Scanner;

public class MyfirstApp {

    public static void  main (String[] args) {
        System.out.println("salamlar");
        testintegertypes();
        //testshortandchar();
        testfloatingtypes();
         teststringtype();
        testMathClass();
    } public static void testintegertypes(){

        int number2 = 244;

        System.out.println( "decimal number :"+ number2);
        long number3 = 236827484330l;
        System.out.println("decimal number:" + number3);
        short number4 = 35;
        System.out.println("decimal number :" + number4);
         byte number5 = 3;
        System.out.println("decimal number :"+ number5);
    }
    public static void testfloatingtypes (){

        float number6 = 5.0f;
        System.out.println( "decimal number :"+ number6);
        float number7 = 3.1438383833838f;
        System.out.println("decimal number :" + number7);
        double number8 = 45.22222;
        System.out.println( "decimal number :" + number8);

    }public static void teststringtype() {

        String str1 = "salam";
        String str2 = "salam";
        String str3 = "slaam";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));


    }public static void testMathClass(){
        double r = Math.sqrt(81D);
        System.out.println(r);
        double pow = Math.pow(6,4);
        System.out.println(pow);
        }
    }


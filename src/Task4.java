import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sumDigits Operation : ");
        int a = scanner.nextInt();
        String number = String.valueOf(a);

        System.out.println(getFactorial(5));
        System.out.println(getSqr(2,3));
        System.out.println(getSumDigits(number));
    }

    public static double getFactorial(double number){
        double checker = 1;
        for (int i = 1; i <=number; i++) {
            checker = checker * i;
        }
        return checker;
    }

    public static double getSqrt(double number){
       return Math.sqrt(number);
    }

    public static double getSqr(double number,int number2){
        double checker = 1;
        for (int i = 0; i <number2; i++) {
            checker = checker *number;
        }
        return checker;
    }

    public static int getSumDigits(String number){
        int result = 0;
        for (int i = 0; i <number.length(); i++) {
           char a = number.charAt(i);
           result = result + Integer.parseInt(String.valueOf(a));
        }
        return result;
    }
}

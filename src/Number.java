import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("isZero operation : ");
        double a = scanner.nextDouble();
        System.out.print("isPositive operation : ");
        double b = scanner.nextDouble();
        System.out.print("isNegative operation : ");
        double c = scanner.nextDouble();
        System.out.print("isOdd operation : ");
        double d = scanner.nextDouble();


        System.out.println(isZero(a));
        System.out.println(isPositive(b));
        System.out.println(isNegative(c));
        System.out.println(isOdd(d));

        }


        public static boolean isZero(double number){
        if (number == 0){
            return true;
        }else {
            return false;
        }


     }public static boolean isPositive(double number) {
        if (number > 0){
            return true;
        }else {
            return false;
        }
     }public static boolean isNegative(double number){
        if (number<0){
            return true;
        }else{
            return false;
        }
     }public static boolean isOdd(double number){
        return number%2 != 0;
     }
 }


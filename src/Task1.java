import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println(" welcome.");

        Scanner scan = new Scanner(System.in);
        System.out.println(" Please enter your pin :");
        var enteredPin = scan.nextInt();
        checkPin(enteredPin);
        System.out.println(" Please enter your desire operation:");
        var  checker = scan.nextBigDecimal();
        var remainedBalance = atm(checker,enteredPin);
        System.out.println("Remained balance : " + remainedBalance);
        scan.close();
    }
    private static void checkPin(int pin){
        if (pin != 4037) {
            throw new RuntimeException("pin is not correct");
        }
    }
    private static void checkPermittedAmount(){

    }

    private static BigDecimal getUserBalance(int pin) {
        return BigDecimal.valueOf(2500);
    }
    private static void setUserBalance(BigDecimal newBalance){

    }

    public static BigDecimal atm(BigDecimal amount, int enteredPin){

        var balance = getUserBalance(enteredPin);
        var newBalance = balance.add(amount.negate());
        setUserBalance(newBalance);
        return newBalance;

//        switch (checker){
//            case "withdraw":{
//                System.out.println("please enter your amount :");
//                balance -=scan.nextInt();
//                System.out.println("your balance is "+ balance + " . ");
//                if ( balance < balance){
//                    System.out.println( " You can't  withdraw money" );
//
//                }else{
//                    System.out.println( " wrong");
//                }
//                break;
//
//            }
//            case "deposit ": {
//                System.out.println( "Please enter your amount :");
//                balance += scan.nextInt();
//                System.out.println(" Your balance is "+ balance + " .");
//                break;
//            }
//            case "check balance ":{
//                System.out.println( " Your balance is"+ balance + " .");
//                break;
//            }
//        }
//        System.out.println(" Thank you for visiting our bank "+ ", Please come back again.");
//        scan.close();
    }
}

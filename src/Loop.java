import java.util.Scanner;

public class Loop {
    private final double INTEREST_RATE =  10.5;

    public int findDepositGoalYears( double balance,double payment,double goal) {
        double intersetrate = 10.5;
        int years = 0;
        while (balance < goal) {
            balance += payment;
            double interest = balance * INTEREST_RATE / 100;
            balance += interest;
            years++;
        }
        System.out.println(years + "years .");
return years;
    }
    public void askRetirement(){
        System.out.println( "what is your balance : ");
        Scanner scan = new Scanner(System.in);
        double balance = scan.nextDouble();
        System.out.println("what will you pay every day:");
        double payment = scan.nextDouble();
        int years = 0;
        boolean canContinue = false;
        do {
            balance += payment;
            double interest = balance * INTEREST_RATE /100;
            balance +=interest;
            years ++;
            System.out.println("your current balance is : "+ balance);
            System.out.println("do you want to continue? (Y/N: ");
            String decision = scan.next();
            if (decision.equalsIgnoreCase("y")){
                canContinue = true;

            }else {
                canContinue = false;
            }
        } while (canContinue);
        System.out.println(years);

    }

    public static void main(String[] args) {
        Loop loop = new Loop();
        int HowManyYears = loop.findDepositGoalYears(100,30,1000);
        System.out.println(HowManyYears);
        loop.askRetirement();
    }
}

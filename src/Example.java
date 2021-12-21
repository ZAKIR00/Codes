import java.util.Scanner;

public class Example {
    private final double INTEREST_RATE = 10.4;
    public int findDepositGoalYears(double balance,double payment,double goal){
        double interestRate = 10.4;
        int years = 0;
        while (balance < goal){
            balance += payment;
            double interest = balance *interestRate/100;
            balance += interest;
            years++;
        }
        System.out.println(years + "years");
        return years;


    }
      public void askRetriment() {
          System.out.println("what is your balance :");
          Scanner scanner = new Scanner(System.in);
          double balance = scanner.nextDouble();
          System.out.println("what will you pay every year :");
        double payment = scanner.nextDouble();
        int years = 0;
        boolean canContinue = false;
        do {
            balance += payment;
            double interest = balance * INTEREST_RATE /100;
            balance += interest;
            years++;
            System.out.println("your current balance is :");
            System.out.println("do you want to continue? (Y/N) :");
           String decision= scanner.next();
           if (decision.equalsIgnoreCase("y")){
               canContinue= true;
           }else{
               canContinue = false;

           }
        }while (canContinue);
          System.out.println(years);
      }

    public static void main(String[] args) {
        Example example = new Example();
        int howManyYears = example.findDepositGoalYears(100d,24d,230000d);
        System.out.println(howManyYears);
        example.askRetriment();

    }

    }


public class ConditionalStatement {

    private final int  TARGET= 500;
    public int findBonus(int yourSales){
        Performance yourPerformance;
        int bonus = 0;
        if (yourSales >= TARGET){
            yourPerformance = Performance.SATISFACTORY;
            System.out.println(yourPerformance);
            bonus = 100;

        }
        return bonus;
    }
public int complexBonusFinder(int yourSales){
        Performance yourPerformance = Performance.LOW;
        int bonus;
        if (yourSales >= 2 * TARGET) {
            yourPerformance = Performance.EXCELLENT;
            bonus = 1000;
        }else if(yourSales >=1.5*TARGET) {
            yourPerformance = Performance.FINE;
            bonus = 500;
        }else if(yourSales >= TARGET) {
            yourPerformance = Performance.SATISFACTORY;
            bonus = 100;
        }else{
            System.out.println("you are fired");
            bonus = 0;




        }
    System.out.println(yourPerformance);
        return bonus;

}

    public static void main(String[] args) {
        ConditionalStatement statement = new ConditionalStatement();
        int bonus = statement.findBonus(400);
        System.out.println(bonus);
    }
}

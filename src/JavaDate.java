import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;


public class JavaDate {


    public static void main(String[] args) {

        JavaDate tarix = new JavaDate();
        tarix.LocalDateTime();

    }public void LocalDateTime(){
        LocalDateTime indikiVaxt = LocalDateTime.now();
        System.out.println("indiki vaxt : "+indikiVaxt);

        LocalDate zaman = indikiVaxt.toLocalDate();
        System.out.println("il - gun -ay"+zaman);

        Month ay = indikiVaxt.getMonth();
        int ayInt= indikiVaxt.getMonthValue();
        int gun = indikiVaxt.getDayOfMonth();
        int saniye = indikiVaxt.getSecond();
        System.out.println("Ay :"+ ayInt+"gun :"+ gun+"saniye :"+saniye);
        System.out.println("Ay :"+ ay+"gun :"+gun+"saniye:"+saniye);

        LocalDateTime zaman2 = indikiVaxt.withDayOfMonth(9).withYear(2022);
        System.out.println("zaman2"+zaman2);

        LocalDate zaman3 = LocalDate.of(2022,Month.OCTOBER,9);
        System.out.println("zaman3"+zaman3);


        LocalTime zaman4 = LocalTime.of(12,05);

        System.out.println("zaman4"+zaman4);


        LocalTime zaman5 = LocalTime.parse("20:04");
        System.out.println("zaman5"+zaman5);
    }




}

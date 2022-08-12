import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Company {
    public static void main(String[] args) {
        var list = new ArrayList<Employee>();

        list.add(new Employee("hugh", "ten", BigDecimal.valueOf(400), "active"));
        list.add(new Employee("georg", "ten", BigDecimal.valueOf(500), "deleted"));
        list.add(new Employee("jony", "ten", BigDecimal.valueOf(433), "active"));
        list.add(new Employee("ben", "ten", BigDecimal.valueOf(900), "deleted"));
        list.add(new Employee("jack", "ten", BigDecimal.valueOf(1000), "active"));


        //active statuslu employeleri adini liste yigaq ekrana cixar

        List<String> activeEmployees = new ArrayList<>();
        for (Employee e : list) {
            if (e.getStatus().equals("active")) {
                activeEmployees.add(e.getName());
            }

        }
        System.out.println(activeEmployees);

        var actives = list.stream()
                .filter(employee -> employee.getStatus().equals("active"))
                .map(employee -> employee.getName())
                .collect(Collectors.toList());
        System.out.println(actives);
    }}



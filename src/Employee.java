public class Employee {
    private String name;
    private String department;
    private int salary;
    public Employee(String name,String department,int salary){
        super();
        this.name=name;
        this.department=department;
        this.salary=salary;

    }
    public void showInfos(){
        System.out.println("melumatlar:");
        System.out.println("ad:"+this.name);
        System.out.println("department:"+ this.department);
        System.out.println("maas:"+this.salary);

    }
}

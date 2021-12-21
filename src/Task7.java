public class Task7{
    static double delta;
    public static void main(String[] args) {
         kokTap(10,15,44);

    }
    static void kokTap(int a , int b,int c ){
        delta  = b*b+4*a*c;
        if (delta>0){
            double x1 = ((-b+Math.sqrt(delta))/(2*a));
            double x2 = ((-b-Math.sqrt(delta))/((2*a)));
            System.out.println("2 koku var. kokler: "+x1+"ve "+x2);
        }
else if (delta==0){
    double x1=(-b)/(2*a);
            System.out.println("1 koku var : "+x1);
        }else if (delta<0);
        System.out.println("kok yoxdur");
        }

    }


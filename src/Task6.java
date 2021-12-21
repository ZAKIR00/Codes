import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println( "sureti girin :");
        long hiz = s.nextInt();
        System.out.println("radara girdiniz:");
        if (hiz >90 && hiz<120){
            System.out.println( "cezan 200 AZN:");

        }else{
            if(hiz>120){
                System.out.println("cezan 400AZN:");
            }else if (hiz<90){
                System.out.println( "normal suret:");
            }
        }
        System.out.println(hiz);
    }

}

import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {

    int [] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length ; i++) {

            arr[i] =random.nextInt(100   ) ;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[1]);

        }
    }
    
}

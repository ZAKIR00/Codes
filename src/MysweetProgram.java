import java.util.Arrays;
import java.util.Random;


public class MysweetProgram {
    public static void main(String[] args) {

       // int[] arr = new int[10];
       // Random random = new Random();
       // for (int i = 0; i <arr.length;i++){
      //      arr[i] = random.nextInt(100);
      //  }

           // System.out.println(arr[8]);
        int[][] mArray;
        mArray = new int[][]{
                {1,2,5,5,7},
                {3,5},
                {6,7},
                {8,9}

        };
        for (int i = 0; i < mArray.length;i++){
           for (int j = 0; j < mArray.length; j++){
               System.out.println("[" + i + "] [" + j +"] => " + mArray[i][j]);
           }
        }
        }
    }





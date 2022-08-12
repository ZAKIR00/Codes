public class Arrays {
    public static void main(String[] args) {
         int [] miyav = new int[10];
         miyav [0]=1;
         miyav[3]=4;
         miyav[4]=5;
         miyav[9]=8;
     //   System.out.println(java.util.Arrays.toString(miyav ));
        int a = miyav[4];
        System.out.println(a);
        for (int i = 0; i<miyav.length ;i++){
            System.out.print(miyav [i] );
        }
    }
}

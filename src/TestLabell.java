public class TestLabell {
    public static void main(String[] args) {
        testlabellebreak();
// int a = 10;
     //   for (;  a < 30 ; a++){
     //       System.out.println("value" + a);
    //    }
   // for(; ;){
     //   System.out.println("infinit");
    //}
       // do {
     //       System.out.println("infinity");

        //}while (true);
      //    for ( int i = 0; i <10 ; i++){
        //      if (i == 7){
        //       continue;

          //}
            //  System.out.println(i);

    }
    public static void testlabellebreak(){
        external:
        for (int i = 0; i < 10 ; i++){
            System.out.println("external :" + i);
            for (int j = 0; j <5 ; j++){
                if ( i == 6){
                    break external;
                }
                System.out.println("internal :"+ j);
            }

        }

}}

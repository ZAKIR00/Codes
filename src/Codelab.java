public class Codelab {
    static int faktoryal(int say)
    {
        if (say==1)
           return 1;
        else
            return (say*(faktoryal(say-1)));

    }

    public static void main(String[] args){
        System.out.println(faktoryal(5));
    }



}

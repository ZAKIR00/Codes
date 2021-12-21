public class Nzs {

    public void islemYap(int a, int b) {
        if (a % 5 == 0) {
            System.out.println(a);
        }
        if (b % 5 == 0) {
            System.out.println(b);
        }
    }
    public void islemYap(int a, int b, int c){
        islemYap(a,b);
        if (c%5==0){
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        var obj = new Nzs();
        obj.islemYap(5,14);
    }

}



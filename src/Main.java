public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
         Runnable runnable = ()-> {
             c.set();
             c.print();
         };
        var t1 = new Thread(runnable);
        t1.start();
        var t2 = new Thread(runnable);
        t2.start();

    }
}

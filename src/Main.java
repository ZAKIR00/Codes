import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
   //     Counter c = new Counter();
     //    Runnable runnable = ()-> {
       //      c.set();
         //    c.print();
         //};
        //var t1 = new Thread(runnable);
        //t1.start();
        //var t2 = new Thread(runnable);
        //t2.start();
        Callable<String> callable = ()-> "hello";
        var pool= Executors.newFixedThreadPool(5);
        Future<String> stringFuture = pool.submit(callable);

            try {
                System.out.println(stringFuture.get());
            } catch (InterruptedException  | ExecutionException e ) {
                e.printStackTrace();
            }
        System.out.println(stringFuture.isCancelled());

            }

        }







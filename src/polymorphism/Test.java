package polymorphism;

public class Test {
    public static void main(String[] args) {

  Dog doggy = new Dog();
        System.out.println(doggy.hareket());
        Snake snake = new Snake();
        System.out.println(snake.hareket());
    }
    public static int toplama( int a ,int b){
        return a+b;


    }
    public static int toplama(int a ,int b , int c){
        return a+b+c;
    }
    public static int toplama(String x , int y){
        return 0;
    }
    }
class Animall{
    public String hareket(){
        return "hareket ederim";
    }
}
class Dog extends Animall{
    public String hareket(){
        return "kosarim";
    }
}
class Snake extends Animall {

}
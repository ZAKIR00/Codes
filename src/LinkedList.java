import java.util.Objects;

public class LinkedList <T>{
    private Node <T> head ;
    private Node <T> current;
    public void add(T data){
        var node = new Node<>();
        node.data = data;
        node.next = (Node<Object>) current.data;
        current = (Node<T>) node;
    }
public void print(){

        var node = head;
         while (node.next != null){
        System.out.println(node.data);
        node = node.next;
        if(head==null){
            head = (Node<T>) node;
        }
        return;
    }
}

    public static void main(String[] args) {
        var list = new LinkedList<String>();
        list.add("Hello");
        list.add("developer");
        list.add("!");
        list.print();

    }
}

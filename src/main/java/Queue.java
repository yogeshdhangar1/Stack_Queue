import java.util.LinkedList;

public class Queue {
    LinkedList list = new LinkedList();
    public void enQueue(int data){
        list.addLast(data);
    }
    public void deQueue(){
        list.removeLast();
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(70);
        queue.enQueue(30);
        queue.enQueue(56);
        System.out.println(queue.list);
        queue.deQueue();
        System.out.println(queue.list);
    }
}

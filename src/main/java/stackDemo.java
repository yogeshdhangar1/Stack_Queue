import java.util.LinkedList;

public class stackDemo {
    LinkedList list = new LinkedList();
    public void push (int data){
        list.addLast(data);
    }
    public void pop(int data){
        list.removeLast();
    }

    public static void main(String[] args) {
        stackDemo stk = new stackDemo();
        stk.push(70);
        stk.push(30);
        stk.push(56);
        System.out.println(stk.list);
    }
}

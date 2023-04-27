package DA;
//LinkedListQueue.java
import java.util.LinkedList;
public class LinkedListQueue{

    private LinkedList list;
    public LinkedListQueue(){
        list=new LinkedList();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public void enqueue(Object item){
        list.addLast(item);
    }
    public Object dequeue(){
        return list.removeFirst();
    }
    public int size(){
        return list.size();
    }
    public Object peek(){
        return list.getFirst();
    }
    public static void main(String args[]){
        LinkedListQueue queue=new LinkedListQueue();
        queue.enqueue("Patient 1");
        queue.enqueue("Patient 2");
        queue.enqueue("Patient 3");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}

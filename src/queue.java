import java.util.NoSuchElementException;

public class queue {
    private listnode front;
    private listnode rear;
    private int length;
    public queue(){
        this.front=null;
        this.rear=null;
        this.length=0;
    }
    private class listnode{
        private int data;
        private listnode next;
        public listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public int length(){
        return length;
    }
    public boolean isempty(){
        return length==0;
    }
    public void enqueue(int data){
        listnode temp=new listnode(data);
        if(isempty()){
            front=temp;
        }
        else{
            rear.next=temp;
        }
        rear=temp;
        length++;
    }
    public int dequeue(){
        if(isempty()){
            throw new  NoSuchElementException("QUEUE is empty");
        }
        int result=front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        length--;
        return result;
    }
    public void printing(){
        if(isempty()){
            return;
        }
        listnode current=front;
        while (current!=null){
            System.out.println(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        queue obj=new queue();
        obj.enqueue(19);
        obj.enqueue(66);
        obj.enqueue(88);
        obj.dequeue();
        obj.printing();
    }
}

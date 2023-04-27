import java.util.EmptyStackException;
import java.util.Stack;

public class stack {
    public Listnode top;
    private int length;
    int arr[];
    int k=0;
    private class Listnode{
        private int data;
        private Listnode next;
        public Listnode(int data){
            this.data=data;
        }
    }
    public stack(){
        top=null;
        length=0;
    }
    public int length(){
        return length;
    }
    public boolean isempty(){
        return length==0;
    }
    public void push(int data){
        Listnode temp=new Listnode(data);
        temp.next=top;
        top=temp;
        length++;
        arr[k]= top.data;
        k++;
    }
 public void display(){
     for (int i = 0; i <length ; i++) {
         System.out.println(arr[i]);
     }
 }
 public int pop(){
        if(isempty()){
            throw new EmptyStackException();
        }
        int result=top.data;
        top=top.next;
        length--;
        return result;
    }
    public int peek() {
        if (isempty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        stack obj=new stack();
        obj.push(43);
        obj.push(77);
        obj.push(45);
        obj.display();
        System.out.println(obj.peek());
    }
}



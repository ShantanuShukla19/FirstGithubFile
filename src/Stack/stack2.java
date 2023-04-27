package Stack;

public class stack2 {
    private int arr[];
    private int top;
    private int length;
    int fullLength;
    stack2(int capacity){
        arr=new int[capacity];
        fullLength=capacity;
        length=0;
        top=-1;
    }
    public void push(int x){
        if(isfull()){
            System.out.println("STACK OVERFLOW");
            System.exit(1);
        }
        arr[++top]=x;
        length++;
    }
    public int pop(){
        if(isempty()){
            System.out.println("EMPTY STACK");
            System.exit(1);
        }
        length--;
        return arr[top--];
    }
    public void traverse(){
        for (int i = length-1; i >=0 ; i--) {
            System.out.println(arr[i]);
        }
    }
    public boolean isempty(){
      return length==0;
    }
    public boolean isfull(){
        return length==fullLength-1;
    }
    public int getLength(){
        return length;
    }
    public boolean search(int val){
        for (int i=0;i<length;i++){
            if (arr[i]==val){
                return true;
            }
        }
        return false;
    }
    public void update(int ind,int ele){
        if (ind >= length || length < 0) {
            throw new IllegalArgumentException("Index is out of bounds");
        }
        for (int i = 0; i <length ; i++) {
            if(i==ind){
                arr[i]=ele;
            }
        }
    }
    public void peek(){
        if(isempty()){
            System.out.println("EMPTY STACK");
            System.exit(1);
        }
        System.out.println(arr[top]);
    }
    public static void main(String[] args) {
        stack2 obj=new stack2(5);
        obj.push(77);
        obj.push(65);
        obj.push(576);
        obj.push(453);
        obj.peek();
        obj.update(2,876);
        obj.pop();
        obj.peek();
       // System.out.println(obj.search(79));
       // obj.traverse();
    }
}



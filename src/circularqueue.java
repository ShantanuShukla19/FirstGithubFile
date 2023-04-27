public class circularqueue {
    private int front;
    private int rear;
    private int arr[];
    private int length;
    private int fulllength;
    circularqueue(int capacity){
        arr=new int[capacity];
        fulllength=capacity;
        length=0;
        front=-1;
        rear=-1;
    }
    boolean isempty(){
        if (front==-1){
            return true;
        }
        else {
            return false;
        }
    }
    boolean isfull(){
        if(front==-1&&rear==fulllength-1){
            return true;
        }
        if(front==rear+1){
            return true;
        }
        return false;
    }
    void enqueue(int element){
        if (isfull()){
            System.out.println("queue is full");
        }
        else{
            if (front==-1){
                front=0;
            }
        }
        rear=(rear+1)%fulllength;
        arr[rear]=element;
        System.out.println("Inserted element");
    }
    int dequeue(){
        int element;
        if(isempty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            if(front==rear){
                front=-1;
                rear=-1;
            }
            else{
                front=(front+1)%fulllength;
            }
            element=arr[front];
            return element;
        }
    }
    public static void main(String[] args) {
        circularqueue obj=new circularqueue(5);
        obj.enqueue(5);
        obj.enqueue(7);
    }
}

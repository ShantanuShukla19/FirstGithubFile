package linkedlist;

public class doublylinkedlist {
    private static class node{
        int data;
        private node previous;
        private node next;
        public node(int val){
            this.data=val;
        }

    }
    private node head;
    private node tail;
    private int length;
    public doublylinkedlist() {
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isempty(){
        return length==0;
    }
    public int length(){

        int count = 0;
        node current = this.head;
        if (this.head == null) {
            return 0;
        } else {
            while(current != null) {
                ++count;
                current = current.next;
            }
            return count;
        }
    }
    public void inserthead(int val){
        node newnode=new node(val);
        if(isempty()){
            tail=newnode;
        }
        else {
            newnode.next = this.head;
            this.head.previous = newnode;
        }
        this.head=newnode;
        length++;
    }
    public void insertlast(int val){
        node newnode=new node(val);
        if (isempty()) {
            this.head = newnode;
        }
        else {
            tail.next=newnode;
            newnode.previous=tail;
        }
        tail=newnode;
        length++;
    }

    public void display() {
        for(node current = this.head; current != null; current = current.next) {
            System.out.print(current.data + "---->");
        }
        System.out.println("null");
    }
    public void displaybackward(){
        node temp=tail;
        while (tail!=null){
            System.out.println(temp.data+"---->");

        }
        System.out.println("null");
        temp=temp.next;
    }
    public void insertatpos(int val,int pos){
        node newnode=new node(val);
        if(pos==1){
            newnode.next=this.head;
            this.head=newnode;
            length++;
        }
        else{
            node current=this.head;
            int count;
            for (count=1;count<pos-1;count++){
                current=current.next;
            }
            node current2=current.next;
            current.next=newnode;
            current2.previous=newnode;
            newnode.next=current2;
            newnode.previous=current;
            length++;
        }
    }
    public node delfirst(){
        if(isempty()){
            throw new RuntimeException();
        }
        node current=this.head;
        if(this.head==null){
            return null ;
        }
        else {
         head.next.previous=null;
        }
        head=head.next;
        current.next=null;
        return current;
    }
    public node dellast(){
        if(isempty()){
            throw new RuntimeException();
        }
        node current = this.tail;
        if(head==tail){
            tail=null;
        }
        else {

            tail.previous.next = null;
        }
        tail=tail.previous;
        current.previous=null;
        return current;
    }
    public void delpos(int pos){
        if(pos==1){
            head=head.next;
        }

        else{
            node previous1=this.head;
            int count;
            for(count=1;count<pos-1;count++){
                previous1=previous1.next;
            }
            node current=previous1.next;
            previous1.next=current.next;
            current.next.previous=previous1;
            current.next=null;
            current.previous=null;

        }

    }

    public static void main(String[] args) {



        doublylinkedlist obj=new doublylinkedlist();

        obj.inserthead(43);
        obj.inserthead(32);
        obj.inserthead(424);
       obj.insertlast(99);
       obj.insertatpos(55,2);
        obj.delfirst();
        obj.dellast();
        obj.delpos(2);
        System.out.println();

        obj.display();
    }
}

package linkedlist;

import java.util.List;

public class circularlinkedlist {
    private Listnode last;
    private int length;
    private class Listnode{
        private Listnode next;
        private int data;
        public Listnode(int data){
            this.data=data;
        }
    }
    public circularlinkedlist(){
        last=null;
        length=0;
    }
    public int length(){
        return length;
    }
    public boolean isempty(){
        return length==0;
    }
    public void createlist(){
        Listnode first=new Listnode(1);
        Listnode second=new Listnode(2);
        Listnode third=new Listnode(3);
        Listnode fourth=new Listnode(5);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;
        last=fourth;
    }
    public void insert(int data){
        Listnode temp=new Listnode(data);
        if(last==null){
            last=temp;
        }
        else{
            temp.next=last.next;
        }
        last.next=temp;
        length++;

    }
    public void insertlast(int val){
        Listnode temp=new Listnode(val);

        if(last==null){
            last=temp;
        }

        else {
            Listnode temp2 = last.next;
            last.next=temp;
            last=temp;
            temp.next=temp2;
        }
        length++;
    }
    public Listnode delfirst(){

        if(last==null){
            throw new RuntimeException();
        }

        Listnode temp=last.next;

            last.next=temp.next;
            temp.next=null;

        return temp;

    }
    public void display(){
        if(last==null){
            return;
        }
        Listnode first=last.next;
        while (first!=last){
            System.out.print(first.data+"---->");
            first=first.next;
        }
        System.out.println(first.data);

    }

    public static void main(String[] args) {
        circularlinkedlist cll=new circularlinkedlist();
        //cll.createlist();
        cll.insert(3);
        cll.insert(35);
        cll.insert(334);
        cll.insertlast(6);
        cll.delfirst();
        cll.display();
    }
}

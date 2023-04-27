//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class linkedlist {
    private static class Listnode {
        private int data;
        private Listnode next;
        public Listnode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Listnode head;
    public linkedlist() {
    }

    public void display() {
        for(Listnode current = this.head; current != null; current = current.next) {
            System.out.print(current.data + "---->");
        }
        System.out.println("null");
    }

    public int length() {
        int count = 0;
        Listnode current = this.head;
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

    public void insert(int value) {
        Listnode newnode = new Listnode(value);
        newnode.next = this.head;
        this.head = newnode;
    }

    public void insertlast(int value2) {
        Listnode newnode = new Listnode(value2);
        if (this.head == null) {
            this.head = newnode;
            return;
        } else {
            Listnode current;
            for(current = this.head; null != current.next; current = current.next) {
                current=current.next;
            }

            current.next = newnode;
        }
    }

    public void insert(int pos, int value) {
        Listnode node = new Listnode(value);
        if (pos == 1) {
            node.next = this.head;
            this.head = node;
        } else {
            Listnode previous = this.head;

            for(int count = 1; count < pos - 1; ++count) {
                previous = previous.next;
            }

            Listnode current = previous.next;
            previous.next = node;
            node.next = current;
        }

    }

    public Listnode delfirst() {
        if (this.head == null) {
            return null;
        } else {
            Listnode temp = this.head;
            this.head = this.head.next;
            temp.next = null;
            return temp;
        }
    }
    public Listnode dellast(){
        if (head==null||head.next==null){
            return head;
        }
        Listnode current=head;
        Listnode previous=null;
        while (current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }
    public void delete(int pos){
        //3-->4-->7-->8-->9-->null
        if(pos==1){
            head=head.next;
        }
        else{
            Listnode previous=head;
            int count1=1;
            while (count1<pos-1){
                previous=previous.next;
                count1++;
            }
            Listnode current=previous.next;
            previous.next=current.next;
        }
    }
    public boolean find(Listnode head,int searchkey){
        if(head==null){
            return false;
        }
        Listnode current=head;
        while(current!=null)
        {
            if (current.data==searchkey){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public Listnode reversal(Listnode head){
        if(head==null){
            return head;
        }
        Listnode current=head;
        Listnode previous=null;
        Listnode next=null;
        while (current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }



    public static void main(String[] args) {
        //linkedlist head = new linkedlist();


        Listnode head=new Listnode(10);
        Listnode second=new Listnode(20);
        Listnode third=new Listnode(30);
        Listnode fourth=new Listnode(40);
        head.next=second;
        second.next=third;
        third.next=fourth;
        linkedlist obj=new linkedlist();
        obj.display();
        obj.reversal(head);
        obj.display();
//        s1.insert( 3);
//        s1.insert( 4);
//        s1.insert( 7);
//        s1.insert(9);
//        s1.display();
//        s1.reverse();
//        s1.display();
//        if(s1.find())

//        s1.delfirst();
//        s1.dellast();
//        s1.delete(2);
//        s1.display();
        //System.out.println(s1.length());
        //s1.reverse();

    }
}


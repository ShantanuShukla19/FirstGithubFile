package linkedlist;



public class sort0sand1s {
public static void insertattal(Listnode tail,Listnode current){
    tail.next=current;
    current=tail;

}
    private static class Listnode {
        private int data;
        private Listnode next;
        public Listnode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Listnode head;
    public sort0sand1s() {
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
    public Listnode removeElements(Listnode head, int val) {
        Listnode helper = new Listnode(0);
        helper.next = head;
        Listnode p = helper;

        while (p.next != null) {
            if (p.next.data == val) {
                Listnode next = p.next;
                p.next = next.next;
            } else {
                p = p.next;
            }
        }

        return helper.next;
    }
    public Listnode removedups(Listnode head){
        if(head==null){
            return null;
        }
        Listnode current=head;
        while (current.next!=null){
            if(current.data==current.next.data){
                Listnode forward=current.next;
                current.next=forward.next;
                forward.next=null;
            }
            else {
                current=current.next;
            }
        }
        return head;
    }

    public Listnode removedupunsort(Listnode head){
        if(head==null){
            return null;
        }
        Listnode current;
        for (current=head;current.next!=null;current=current.next){
            Listnode prev=current.next;
            while(prev.next!=null){
                if(current.data==prev.next.data){
                    Listnode forward=prev.next;
                    prev=forward.next;
                    //forward.next=null;
                }
                else{
                    prev=prev.next;
                }

            }
        }
        return head;
    }
    public Listnode sortlist(Listnode head){
        Listnode zerohead=new Listnode(0);
        Listnode zerotail=zerohead;
        Listnode onehead=new Listnode(0);
        Listnode onetail=onehead;
        Listnode twohead=new Listnode(0);
        Listnode twotail=twohead;
        Listnode current=head;
        while (current!=null){
            int val=current.data;
            if(val==0){
                insertattal(zerotail,current);
            }
            else if(val==1){
                insertattal(onetail,current);
            }
            else{
                insertattal(twotail,current);
            }
        }
        if (onehead.next!=null){
            zerohead.next=onehead;
        }
        else{
            zerohead.next=twohead;
        }
        onetail.next=twohead;
        twotail.next=null;

        head=zerohead.next;
        Listnode temp1=zerohead;
        zerohead=zerohead.next;
        temp1.next=null;
        Listnode temp2=onehead;
        onehead=onehead.next;
        temp2.next=null;
        Listnode temp3=twohead;
        twohead=twohead.next;
        temp3.next=null;
        return head;

    }

    public static void main(String[] args) {
        sort0sand1s s1=new sort0sand1s();
//        Listnode head2=new Listnode(232);
//        s1.head=head2;
        s1.insert(1);
        s1.insert(0);
        s1.insert(0);
        s1.insert(1);
        s1.insert(2);
        s1.insert(2);
        s1.insert(1);
        //s1.insert(35);
        // s1.removedups(s1.head);
      //  s1.removedupunsort(s1.head);
        s1.sortlist(s1.head);



        s1.display();
    }
}


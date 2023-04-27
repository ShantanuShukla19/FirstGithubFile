package linkedlist;

public class removeduplicates {

        private static class Listnode {
            private int data;
            private Listnode next;
            public Listnode(int data) {
                this.data = data;
                this.next = null;
            }
        }
        private Listnode head;
        public removeduplicates() {
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
    public static void mergetwolist(Listnode first,Listnode second){
            Listnode current1=first;
            Listnode current2=second;
            if(first==null&&second==null){
                return ;
            }
            Listnode current3=null;
            int i=0;
            while (current1!=null||current2!=null){
                if(i%2==0){
                    current3=current1;
                    current3.next=current2;
                    current1=current1.next;
                    current3=current3.next;
                }
                else{
                    current3=current2;
                    current3.next=current1;
                    current2=current2.next;
                    current3=current3.next;
                }
                if(current2==null&&current1!=null){
                    current3=current1;
                    current1=current1.next;
                }
                if(current1==null&&current2!=null){
                    current3=current2;
                    current2=current2.next;
                }
                i++;

            }
        System.out.println(current3.data);

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

    public static void main(String[] args) {
        removeduplicates s1=new removeduplicates();
        removeduplicates s2=new removeduplicates();
//        s1.head=head2;
        s1.insert(5);
      s1.insert(43);
      s1.insert(34);
      s1.insert(5);
      s1.insert(5);
      s1.display();
        s2.insert(5);
        s2.insert(43);
        s2.insert(34);
        s2.insert(5);
        s2.insert(5);
        mergetwolist(s1.head,s2.head);
//      s1.insert(2);
//      s1.insert(34);
//      s1.insert(35);
     // s1.removedups(s1.head);
    }
}

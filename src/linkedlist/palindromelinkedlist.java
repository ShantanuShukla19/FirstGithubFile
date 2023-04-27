package linkedlist;

public class palindromelinkedlist {
    public static boolean checkpalindrome(int arr[]){
        int j=arr.length-1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=arr[j]){
                return false;
            }
          j--;
        }
        return true;
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
    public palindromelinkedlist() {
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
    public  boolean palindrome(Listnode head){
        int arr[]=new int[length()];
        Listnode temp=head;
        int i=0;
        while (temp!=null){
            arr[i]= temp.data;
            temp=temp.next;
            i++;
        }
        return checkpalindrome(arr);

    }

    public static void main(String[] args) {
        palindromelinkedlist s1=new palindromelinkedlist();
        s1.insert(1);
        s1.insert(2);
        s1.insert(2);
        s1.insert(2);
        System.out.println(s1.palindrome(s1.head));
    }

}

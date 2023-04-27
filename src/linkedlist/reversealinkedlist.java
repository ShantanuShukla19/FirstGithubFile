package linkedlist;





public class reversealinkedlist {

    // Structure for Node class
    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;

        }
    }

    // Variables of this class
    private Node first;
    private int size;

    public reversealinkedlist( ) {
        this.first = null;
        this.size = 0;
    }

    // Insert method: Inserts at the end
    public void insert(int newValue) {
        if (first == null) {
            first = new Node(newValue);
        } else {
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(newValue);
        }
        size++;
    }

    // Delete method
    public void delete(int index) {
        if (index >= size || index < 0) {
            throw new IllegalArgumentException("Index is out of bounds");
        }

        if (index == 0) {
            first = first.next;
        } else {
            Node prev = null;
            Node temp = first;
            for (int i = 0; i < index; i++) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
        }
        size--;
    }


    public boolean search(int searchValue) {
        Node temp = first;
        while (temp != null) {
            if (temp.value == searchValue) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Prints all the values in a list
    public void traverse( ) {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    // Update: Given index and value, update the element
    // at index with the new value
    public void update(int index, int newValue) {
        Node temp=first;
        if (index >= size || index < 0) {
            throw new IllegalArgumentException("Index is out of bounds");
        }
        int i=0;
        while (temp!=null){
            if (i==index){
                temp.value=newValue;
                return;
            }
            i++;
            temp=temp.next;
        }
    }
    public Node reversal(Node first){
        if(first==null){
            return first;
        }
        Node current=first;
        Node previous=null;
        Node next=null;
        while (current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }

    public static void main(String[] args) {
        reversealinkedlist list = new reversealinkedlist();
        Node first=new Node(5);
        list.insert(2);
        list.insert(10);
        list.insert(5);
        list.update(1,6);
        list.traverse();
        list.reversal(first);
        list.traverse();


    }
}

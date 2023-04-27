

public class learnlinklist {

    // Structure for Node class
    private static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Variables of this class
    private Node first;
    private int size;

    public learnlinklist( ) {
        this.first = null;
        this.size = 0;
    }

    // Insert method: Inserts at the end
    public void insert(int newValue) {
        if (first == null) {
            first = new Node(newValue, null);
        } else {
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(newValue, null);
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

    // Search: Given a value, return bool if found
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

    public static void main(String[] args) {
        learnlinklist list = new learnlinklist();
        list.insert(2);
        list.insert(10);
        list.insert(5);
        list.update(1,6);
        list.traverse();
        System.out.println(list.search(2));
        System.out.println(list.search(10));
        System.out.println(list.search(5));
        System.out.println(list.search(3));
        System.out.println(list.search(4));
        System.out.println(list.search(6));
    }
}

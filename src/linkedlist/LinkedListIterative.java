package linkedlist;
public class LinkedListIterative
{

    // head is the first node of the linked list
    static LinkedListNode head;

    // class for creating the node of the linked list
// a node of the linked lists fetches two things: one is the value of the node
// and other is the pointer that points to the other node
    static class LinkedListNode
    {

        int val;
        LinkedListNode next;

        int length;
        // constructor of the class LinkedListNode
        LinkedListNode(int no)
        {
            val = no;
            next = null;
        }
    }


    // Method for reversing the linked list
    LinkedListNode reverse(LinkedListNode node)
    {
// doing the initialization
// of as per the steps defined
        LinkedListNode previous = null;
        LinkedListNode curr = node;
        LinkedListNode next = null;


        while (curr != null)
        {
            next = curr.next;
            curr.next = previous;
            previous = curr;
            curr = next;
        }
        node = previous;
        return node;
    }
//    public LinkedListNode reverseBetween(LinkedListNode head, int left, int right) {
//        int count=1;
//        if(left==1&&right==1){
//            return null;
//        }
//        if(head==null){
//            return null;
//        }
//        LinkedListNode LEFT=head;
//        LinkedListNode Leftforward=null;
//        LinkedListNode Leftprevious=null;
//        while(count<=left){
//            LEFT.next=Leftforward;
//            count++;
//            Leftprevious=LEFT;
//        }
//        LinkedListNode RIGHT=head;
//        LinkedListNode rightforward=null;
//        LinkedListNode rightprevious=null;
//        int count2=1;
//        while(count2<=right){
//            RIGHT.next=rightforward;
//            Leftprevious.next=RIGHT;
//            RIGHT.next=Leftforward;
//            rightprevious.next=LEFT;
//            LEFT.next=rightforward;
//            count2++;
//            rightprevious=RIGHT;
//        }
//
//
//    }


    // displays the content of the linked list
    void printList(LinkedListNode nde)
    {
        while (nde != null)
        {
            System.out.print(nde.val + " ");
            nde = nde.next;
        }
    }
    int getlength(LinkedListNode head){
        int length=0;
        while (head!=null){
            length++;
            head=head.next;
        }
        return length;
    }
    public LinkedListNode findmiddle(LinkedListNode head){
        int ans=getlength(head);
        int result;
        if(ans%2==0){
            result= ans/2;
        }
        else{
            result= (ans/2+1);
        }
        int count=1;
        LinkedListNode curr=head;
        while (count<result){
            curr=curr.next;
            count++;
        }
        return curr;
    }


    // main method
    public static void main(String argvs[])
    {

        LinkedListIterative listObj = new LinkedListIterative();

// 4 -> NULL
        listObj.head = new LinkedListNode(4);

// 4 -> 6 -> NULL
        listObj.head.next = new LinkedListNode(6);

// 4 -> 6 -> 7 -> NULL
        listObj.head.next.next = new LinkedListNode(7);

// 4 -> 6 -> 7 -> 1-> NULL
        listObj.head.next.next.next = new LinkedListNode(1);

// 4 -> 6 -> 7 -> 1-> 5 -> NULL
        listObj.head.next.next.next.next = new LinkedListNode(5);

// 4 -> 6 -> 7 -> 1-> 5 -> 8 -> NULL
        listObj.head.next.next.next.next.next = new LinkedListNode(8);

// 4 -> 6 -> 7 -> 1-> 5 -> 8 -> 3 -> NULL
        listObj.head.next.next.next.next.next.next = new LinkedListNode(3);

// 4 -> 6 -> 7 -> 1-> 5 -> 8 -> 3 -> 2 -> NULL
        listObj.head.next.next.next.next.next.next.next = new LinkedListNode(2);


        System.out.println("The Linked list before reversal is: ");
        listObj.printList(head);
        head = listObj.reverse(head);
        System.out.println("\n");
        System.out.println("After reversal, the linked list is: ");
        listObj.printList(head);
      //  listObj.reverseBetween(head,2,4);
        System.out.println("\n");
        System.out.println(listObj.findmiddle(head));
    }
}
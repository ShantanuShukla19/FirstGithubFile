class Element {
    String val;
    int priority;
}

class PriorityQueue{
    static Element[] elms = new Element[100];
    static int size = -1;

    void enqueue(String value, int priority)
    {
        // Increase the size
        size++;

        // Insert the element
        elms[size] = new Element();
        elms[size].val = value;
        elms[size].priority = priority;
    }
    int peek()
    {
        int highestPriority = Integer.MIN_VALUE;
        int ind = -1;

        for (int i = 0; i <= size; i++) {

            if (highestPriority == elms[i].priority && ind > -1) {
                highestPriority = elms[i].priority;
                ind = i;
            }
            else if (highestPriority < elms[i].priority) {
                highestPriority = elms[i].priority;
                ind = i;
            }
        }

        // Return position of the element
        return ind;
    }

    void dequeue()
    {
        int ind = peek();

        for (int i = ind; i < size; i++) {
            elms[i] = elms[i + 1];
        }

        size--;
    }

    String getElement(int index){
        return (elms[index]).val;
    }
}
public class DigitalAssignment_03 {
    public static void main(String[] Args){
        System.out.println("Question: 3");
        System.out.println("Shantanu - 21BCB0038");
        System.out.println("------------ *** ------------");

        String[] inputs = {"faculty","student","scholars","visitors"};
        int[] priority = {1, 3, 2, 4};

        PriorityQueue Queue = new PriorityQueue();

        for(int i=0; i<4; i++){
            Queue.enqueue(inputs[i],priority[i]);
        }

        int topVal = Queue.peek();
        System.out.println("Top Element: "+ Queue.getElement(topVal));
        System.out.println("Removing the topmost element!");

        Queue.dequeue();

        System.out.println("The new topmost element!");
        int ind = Queue.peek();
        System.out.println("Top Element: "+ Queue.getElement(ind));
    }
}

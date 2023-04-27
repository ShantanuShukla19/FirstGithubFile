package Stack;

import java.util.Stack;

public class deletemiddlelme {
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        int arr[]=new int[stk.capacity()];
        stk.push(32);
        stk.push(321);
        stk.push(25);
        stk.push(92);
        stk.push(12);
        for (int i = 0; i <stk.size() ; i++) {
            if(i==stk.capacity()/2){

            }
            else{
                System.out.println(stk.pop());
            }
        }

    }



}

package Stack;

import java.util.Stack;

public class sortastack {
    public static void sort(Stack<Integer> s){
        if(s.empty()){
            return;
        }
        int x[]=new int[s.size()];
        int y=s.size();
        for (int i = 0; i <y; i++) {
            x[i]=s.pop();
        }
        for (int i = 0; i <x.length ; i++) {
            for (int j = i+1; j <x.length ; j++) {
                if(x[i]>x[j]){
                    int temp=x[j];
                    x[j]=x[i];
                    x[i]=temp;
                }
            }
        }
        for (int i = 0; i <x.length ; i++) {
            s.push(x[i]);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        stk.push(223);
        stk.push(78);
        stk.push(9079);
        System.out.println(stk);
        sort(stk);
        System.out.println(stk);
    }
}

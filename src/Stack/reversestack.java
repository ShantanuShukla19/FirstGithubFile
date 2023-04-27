package Stack;

import java.util.Stack;

public class reversestack {
    public static void solve(Stack<Integer> s,int x){
        if(s.empty()){
            s.push(x);
            return;
        }
        int num=s.peek();
        s.pop();
        solve(s,x);
        s.push(num);
    }
    public static void reverse(Stack<Integer> s){
        if(s.empty()){
            return;
        }
        int num=s.peek();
        s.pop();
        reverse(s);
        solve(s,num);
    }
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        stk.push(77);
        stk.push(23);
        stk.push(22);
        System.out.print(stk);
        reverse(stk);
        System.out.println(stk);
    }
}

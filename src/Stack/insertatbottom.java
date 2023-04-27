package Stack;
import java.util.Scanner;
import java.util.Stack;

public class insertatbottom {
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
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();

        System.out.println("No you want to insert at the last");

        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        stk.push(777);
        stk.push(23);
        stk.push(123);
        solve(stk,x);
        System.out.println(stk);
    }
}

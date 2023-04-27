package Stack;

import java.util.Stack;

public class reverseastring {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str="hello";
        char[] str2=new char[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i <str.length() ; i++) {
            str2[i]=stack.pop();
            System.out.println(str2[i]);
        }

    }
}

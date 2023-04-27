package Stack;

public class longestvalid {
    public static int longestValidParentheses(String s) {
       // Stack<Integer> stk =new Stack<>();
        int count=0;

        for(int i=0;i<s.length()-1;i++){
            while(s.charAt(i)=='(' && s.charAt(i+1)==')'){
                count=count+2;
            }
        }
        return count;
    }



    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()()()"));
    }
}

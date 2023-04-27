package Stack;
import java.util.Stack;
public class validparenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                stk.push(ch);
            }
            else{
                if(!stk.empty()){
                    char top=stk.peek();
                    if(ch==')'&&top=='('||ch=='}'&&top=='{'||ch==']'&&top=='['){
                        stk.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        if(stk.empty()){
            return true;
        }
        else{
            return false;
        }
    }

}


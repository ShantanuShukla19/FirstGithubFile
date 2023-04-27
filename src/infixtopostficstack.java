//import java.util.*;
//public class infixtopostficstack {
//
//        private char arr[];
//        private int top;
//        private int length;
//        int fullLength;
//        infixtopostficstack(int capacity){
//            arr=new char[capacity];
//            fullLength=capacity;
//            length=0;
//            top=-1;
//        }
//        public void push(char x){
//            if(isfull()){
//                System.out.println("STACK OVERFLOW");
//                System.exit(1);
//            }
//            arr[++top]=x;
//            length++;
//
//        }
//        public char pop(){
//            if(isempty()){
//                System.out.println("EMPTY STACK");
//                System.exit(1);
//            }
//            length--;
//            return arr[top--];
//        }
//        public void traverse(){
//            for (int i = length-1; i >=0 ; i--) {
//                System.out.println(arr[i]);
//            }
//        }
//
//        public boolean isempty(){
//            return length==0;
//        }
//        public boolean isfull(){
//            return length==fullLength-1;
//        }
//        public int getLength(){
//            return length;
//        }
//        public void getop(char ch,int pre){
//            int i=0;
//            while (!isempty()){
//                char temp = pop();
//
//                if(temp=='('){
//                    push(temp);
//                }
//                else {
//                    int prec2;
//                    if(temp=='+'||temp=='-'){
//                        prec2=1;
//                    }
//                    else{
//                        prec2=2;
//                    }
//                    if(prec2<pre){
//                        push(temp);
//                    }
//                }
//
//            }
//
//        }
//        public void getparent(char chr){
//
//        }
//
//    public static void main (String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        infixtopostficstack obj=new infixtopostficstack();
//        String infix=sc.next();
//        char[] postfix=new char[infix.length()];
//        int i;
//        int j=0;
//        for (i=0;i<infix.length();i++){
//            if(infix.charAt(i)!='('||infix.charAt(i)!=')'||infix.charAt(i)!='+'||infix.charAt(i)!='*'
//            ||infix.charAt(i)!='/'||infix.charAt(i)!='-'){
//                postfix[j]=infix.charAt(i);
//                j++;
//            }
//            else{
//             switch (infix.charAt(i)){
//                 case '(':
//                     obj.push(infix.charAt(i));
//                     break;
//                 case '+':
//                 case '-':
//                     getop(infix.charAt(i),1);
//                     break;
//                 case '*':
//                 case '/':
//                     obj.getop(infix.charAt(i),2);
//                     break;
//                 case ')':
//                     obj.getparent(infix.charAt(i));
//                     break;
//             }
//            }
//        }
//    }
//
//}

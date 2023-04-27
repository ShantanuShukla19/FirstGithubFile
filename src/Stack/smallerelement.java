

//ARRAY LIST USE  KRKE HO JAYEGA

//package Stack;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Stack;
//
//public class smallerelement {
//    public static int[] nextsmallerel(int[] arr,int n){
//        Stack<Integer> stk=new Stack<>();
//        stk.push(-1);
//        int arr2[]=new int[n];
//        for(int i=n-1;i<=0;i--){
//            int curr=arr[i];
//            while (stk.peek()>=curr){
//                stk.pop();
//            }
//            arr2[i]=stk.peek();
//            stk.push(curr);
//        }
//        return arr2;
//    }
//
//    public static void main(String[] args) {
//        int[] a=new int[]{2,1,4,3};
//        System.out.println(Arrays.toString(nextsmallerel(a, 4)));
//    }
//
//}

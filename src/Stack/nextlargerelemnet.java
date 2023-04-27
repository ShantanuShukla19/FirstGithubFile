package Stack;

import java.util.Arrays;
import java.util.Stack;

public class nextlargerelemnet {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length];
        Stack<Integer> stk=new Stack<>();
        stk.push(-1);
        for(int i=0;i<nums1.length;i++){
            int curr=nums1[i]-1;
            if(curr>=nums2.length-2){
                arr[i]=-1;
            }
           if(nums2[curr]<nums2[curr+1]){
               arr[i]=nums2[curr+1];
           }
           else{
               arr[i]=-1;
           }



        }
        return arr;
    }

    public static void main(String[] args) {
        int [] nums1=new int[]{2,4};
        int [] nums2=new int[]{1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
}

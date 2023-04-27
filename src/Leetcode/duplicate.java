package Leetcode;

public class duplicate {
    public static int removeDuplicates(int[] nums) {
        int [] arr=new int[nums.length];
        int i,j;
        int k=-1;
        int t=nums.length-1;
        for( i=0;i<nums.length;i++){
             for(j=i+1;j<nums.length;j++){
                 if(nums[i]==nums[j]){
                     ;

                 }
             }

            System.out.println(nums[k]);
            }

        return k;
    }

    public static void main(String[] args) {
        int num[]={1,1,2,3,3,4,4,5,6,7};
        System.out.println(removeDuplicates(num));
    }
}

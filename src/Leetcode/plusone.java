package Leetcode;

public class plusone {
    public static void plusOne(int[] digits) {
         int i;
         int sum=0;
         int x=1;
         for(i=digits.length-1;i>=0;i--){
             sum=digits[i]*x+sum;
             x=x*10;
         }
        sum=sum+1;


         int k=digits.length-1;
        if(digits[digits.length-1]==9){
            int [] arr=new int[digits.length+1];
            for(i=0;i<digits.length;i++){
                arr[i]=digits[i];
            }
            arr[digits.length-1]=arr[digits.length-1]+1;
            arr[digits.length]=0;
        }

        else{
            int [] arr2=new int[digits.length];
            for (i=0;i<digits.length;i++){
                arr2[i]=digits[i];
            }
            arr2[digits.length-1]=arr2[digits.length-1]+1;
        }

    }

    public static void main(String[] args) {
        int[] num={1,2,3,4};
        plusOne(num);
    }
}

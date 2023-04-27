package Leetcode;

public class happynumber {
    public static boolean isHappy(int n) {
        int digits;
        int sum=20;
        while(sum>=10){
            sum=0;
            while(n!=0){
                digits=n%10;
                sum=sum+digits*digits;
                n=n/10;
            }
            n=sum;
        }
        if(sum==1){
            return true;
        }
        else{
            return false;
        }

    }
}

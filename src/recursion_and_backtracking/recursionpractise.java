package recursion_and_backtracking;
//class palindrome{
//    public boolean ispalindrome(String str,int index){
//        if((str.length()-1)==index){
//            return true;
//        }
//        return(str.charAt(str.length()-1)==str.charAt(index))?false:ispalindrome(str,index+1);
//    }
//}
class summation{
    public int sum(int arr[],int i){
        if(i>arr.length-1){
            return 0;
        }
        int sum1=arr[i]+sum(arr,i+1);
        return sum1;
    }
}
public class recursionpractise {
    public int naturalnum(int n){
        if(n<0){
            return -1;
        }
        if(n>0){
            System.out.print(n+" ") ;
        }

        return naturalnum(n-1);
    }

    public static void main(String[] args) {
        recursionpractise obj=new recursionpractise();
          obj.naturalnum(50);
          summation obj5=new summation();
          int a[]=new int[]{2,4,5,6,3};
        System.out.println(obj5.sum(a,0));
//         palindrome obj2=new palindrome();
//        System.out.println(obj2.ispalindrome("aba",0));
    }
}

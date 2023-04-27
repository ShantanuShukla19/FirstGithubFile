package recursion_and_backtracking;

public class binarysearch {
    public static boolean searching(int arr[],int item,int low,int high){
        int mid=(high+low)/2;
        if(high<low){
            return false;
        }
        if(mid==item){
            return true;
        } else if (mid>item) {
            return searching(arr,item,low,mid-1);
        }
        else{
            return searching(arr,item,mid+1,high);
        }
    }

    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(searching(a,878,0,a.length));
    }
}

package recursion_and_backtracking;

public class arraysort {
    public int issarray(int arr[],int index){
        if(arr.length==1||index==1){
            return 1;
        }
        return (arr[index-1]<arr[index-2])?0:issarray(arr,index-1);
    }

    public static void main(String[] args) {
        arraysort obj=new arraysort();
        int a[]=new int[]{1,2,4,6,9};
        System.out.println(obj.issarray(a,5));
    }
}

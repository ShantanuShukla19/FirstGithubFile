package recursion_and_backtracking;

public class linearsearch {
    public static boolean search(int arr[],int item,int index){
        if(index>arr.length-1){
            return false;
        }
        if(arr[index]==item){
            return true;
        }

           return search(arr,item,index+1);



    }

    public static void main(String[] args) {
        int a[]=new int[]{1,2,4,5,3,1};
        System.out.println(search(a,83,0));
    }

}

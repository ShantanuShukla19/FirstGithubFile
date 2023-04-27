package Leetcode;

public class mergesortedarray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[m+n];
        int i,j;
        for (i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        int k=0;
        for (j=m;j<m+n;j++){
            arr[j]=nums2[k];
            k++;
        }

        int temp=10000000;
        for (i=0;i<m+n;i++){
            for (j=i+1;j<m+n;j++){
                if(arr[i]>=arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (i=0;i<m+n;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int num[]={1,2,3,4};
        int num2[]={2,21,12};
        merge(num,4,num2,3);
    }
}

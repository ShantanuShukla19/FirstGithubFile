import java.util.Scanner;
public class DA1 {
    public static void insert(int arr[],int n){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position you want to insert");
        int pos= sc.nextInt();
        System.out.println("Enter the element");
        int ele= sc.nextInt();
        int i;
            for (i = n - 1; i >= pos; i--) {
                arr[i + 1] = arr[i];
            }
        arr[pos]=ele;
        for (i=0;i<=n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void delete(int arr[],int n){
        Scanner sc=new Scanner(System.in);
        System.out.println("INDEX YOU WANT TO DELETE");
        int del= sc.nextInt();
        int i;
            for (i=del;i<n;i++) {
                arr[i] = arr[i + 1];
            }
        for (i=0;i<n-1;i++){
            System.out.println(arr[i]);
        }
    }
    public static void search(int arr[],int n){
        System.out.println("ELEMENT YOU WANT TO SEARCH");
        Scanner sc=new Scanner(System.in);
        int find= sc.nextInt();
        int i;
        boolean flag=false;
        for ( i=0;i<n;i++){
            if (arr[i]==find){
                System.out.println(i);
                flag=true;
                break;
            }
            else {
                flag=false;
            }

        }
        if(flag==false){
            System.out.println("Cannot find element in array");
        }
    }
    public static void traverse(int arr[],int n){
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void update(int arr[],int n){
        Scanner sc=new Scanner(System.in);
        System.out.println("ELEMENT YOU WANT TO BE UPDATED");
        int prev=sc.nextInt();
        System.out.println("VALUE TO PUT");
        int now= sc.nextInt();
        boolean flag=false;
        for (int i = 0; i <n ; i++) {
            if (arr[i]==prev){
                arr[i]=now;
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("NOT IN THE ARRAY");
        }
        else {
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n2;
        n2= sc.nextInt();
        int arr2[]=new int[n2+1];
        int i;
        for(i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        insert(arr2,n2);
        delete(arr2,n2);
        search(arr2,n2);
        update(arr2,n2);
    }
}

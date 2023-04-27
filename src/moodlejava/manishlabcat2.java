package moodlejava;
import java.util.Scanner;
public class manishlabcat2 {
    public static void main(String[] args) {
        int arr[][]=new int[4][4];
        Scanner sc=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int i,j;
        for (i = 0; i <4 ; i++) {
            for (j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (i = 0; i <4 ; i++) {
            for (j=0;j<4;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("Max is: "+max);
        System.out.println("Min is: "+min);
        for (i = 3; i >=0 ; i--) {
            for (j=3;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
        }

    }
}

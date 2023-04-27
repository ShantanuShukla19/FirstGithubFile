package DA;
import java.util.Scanner;
public class MergeSort {
    void mergeInt(int[] arr, int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sortInt(int arr[], int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;
            sortInt(arr, l, m);
            sortInt(arr, m + 1, r);
            mergeInt(arr, l, m, r);
        }
    }

    // char
    void mergeChar(char arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        char L[] = new char[n1];
        char R[] = new char[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sortChar(char arr[], int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;
            sortChar(arr, l, m);
            sortChar(arr, m + 1, r);
            mergeChar(arr, l, m, r);
        }
    }

    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Elements in Array:");
        int El = input.nextInt();
        int[] Arr = new int[El];
        int[] Arr_2 = new int[El];
        System.out.print("Enter Elements of Array 1:");
        for(int i=0; i<El; i++){
            Arr[i] = input.nextInt();
        }
        System.out.print("Enter Elements of Array 2:");
        for(int i=0; i<El; i++){
            Arr_2[i] = input.nextInt();
        }
        System.out.print("Enter String 1:");
        String str_1 = input.next();
        System.out.print("Enter String 2:");
        String str_2 = input.next();

        char charArr[] = new char[str_1.length()];
        char charArr_2[] = new char[str_2.length()];

        for(int i=0; i<str_1.length(); i++){
            charArr[i] = str_1.charAt(i);
        }
        for(int i=0; i<str_2.length(); i++){
            charArr_2[i] = str_2.charAt(i);
        }

        MergeSort ob = new MergeSort();
        System.out.println("Sorted Array - 1:");
        long start_1 = System.nanoTime();
        ob.sortInt(Arr,0,Arr.length-1);
        System.out.println("Sorted array");
        for(int i=0; i<Arr.length; i++){
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
        long end_1 = System.nanoTime();
        System.out.print("Time Complexity Array - 1:");
        System.out.println(end_1 - start_1 + " Nano Second");
        System.out.println();
        System.out.println("Sorted Array - 2:");
        long start_2 = System.nanoTime();
        ob.sortInt(Arr_2, 0, Arr_2.length - 1);
        for(int i=0; i<Arr_2.length; i++){
            System.out.print(Arr_2[i]+" ");
        }
        System.out.println();
        long end_2 = System.nanoTime();
        System.out.print("Time Complexity Array - 2:");
        System.out.println(end_2 - start_2 + " Nano Second");

        System.out.println("Sorted String - 1:");
        long start_3 = System.nanoTime();
        ob.sortChar(charArr,0,charArr.length-1);
        for(int i=0; i<charArr.length; i++){
            System.out.print(charArr[i]+"");
        }
        System.out.println();
        long end_3 = System.nanoTime();
        System.out.print("Time Complexity Array - 1:");
        System.out.println(end_3 - start_3 + " Nano Second");
        System.out.println();
        System.out.println("Sorted String - 2:");
        long start_4 = System.nanoTime();
        ob.sortChar(charArr_2,0,charArr_2.length-1);
        for(int i=0; i<charArr_2.length; i++){
            System.out.print(charArr_2[i]+"");
        }
        System.out.println();
        long end_4 = System.nanoTime();
        System.out.print("Time Complexity Array - 2:");
        System.out.println(end_4 - start_4 + " Nano Second");
        ob.sortChar(charArr,0,charArr.length-1);

    }
}
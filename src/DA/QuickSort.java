package DA;
import java.util.Scanner;
public class QuickSort {
    static int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return (i + 1);
    }
    static int partitionChar(char[] array, int low, int high) {

        int pivot = array[high];

        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        char temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return (i + 1);
    }

    static void quickSortInt(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSortInt(array, low, pi - 1);
            quickSortInt(array, pi + 1, high);
        }
    }
    static void quickSortChar(char[] array, int low, int high) {
        if (low < high) {
            int pi = partitionChar(array, low, high);
            quickSortChar(array, low, pi - 1);
            quickSortChar(array, pi + 1, high);
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

        QuickSort ob = new QuickSort();
        System.out.println("Sorted Array - 1:");
        long start_1 = System.nanoTime();
        ob.quickSortInt(Arr,0,Arr.length-1);
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
        ob.quickSortInt(Arr_2, 0, Arr_2.length - 1);
        for(int i=0; i<Arr_2.length; i++){
            System.out.print(Arr_2[i]+" ");
        }
        System.out.println();
        long end_2 = System.nanoTime();
        System.out.print("Time Complexity Array - 2:");
        System.out.println(end_2 - start_2 + " Nano Second");

        System.out.println("Sorted String - 1:");
        long start_3 = System.nanoTime();
        ob.quickSortChar(charArr,0,charArr.length-1);
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
        ob.quickSortChar(charArr_2,0,charArr_2.length-1);
        for(int i=0; i<charArr_2.length; i++){
            System.out.print(charArr_2[i]+"");
        }
        System.out.println();
        long end_4 = System.nanoTime();
        System.out.print("Time Complexity Array - 2:");
        System.out.println(end_4 - start_4 + " Nano Second");
        ob.quickSortChar(charArr,0,charArr.length-1);
    }
}

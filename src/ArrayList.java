//import java.util.Scanner;
//
//public class ArrayList {
//
//
//    private int[] array;        // Internal array
//    private int insertIndex;    // Index at which we will insert next element
//
//    public ArrayList() {
//        this.array = new int[10];
//        this.insertIndex = 0;
//    }
//
//    // Inserts at the end
//    public void insert(int value) {
//        if(insertIndex == array.length) {
//            resizeAndCopyElements(2 * array.length);
//        }
//        array[insertIndex] = value;
//        insertIndex++;
//    }
//
//    // Creates a new array of given size and copy array elements
//    private void resizeAndCopyElements(int newSize) {
//        int[] temp = new int[newSize];
//        for (int i = 0; i < array.length; i++) {
//            temp[i] = array[i];
//        }
//    }
//
//    // Inserts at the specified index
//    public void insert(int index, int value) {
//
//    }
//
//    public void delete(int[] arr, int n) {
//        int del;
//        System.out.println("Position you want to delete");
//        del = sc.nextInt();
//        int i;
//        for (i = n - 1; i > del; i--) {
//            arr[i - 1] = arr[i];
//        }
//
//        for (i = 0; i < n - 1; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//}

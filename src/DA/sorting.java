package DA;
import java.util.Scanner;
class Sort{
    int[] intArr;
    String Str;
    char[] chArr;

    Sort(int[] iAr){
        this.intArr = iAr;
    }
    Sort(String str){
        char[] tempCharArr = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            tempCharArr[i] = str.charAt(i);
        }
        this.chArr = tempCharArr;
    }

    void selectionSortInt(){
        for (int i = 0; i < this.intArr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < this.intArr.length; j++){
                if (this.intArr[j] < this.intArr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = this.intArr[index];
            this.intArr[index] = this.intArr[i];
            this.intArr[i] = smallerNumber;
        }
        for (int j : this.intArr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    void selectionSortChar(){
        for (int i = 0; i < this.chArr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < this.chArr.length; j++){
                if ((int)this.chArr[j] < (int)this.chArr[index]){
                    index = j;//searching for lowest index
                }
            }
            char smallerNumber = this.chArr[index];
            this.chArr[index] = this.chArr[i];
            this.chArr[i] = smallerNumber;
        }
        for (char j : this.chArr) {
            System.out.print(j + "");
        }
        System.out.println();
    }

    void bubbleSortInt(){
        int n = this.intArr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(this.intArr[j-1] > this.intArr[j]){
                    //swap elements
                    temp = this.intArr[j-1];
                    this.intArr[j-1] = this.intArr[j];
                    this.intArr[j] = temp;
                }

            }
        }
        for (int j : this.intArr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    void bubbleSortChar(){
        int n = this.chArr.length;
        char temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(this.chArr[j-1] > this.chArr[j]){
                    //swap elements
                    temp = this.chArr[j-1];
                    this.chArr[j-1] = this.chArr[j];
                    this.chArr[j] = temp;
                }

            }
        }
        for (char j : this.chArr) {
            System.out.print(j + "");
        }
        System.out.println();
    }

    void insertionSortInt(){
        int n = this.intArr.length;
        for (int j = 1; j < n; j++) {
            int key = this.intArr[j];
            int i = j-1;
            while ( (i > -1) && ( this.intArr [i] > key ) ) {
                this.intArr [i+1] = this.intArr [i];
                i--;
            }
            this.intArr[i+1] = key;
        }
        for (int j : this.intArr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    void insertionSortChar(){
        int n = this.chArr.length;
        for (int j = 1; j < n; j++) {
            char key = this.chArr[j];
            int i = j-1;
            while ( (i > -1) && ( this.chArr [i] > key ) ) {
                this.chArr [i+1] = this.chArr [i];
                i--;
            }
            this.chArr[i+1] = key;
        }
        for (char j : this.chArr) {
            System.out.print(j + "");
        }
        System.out.println();
    }
}

public class sorting {
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
        System.out.print("Enter String 1:");
        String str_2 = input.next();

        Sort intObj = new Sort(Arr);
        Sort intObj_2 = new Sort(Arr_2);
        Sort charObj = new Sort(str_1);
        Sort charObj_2 = new Sort(str_2);

        System.out.println("Sorted Using Selection Sort!");
        intObj.selectionSortInt();
        intObj_2.selectionSortInt();
        charObj.selectionSortChar();
        charObj_2.selectionSortChar();
        System.out.println();

        System.out.println("Sorted Using Bubble Sort!");
        intObj.bubbleSortInt();
        intObj_2.bubbleSortInt();
        charObj.bubbleSortChar();
        charObj_2.bubbleSortChar();
        System.out.println();

        System.out.println("Sorted Using Insertion Sort!");
        intObj.insertionSortInt();
        intObj_2.insertionSortInt();
        charObj.insertionSortChar();
        charObj_2.insertionSortChar();
        System.out.println();
    }
}


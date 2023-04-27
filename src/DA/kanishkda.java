package DA;
import java.nio.charset.IllegalCharsetNameException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class kanishkda {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int arr[]=new int[1000];
        int count=1;

        int k=0;
        char ch []=new char[26];
        for(char a=65;a<=90;a++){

            arr[k]=count;
            ch[k]=a;
            count++;
            k++;
        }
        str=str.toUpperCase();
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)>=65&&str.charAt(i)<=90){

            }
            else {
                throw new RuntimeException();
            }
        }


           for (int i=0;i<str.length();i++){

               for(int j=0;j<ch.length;j++) {

                       if (str.charAt(i) == ch[j]) {
                           System.out.print(arr[j]);
                       }



               }


        }



    }
}

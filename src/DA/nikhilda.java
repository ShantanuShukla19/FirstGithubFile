package DA;
import java.util.Scanner;
public class nikhilda {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence=sc.nextLine();
        String word[]=sentence.split(" ");
        int count=0;
        int i;
        for (i=0;i< word.length;i++){
            if (word[i].equals("India")){
                count++;
            }
        }
        System.out.println("Count of india in the sentence is: "+count);
        System.out.println("Enter the number of students");
        int n= sc.nextInt();
        String [] register_numbers=new String[n];
        String [] school=new String[n];
        int scope=0;
        int site=0;
        String [] microsoft=new String[n];
        for (i=0;i<n;i++){
            System.out.println("Enter the registration number of the student");
            register_numbers[i]=sc.next();
            System.out.println("Enter the school of the student");
            school[i]=sc.next();
            if(school[i].equals("SCOPE")){
                scope++;
            }
            if(school[i].equals("SITE")){
                site++;
            }
            microsoft[i]=register_numbers[i];
        }

        for (i=0;i<n;i++){
            if(school[i].equals("SCOPE")){
                System.out.println("STUDENTS FROM SCOPE ARE AS FOLLOWS");
                System.out.println(register_numbers[i]);
            }
            if(school[i].equals("SITE")){
                System.out.println("STUDENTS FROM SITE ARE AS FOLLOWS");
                System.out.println(register_numbers[i]);
            }
            if(scope==0&site==0){
                System.out.println("No students are placed in microsoft in site or scope");
            }
        }

    }
}

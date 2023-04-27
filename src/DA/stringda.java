package DA;
import java.util.Scanner;
public class stringda {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Number of students");
        n=sc.nextInt();
        String []names=new String[n];
        String []topper_names=new String[n];
        String attendace;
        float cgpa[]=new float[n];
        int i;
        int k=0;
        for(i=0;i<n;i++){
            System.out.println("Enter the student name");
            names[i]=sc.next();
            System.out.println("Enter the cgpa of student");
            cgpa[i]=sc.nextFloat();
        }
        for (i=0;i<n;i++){

            if(cgpa[i]>9){
                System.out.println(names[i]);
                topper_names[k]=names[i];
                k++;
            }
        }
        for(k=0;k<topper_names.length;k++){

            System.out.println(topper_names[k]+" is present or not");
            attendace=sc.next();
            if(attendace.equals("Present")){
                System.out.println(topper_names[k]+" is a 9.0 pointer");
            }

            else{
                System.out.println(topper_names[k]+" is not a 9.0 pointer");
            }
        }

    }
}

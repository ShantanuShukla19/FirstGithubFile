package moodlejava;
import java.util.Scanner;
class Job{
    public String jobid;
    public String position;
    public String agebar;
    public int salary;
    public String city;
    public void setdetails(){
        Scanner sc=new Scanner(System.in);
        jobid=sc.nextLine();
        position=sc.nextLine();
        agebar=sc.nextLine();
        salary=sc.nextInt();
        city=sc.next();

    }
    public void display(){
        System.out.print(jobid+" "+position+" "+agebar+" "+salary+" "+city);
    }
    public void check(){
        if(salary>30000 && position.equals("Software Developer")){
            System.out.println();
            System.out.println("Job Criteria is matched");
        }
        else{
            System.out.println();
            System.out.println("Job Criteria is not matched");
        }
    }

}
public class labcat {
    public static void main(String[] args) {
        Job obj=new Job();
        obj.setdetails();
        obj.display();
        obj.check();
    }
}

package moodlejava;
import java.util.Scanner;
class employee {
    String Employee_name;
    String Employee_address;
    int Employee_id;
    String mail_id;
    int mobile_number;
    int gross_salary;
    int gross_deduction;
    public void getdeatils(){
        Scanner sc=new Scanner(System.in);
        Employee_name=sc.nextLine();
        Employee_id=sc.nextInt();
        Employee_address=sc.nextLine();
        mail_id=sc.nextLine();
        mobile_number=sc.nextInt();
    }
    public void GrossSalary(){
        Scanner sc=new Scanner(System.in);
        int basic_salary=sc.nextInt();
        int hra= sc.nextInt();
        int allowance= sc.nextInt();
        int reimbursemnet=sc.nextInt();
        int arrears=sc.nextInt();
        int bonus=sc.nextInt();
        int gross_salary=basic_salary+hra+allowance+reimbursemnet+arrears+bonus;
    }
    public void Grossdeduction(){
        Scanner sc=new Scanner(System.in);
        int tax=sc.nextInt();
        gross_deduction=tax;
    }
    public void getsalary(){
        int net_salary=gross_salary-gross_deduction;
    }

}
public class manishcat {
    public static void main(String[] args) {
        employee obj=new employee();
        obj.getdeatils();
        obj.GrossSalary();
        obj.Grossdeduction();
        obj.getsalary();
    }
}

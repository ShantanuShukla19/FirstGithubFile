package DA;
import java.util.Scanner;
class Employee{
  int Employee_id;
  String name;
  String gender;
  float basic_salary;
  public void getdetails(){
      Scanner sc=new Scanner(System.in);
      Employee_id=sc.nextInt();
      name=sc.next();
      gender=sc.next();
      basic_salary=sc.nextFloat();

  }
}
class payslip extends Employee{
    float hra;
    float da;
    float grosspay;
    float netpay;
    float annualnetpay;
    public void details(){
        if(basic_salary<=20000){
            hra=(10*basic_salary)/100;
            da=(40*basic_salary)/100;
        } else if (basic_salary>20000&&basic_salary<=40000) {

            hra=(15*basic_salary)/100;
            da=(60*basic_salary)/100;
        }
        else if (basic_salary>40000&&basic_salary<=60000) {

            hra=(30*basic_salary)/100;
            da=(75*basic_salary)/100;
        }
        else{
            hra=(40*basic_salary)/100;
            da=(80*basic_salary)/100;
        }
    }
    public void getsalary(){
        grosspay=basic_salary+hra+da;
        System.out.println(grosspay);
        netpay=grosspay-(grosspay)/10;
        System.out.println(netpay);
        annualnetpay=netpay*12;
    }
}
class Deduction extends payslip{
    float homeloan;
    float tutionfee;
    float lic;
    public void get(){
        Scanner sc=new Scanner(System.in);
        homeloan=sc.nextFloat();
        tutionfee=sc.nextFloat();
        lic= sc.nextFloat();
    }
    public void taxableincome(){
        float ded=homeloan+tutionfee+lic;
        float Taxableincome=annualnetpay-ded;
        System.out.println(Taxableincome);
    }
}
public class vishalda {
    public static void main(String[] args) {
        Deduction obj=new Deduction();
        obj.getdetails();
        obj.details();
        obj.getsalary();
        obj.get();
        obj.taxableincome();
    }
}

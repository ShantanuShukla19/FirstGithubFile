//package moodlejava;
//import java.util.Scanner;
//class Employee{
//
//    public String employee_name;
//    public int number;
//    public String designation;
//}
//class Permanent_employee extends employee {
//    int basic_pay;
//    int hra;
//    int da;
//    int pf;
//    Permanent_employee(String employee_name,int number,String designation,int basic_pay,int hra,int da,int pf){
//        this.employee_name=employee_name;
//        this.number=number;
//        this.designation=designation;
//        this.basic_pay=basic_pay;
//        this.hra=hra;
//        this.da=da;
//        this.pf=pf;
//    }
//    public void display(){
//        int salary=basic_pay+hra+da-pf;
//        System.out.println("Name: "+employee_name);
//        System.out.println("Number: "+number);
//        System.out.println("Designation: "+designation);
//        System.out.println("Monthly salary: "+salary);
//    }
//}
//class Temporary_employee extends employee {
//    int consolidate_pay;
//
//    Temporary_employee(String employee_name,int number,String designation,int consolidate_pay){
//        this.employee_name=employee_name;
//        this.number=number;
//        this.designation=designation;
//        this.consolidate_pay=consolidate_pay;
//    }
//    public void display(){
//        int salary=consolidate_pay;
//        System.out.println("Name: "+employee_name);
//        System.out.println("Number: "+number);
//        System.out.println("Designation: "+designation);
//        System.out.println("Monthly salary: "+salary);
//    }
//}
//public class inheritance {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String name1=sc.next();
//        int num1= sc.nextInt();
//        String designation1=sc.next();
//        int bascicpay1=sc.nextInt();
//        int hra1=sc.nextInt();
//        int da1=sc.nextInt();
//        int pf1=sc.nextInt();
//        String name2=sc.next();
//        int num2= sc.nextInt();
//        String designation2=sc.next();
//        int consolidatepay1=sc.nextInt();
//        Permanent_employee obj=new Permanent_employee(name1,num1,designation1,bascicpay1,hra1,da1,pf1);
//        Temporary_employee obj2=new Temporary_employee(name2,num2,designation2,consolidatepay1);
//        obj.display();
//        obj2.display();
//    }
//}

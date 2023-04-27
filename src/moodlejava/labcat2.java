package moodlejava;
import java.util.Scanner;
class Loan{
    double annualintersetrate;
    int numberofyears;
    double loanamount;
    java.util.Date date=new java.util.Date();

    Loan(){

    }
    Loan(double annualintersetrate,int numberofyears,double loanamount){
        this.annualintersetrate=annualintersetrate;
        this.numberofyears=numberofyears;
        this.loanamount=loanamount;
    }
    public double getannualinterest(){
        return annualintersetrate;
    }

    public int getnoofyears(){
        return numberofyears;
    }

    public double getLoanamount(){
        return loanamount;
    }

    public java.util.Date getloandate(){
        return date;
    }
    public void setannualinterestrate(){
        Scanner sc=new Scanner(System.in);
        double newannualintersetrate=sc.nextDouble();
        annualintersetrate=newannualintersetrate;
    }

    public void setnoofyears(){
        Scanner sc=new Scanner(System.in);
        int newnoofyears=sc.nextInt();
        numberofyears=newnoofyears;
    }

    public void setloanamount(){
        Scanner sc=new Scanner(System.in);
        double newloanamount=sc.nextDouble();
        loanamount=newloanamount;
    }
    public void getmonthlypayment(){
        Double Emi;
        Emi=((loanamount*annualintersetrate)*Math.pow((1+annualintersetrate),numberofyears));
       Emi=Emi/((Math.pow((1+annualintersetrate),numberofyears))-1);
        System.out.println(Emi);
    }
    public void fullpayment(){
        Double Emi;
        Emi=((loanamount*annualintersetrate)*Math.pow((1+annualintersetrate),numberofyears));
        Emi=Emi/((Math.pow((1+annualintersetrate),numberofyears))-1);
        Emi=Emi*12;
        double loanamountmonth=loanamount+Emi;
        System.out.println(Emi);
    }
}
public class labcat2 {
    public static void main(String[] args) {
        Loan obj=new Loan(2.5,1,100);
        System.out.println(obj.getannualinterest());
        System.out.println(obj.getLoanamount());
        System.out.println(obj.getnoofyears());
        System.out.println(obj.getloandate());
        obj.setannualinterestrate();
        obj.setnoofyears();
        obj.setloanamount();
        obj.getmonthlypayment();
        obj.fullpayment();



    }
}

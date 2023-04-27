
package moodlejava;
import java.util.Scanner;
class complex{
    double real;
    double imag;
    static  int x=0;
    complex(){
        this.real=0;
        this.imag=0;
       x++;
    }
    complex(double r,double i){
        real=r;
        imag=i;
        x++;
    }
    public complex add(complex o1){
        complex o3=new complex();
        System.out.println("Adding 0 + 0*j and "+o1.real+" +"+o1.imag+"*j");
        o3.real= o1.real;
        o3.imag= o1.imag;
         return o3;
    }
    public void display(){
        System.out.println("Creating Complex with real "+this.real+" and imaginary "+this.imag);
    }

}
public class complexcalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double p=sc.nextDouble();
        double q=sc.nextDouble();
        complex a1=new complex();
        a1.display();
        complex b1=new complex(p,q);
        b1.display();
        complex c1=a1.add(b1);
        c1.display();
        System.out.println(a1.x+" objects created");

    }
}

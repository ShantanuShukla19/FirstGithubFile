package moodlejava;
import java.util.Scanner;
interface GeometricObject{
     double getarea();
     double getperimeter();
}
class Circle implements GeometricObject{
    double radius;
    double area;
    double perimeter;
    Circle(int r){
        this.radius=r;
    }

    @Override
    public String toString() {
        return "Circle[radius="+radius+"]";
    }

    public double getarea() {
         area=3.14*radius*radius;
        return area;
    }

    @Override
    public double getperimeter() {
        perimeter=4*3.14*radius;
        return perimeter;
    }


}
class Rectangle implements GeometricObject{
    double Length;
    double Breadth;
    double area;
    double perimeter;
    Rectangle(double w,double l){
        this.Breadth=w;
        this.Length=l;
    }


    @Override
    public String toString() {
        return "Circle[width="+Breadth+",length="+Length+"]";
    }

    public double getarea() {
        area=Length*Breadth;
        return area;
    }












    @Override
    public double getperimeter() {
        perimeter=2*(Length+Breadth);
        return perimeter;
    }


}
public class polymorphism {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();
       // int []obj=new int[n];
        Circle obj[]=new Circle[n];
        int k=0;
        int l=0;
        Rectangle obj2[]=new Rectangle[n];
        for (int i=0;i<n;i++){
            int x= sc.nextInt();
            if(x==1){
                int radius=sc.nextInt();


                obj[k]=new Circle(radius);
                k++;


            }
            if(x==2){
                int length=sc.nextInt();
                int breadth= sc.nextInt();
               obj2[l]=new Rectangle(length,breadth);
               l++;

            }
        }
        for (int i=0;i<k;i++){
            System.out.println(obj[i].toString());
            System.out.println("Area of the Circle is :"+obj[i].getarea());
            System.out.println("Perimeter of the Circle is :"+obj[i].getperimeter());

        }
        for (int i=0;i<l;i++){
            System.out.println(obj2[i].toString());
            System.out.println("Area of the Rectangle is :"+obj2[i].getarea());
            System.out.println("Perimeter of the Rectangle is :"+obj2[i].getperimeter());

        }

    }
}

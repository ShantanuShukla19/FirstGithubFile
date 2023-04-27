package DA;
import java.util.Scanner;
class Invoice{
    String number;
    String description;
    int quantity;
    double price;
    Invoice(){
        this.number=" ";
        this.description=" ";
        this.quantity=0;
        this.price=0;
    }
    public void set(){
        Scanner sc=new Scanner(System.in);
        number=sc.nextLine();
        description=sc.nextLine();
        quantity=sc.nextInt();
        price=sc.nextDouble();
    }
    public void get(){
        System.out.println(number);
        System.out.println(description);
        System.out.println(quantity);
        System.out.println(price);
    }
    public void getinvoiceamount(){

    }

}
public class Adityada {
}

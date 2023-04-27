package DA;
import java.util.Scanner;
class CentralTourism{
    String str;
    public void getcity(String city){

        this.str=city;
    }
    public void printcity(){
        System.out.println(str);
    }

}
class SateTourism extends CentralTourism{
    String str;

    public void getcity(String city){

        this.str=city;
    }

    public void printcity(){

        System.out.println(str);

    }
}
public class manishlabcat {
    public static void main(String[] args) {
        SateTourism obj=new SateTourism();
        CentralTourism obj2=new CentralTourism();
        obj2.getcity("Katni");
        obj.getcity("Bareilly");
        obj.printcity();
        obj2.printcity();

    }
}

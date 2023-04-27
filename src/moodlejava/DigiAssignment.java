package moodlejava;
//package moodlejava;
import java.util.Scanner;
import java.lang.String;

class Auto_t{
    String make, model;
    String odo;
    Date_t manufactureDate = new Date_t();
    Date_t purchaseDate = new Date_t();
    Tank_t Tank = new Tank_t();

    void getData(){
        Scanner input = new Scanner(System.in);
        //System.out.print("Make ");
        make = input.nextLine();
        //System.out.print("Model ");
        model = input.nextLine();
        //System.out.print("Odometer reading ");
        odo = input.nextLine();
        //System.out.print("Manufacture_date_month ");
        manufactureDate.month = input.nextLine();
        //System.out.print("Manufacture_day_of_the_month ");
        manufactureDate.day = input.nextLine();
        //System.out.print("Manufacture_year ");
        manufactureDate.year = input.nextLine();
        //System.out.print("Purchase_date_month ");
        purchaseDate.month = input.nextLine();
        //System.out.print("Purchase_day_of_the_month ");
        purchaseDate.day = input.nextLine();
        //System.out.print("Purchase_year ");
        purchaseDate.year = input.nextLine();
        //System.out.print("Tank_capacity_in_gallons ");
        Tank.capacity = input.nextLine();
        // System.out.print("Current_fuel_level_in_gallons ");
        Tank.currentFuel = input.nextLine();
    }

    void showData(){
        System.out.println("Automobile details:");
        String make2 =make.split(" ")[1];
        System.out.println("Make: " + make2);

        String model2 =model.split(" ")[1];
        System.out.println("Model: "+model2);
        String odo2=odo.split(" ")[1];
        System.out.println("Odometer reading: "+odo2);
        String day2 =manufactureDate.day.split(" ")[1];
        String month2 =manufactureDate.month.split(" ")[1];
        String year2 =manufactureDate.year.split(" ")[1];
        System.out.println("Manufacture date:"+day2+"/0"+month2+"/"+year2);
        String day3 =purchaseDate.day.split(" ")[1];
        String month3 =purchaseDate.month.split(" ")[1];
        String year3 =purchaseDate.year.split(" ")[1];
        System.out.println("Purchase date:"+day3+"/0"+month3+"/"+year3);
        String capacity2= Tank.capacity.split(" ")[1];
        String fuel2= Tank.currentFuel.split(" ")[1];
        float c=Float.parseFloat(capacity2);
        float f=Float.parseFloat(fuel2);
        System.out.printf("Tank Capacity: %.2f",c);
        System.out.println();
        System.out.printf("Current fuel: %.2f",f);
    }
}
class Date_t{
    String day, month, year;
}
class Tank_t{
    String capacity;
    String currentFuel;
}

public class DigiAssignment {
    public static void main(String[] Args) {
        Auto_t rapid = new Auto_t();
        rapid.getData();
        rapid.showData();
    }
}
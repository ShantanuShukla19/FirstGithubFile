package DA;
import java.util.Arrays;
import java.util.Scanner;
 class Studentdetails{
    String []regno;
    int []attendance;
    Studentdetails(){
        regno= new String[]{"21bcb0038", "21bcb0030", "21bcb0065", "21bce002", "21bcb175"};
        attendance=new int[]{78,90,36,88,98};
    }
}
class searching{
    Studentdetails obj=new Studentdetails();
    int linearsearch(String x){
        int i;
        for ( i = 0; i <obj.regno.length ; i++) {
            if (obj.regno[i].equals(x)){

                return  obj.attendance[i];
            }
        }
        return -1;
    }
    void binarysearch(String y){
        int i,j;
        for (i=0;i<obj.regno.length;i++){
            for(j=i+1;j<obj.regno.length;j++) {
                if (obj.regno[i].compareTo(obj.regno[j])>0){
                    String temp=obj.regno[i];
                    obj.regno[i]=obj.regno[j];
                    obj.regno[j]=temp;
                    int temp2=obj.attendance[i];
                    obj.attendance[i]=obj.attendance[j];
                    obj.attendance[j]=temp2;
                }
            }
        }
        int low_index=0;
        int max_index=obj.regno.length-1;
        int mid_term=(low_index+max_index)/2;
        while (low_index<=max_index){
            if(obj.regno[mid_term].equals(y)){
                System.out.println("ATTENDANCE OF THE SEARCHED STUDENT BY BINARY SEARCH IS");
                System.out.println(obj.attendance[mid_term]);
                break;
            } else if (obj.regno[mid_term].compareTo(y)>0) {
                max_index=mid_term-1;
            }
            else{
                low_index=mid_term+1;
            }
            mid_term=(max_index+low_index)/2;
        }

    }
}
public class search {
    public static void main(String[] args) {
        searching obj2=new searching();
        System.out.println("ATTENDACE OF THE STUDENT SEARCHED BY LINEAR SEARCH IS");
        System.out.println(obj2.linearsearch("21bcb0038"));
        obj2.binarysearch("21bcb0038");

    }
}

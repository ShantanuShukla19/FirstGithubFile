import java.util.Scanner;
class complex{
    float i;
    complex(){
        i=1;
    }
    public void addition(){
        System.out.printf("%.2f + %.2f*j",i,i+1);
        i++;
        System.out.println();
    }
}
public class javamoodle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        complex obj=new complex();
        for (int j=0;j<n;j++){
            obj.addition();
        }
    }
}

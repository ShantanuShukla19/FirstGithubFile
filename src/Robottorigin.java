import java.util.Scanner;
public class Robottorigin {
    public static void main(String[] args) {
//        int x=0;
//        int y=0;
//        Scanner sc=new Scanner(System.in);
//        String str=sc.next();
//        int i;
//        for (i=0;i<str.length();i++){
//            if (str.charAt(i)=='L'){
//                x=x+1;
//            }
//            if (str.charAt(i)=='R'){
//                x=x-1;
//            }
//            if (str.charAt(i)=='U'){
//                y=y+1;
//            }
//            if (str.charAt(i)=='D'){
//                y=y-1;
//            }
//
//        }
//        if (x==0&&y==0){
//            System.out.println("True");
//        }
//        else {
//            System.out.println("False");
//        }
//    }
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int x=0;
        int i,j;
        int count=0;
        int count2=0;
        for(i=0;i<str.length();i++){
            for (j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;

                }
            }
            if(count==1){
                System.out.println(i);
                count2=0;
                break;
            }
            if (count>1){
                count2++;
            }


            count=0;
        }
        if (count2!=0){
            System.out.println(-1);
        }



    }
}
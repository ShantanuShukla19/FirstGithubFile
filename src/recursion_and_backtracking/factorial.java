package recursion_and_backtracking;

public class factorial {
    public int fac(int num){
        if(num<=1){
            return 1;
        }
        else{
            return num*fac(num-1);
        }
    }

    public static void main(String[] args) {
        factorial obj=new factorial();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(obj.fac(i));
        }
    }
}

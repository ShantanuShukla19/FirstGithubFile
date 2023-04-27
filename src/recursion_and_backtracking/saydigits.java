package recursion_and_backtracking;

public class saydigits {
    public void SayDigits(int n,String arr[]){
        if(n==0){
            return ;

        }
        int digits=n%10;
        n=n/10;
        SayDigits(n,arr);//aise vapas jayega to reverse ho jayega

        System.out.println(arr[digits]);

    }

    public static void main(String[] args) {
        String arr[]=new String[10];
        arr= new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        saydigits obj=new saydigits();
        obj.SayDigits(532,arr);
    }
}

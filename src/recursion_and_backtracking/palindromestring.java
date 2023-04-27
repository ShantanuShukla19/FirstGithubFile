package recursion_and_backtracking;

public class palindromestring {
    public static boolean reverse(String str,int ind){
        if(ind>str.length()-1){
            return false;
        }
        if(str.charAt(ind)==str.charAt(str.length()-ind-1)){
            return true;
        }
        return reverse(str,ind+1);
    }

    public static void main(String[] args) {
        System.out.println(reverse("AN",0));
    }
}

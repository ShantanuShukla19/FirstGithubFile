package recursion_and_backtracking;

public class towerofhanoi {
    public void TowerOfHanoi(int n,char frompeg,char topeg,char auxpeg){
        if(n==1){
            System.out.println("Move disk from "+frompeg+" to "+topeg);
            return;
        }

            TowerOfHanoi(n-1,frompeg,auxpeg,topeg);
            System.out.println("Move disc from "+frompeg+" to "+topeg);
            TowerOfHanoi(n-1,auxpeg,topeg,frompeg);
        }


    public static void main(String[] args) {
        towerofhanoi obj=new towerofhanoi();
        obj.TowerOfHanoi(3,'A','B','C');
    }
}

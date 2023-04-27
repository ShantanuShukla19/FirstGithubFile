package Stack;

public class twostackarray {
    private int arr[];
    private int top1;
    private int top2;
    private int length1;
    private int length2;
    int fullLength;

    twostackarray(int capacity) {
        arr = new int[capacity];
        fullLength = capacity;
        length1 = 0;
        length2=fullLength;
        top1 = -1;
        top2 = fullLength;
    }
    public void push1(int data){
        if(top2-top1>1){
            top1++;
            arr[top1]=data;
            length1++;
        }
        else{
            System.out.println("Stack overflow");
        }
    }
    public void push2(int data){
        if(top2-top1>1){
            --top2;
            arr[top2]=data;
        }
        else{
            System.out.println("Stack overflow");
        }
        length2--;
    }
    public int pop1(){
        if(top1>0){
            int ans=arr[top1];
            top1--;
            length1--;
            return ans;
        }
        else {
            return -1;
        }

    }
    public int pop2(){
        if(top2<fullLength){
            int ans=arr[top2];
            top1++;
            length2++;
            return ans;
        }
        else {
            return -1;
        }
    }

    public void traverse2(){
        for (int i = length1-1; i >=0 ; i--) {
            System.out.println(arr[i]);
        }
        for (int j=length2;j<fullLength;j++){
            System.out.println(arr[j]);
        }
    }

    public static void main(String[] args) {
        twostackarray obj=new twostackarray(5);
        obj.push1(2);
        obj.push1(43);
        obj.push2(22);
        obj.pop1();
        obj.traverse2();
    }
}
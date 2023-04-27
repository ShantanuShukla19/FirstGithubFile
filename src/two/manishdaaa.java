package two;
import java.lang.*;
import one.*;


class class1 extends class3 {
    int c=33;
    public void gtdata(){
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
    }
}
class class2 extends class3{
    int f=3323;
    public void gtdata(){
        System.out.println(f);
        System.out.println(a);
        System.out.println(b);
    }
}
public class manishdaaa {
    public static void main(String[] args) {
        class1 obj=new class1();
        obj.gtdata();
        class2 obj2=new class2();
        obj2.gtdata();
    }
}

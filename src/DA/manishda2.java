package DA;
abstract class Marks{
    public void getpercentage(){

    }
}
class Student1 extends Marks{
    float maths;
    float physics;
    float chem;
   Student1(float a,float b,float c){
       a=maths;
       b=physics;
       c=chem;
   }

    @Override
    public void getpercentage() {
        float per=((physics+chem+maths)/300)*100;
        System.out.println(per);
    }
}
class Student extends Marks{
    float maths;
    float physics;
    float chem;
    float bio;
    Student(float a,float b,float c,float d){
        a=maths;
        b=physics;
        c=chem;
        d=bio;
    }

    @Override
    public void getpercentage() {
        float per=((physics+chem+maths+bio)/400)*100;
        System.out.println(per);
    }
}
public class manishda2 {
   Student obj=new Student(32,97,54,21);
   Student1 obj1=new Student1(26,21,64);



}

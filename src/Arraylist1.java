import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<Integer>();
        ArrayList<String> list2=new ArrayList<>();

        //add;
        list1.add(58);
        list1.add(87);
        System.out.println(list1);
        //get
        int ele=list1.get(0);
        System.out.println(ele);
        //ele in between;
        list1.add(1,4);
        System.out.println(list1);
        //set elenet;//exchange krdega
        list1.set(0,3);
        System.out.println(list1);
        //delete;
        list1.remove(2);
        System.out.println(list1);
        //size;
        System.out.println(list1.size());
        //
        for (int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }
        //sort
        Collections.sort(list1);
        System.out.println(list1);
    }
}

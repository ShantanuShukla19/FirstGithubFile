import java.util.*;
public class hashing {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(232);
        set.add(31);
        // duplicate elemnets store nhi hote
        set.add(31);
        System.out.println(set);
        if(set.contains(232)){
            System.out.println("contains");;
        }
        //delete
        set.remove(31);
        System.out.println(set);
        //size;
        System.out.println(set.size());
      //Set ka index nhi hotaa
        set.add(22);
        set.add(223);
        Iterator it=set.iterator();
        //hasnextfunction
        //nextfunction
        while (it.hasNext()){
            //Unordered hote hai Hashset
            System.out.println(it.next());
        }
    }
}

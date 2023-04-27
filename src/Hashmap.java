import java.util.*;
public class Hashmap {
    //key unique rhti;
    public static void main(String[] args) {
        //country(key),pop(value)
        HashMap<String,Integer> map=new HashMap<>();
        //insert
        map.put("India",120);
        map.put("us",30);
        map.put("China",150);
        //HASHMAP UNORDERED PAIR HOTE
        System.out.println(map);
        map.put("China",180);
        //update hojati value
        System.out.println(map);
        //search
        if(map.containsKey("China")){
            System.out.println("present");
        }
        //getfuct;
        System.out.println(map.get("China"));
        System.out.println(map.get("dhdsaj"));//null ayega agr exists nhi keti
        int arr[]={12,14,231};
//        for (int i = 0; i < 3; i++) {
//            System.out.println(arr[i]);
//        }
//        for (int val:arr){
//            System.out.println(val);
//        }
        for(Map.Entry<String,Integer>e:map.entrySet()){//aise krte iterate
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
       // /aise bhi krskte
        Set<String> keys=map.keySet();
        for (String key:keys){
            System.out.println(key+map.get(key));
        }
        //remove;
        map.remove("China");
        System.out.println(map);
    }
}

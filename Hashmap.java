import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        //empployee ,salary
        HashMap<String,Integer> map=new HashMap<>();

        //insertion
        map.put("Devi",30000);
        map.put("kiran",50000);
        map.put("Radha",60000);
        System.out.println(map);
   
        // // search
        // if(map.containsKey("krish")){
        //     System.out.println("key present");
        // }else{
        //     System.out.println("key not present");
        // }

        // System.out.println(map.get("kiran"));// if key present then it returns value of that key 
        // System.out.println(map.get("mahi"));// if key not present then it returns the value as null


        // for(int val:arr)
// iterator
        for(Map.Entry<String,Integer>e:map.entrySet()){
 System.out.println(e.getKey());
 System.out.println(e.getValue());
        }

        map.remove("Devi");
        System.out.println(map);
    }
}
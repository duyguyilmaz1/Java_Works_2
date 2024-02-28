package collections;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {

        Map<Integer,String> hashMap= new HashMap<>();
        Map<Integer,String> linkedHashMap= new LinkedHashMap<>();
        Map<Integer,String> treeMap= new TreeMap<>();

        System.out.println("********************************");
        mapYazdir(hashMap);
        System.out.println("********************************");
        mapYazdir(linkedHashMap);
        System.out.println("********************************");
        mapYazdir(treeMap);

    }
    public static void mapYazdir(Map<Integer,String> map){
        map.put(10, "C++");
        map.put(20, "CSS");
        map.put(30, "PHP");
        map.put(40, "Java");
        map.put(50, "C");

//        for (Map.Entry<Integer,String> entry : map.entrySet()){
//            System.out.println("key: " + entry.getKey() + " value : " + entry.getValue());
//        }

      //  System.out.println(map.keySet());

//        for (Integer key :map.keySet()){
//            System.out.println("Key " + key + " value: " + map.get(key));
//        }

       Collection<String> values= map.values();
       for (String v: values){
           System.out.println("Values: " + v);
       }




    }
}

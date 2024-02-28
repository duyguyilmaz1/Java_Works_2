package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap= new HashMap<>();
        hashMap.put(10,"Java");
        hashMap.put(11,"Python");
        hashMap.put(12,"PHP");
        hashMap.put(13,"PHP");
        hashMap.put(14,"PHP");
        hashMap.put(11,"Javascript");

//        System.out.println(hashMap);
//        System.out.println(hashMap.get(12));
//        System.out.println(hashMap.get(10));

        for(Map.Entry<Integer,String> entry: hashMap.entrySet()){
            System.out.println("anahtar : " + entry.getKey() + " değer : " + entry.getValue());
        }



    }
}

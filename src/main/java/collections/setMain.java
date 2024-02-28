package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setMain {

    public static void main(String[] args) {

        Set<String> s1= new HashSet<>();
        Set<String> s2= new LinkedHashSet<>();
        Set<String> s3= new TreeSet<>();

        s1.add("Java");
        s1.add("Python");
        s1.add("C++");
        s1.add("Javascript");

        s2.add("Java");
        s2.add("Python");
        s2.add("C++");
        s2.add("Javascript");

        s3.add("Java");
        s3.add("Python");
        s3.add("C++");
        s3.add("Javascript");

//        System.out.println("***************Hashset********************");
//        for (String s: s1){
//            System.out.println(s);
//        }
//        System.out.println("***************LinkedHashSet********************");
//        for (String s: s2){
//            System.out.println(s);
//        }
//        System.out.println("***************TreeSet********************");
//        for (String s: s3){
//            System.out.println(s);
//        }

     /*   System.out.println(s1.contains("Go"));
        System.out.println(s1.contains("Java"));*/

     //   System.out.println(s1.isEmpty());

//        s1.remove("Java");
//
//        System.out.println("***************Hashset********************");
//        for (String s: s1){
//            System.out.println(s);
//        }

        Set<String> set1= new HashSet<>();
        Set<String> set2= new HashSet<>();

        set1.add("Ali");
        set1.add("Ahmet");
        set1.add("Mehmet");
        set1.add("Murat");
        set1.add("Mustafa");

        set2.add("Ayşe");
        set2.add("Murat");
        set2.add("Mehmet");

//        Set<String> fark= new HashSet<>(set2);
//        System.out.println(fark.removeAll(set1));
//        System.out.println(fark);

        Set<String> kesisim= new HashSet<>(set2);
        System.out.println(kesisim.retainAll(set1));
        System.out.println(kesisim);




    }
}

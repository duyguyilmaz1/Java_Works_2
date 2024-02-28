package collections;

import java.util.*;

public class VektorMain {
    public static void main(String[] args) {

        Vector<String> vector= new Vector<>();

        vector.add("Java");
        vector.add("Javascript");
        vector.add("PHP");
        vector.add("C");

//        for (String s : vector){
//            System.out.println(s);
//        }
//
//        ListIterator<String> iterator= vector.listIterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        Enumeration<String> enumeration= vector.elements();
//        while (enumeration.hasMoreElements()){
//            System.out.println(enumeration.nextElement());
//        }

        System.out.println("ilk eleman: " + vector.firstElement());
        System.out.println("son eleman: " + vector.lastElement());


        Stack<String> stack= new Stack<>();
        stack.push("java");
        stack.push("c++");
        stack.push("python");
        stack.push("php");

//        for (String s: stack){
//            System.out.println(s);
//        }
//
//        Enumeration<String> enumeration= stack.elements();
//        while(enumeration.hasMoreElements()){
//            System.out.println(enumeration.nextElement());
//        }
//
//        System.out.println("son eleman çıkarılıyor " + stack.pop());
//
//        for (String s: stack){
//            System.out.println(s);
//       }
        System.out.println(stack.empty());

        while (!stack.empty()){
            System.out.println("eleman çıkarılıyor " + stack.pop());
        }

    }
}

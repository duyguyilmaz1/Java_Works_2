import java.util.ArrayList;

public class Arr_List_Lesson {

    public static void yazdir(ArrayList<String> a){
        for (int i=0; i<a.size(); i++){
            System.out.println("Element " + (i+1) + ": " +a.get(i));
        }
    }
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Metallica");
        arr.add("Guns'n Roses");
        arr.add("Black Sabbad");
        arr.add("Metallica");
        arr.add("Iron Maiden");

//        System.out.println(arr.get(0));
//
//        System.out.println(arr.size());
//
//        arr.remove(2);

//        System.out.println(arr.indexOf("Metallica"));
//        System.out.println(arr.lastIndexOf("Metallica"));
//        System.out.println(arr.indexOf("Dream Theater")); // listede olmadığı için -1 döner
//
//        for (int i = 0; i<arr.size() ; i++) {
//            System.out.println(arr.get(i));
//        }

//        arr.set(4,"Megadeath");
//        for (int i = 0; i<arr.size() ; i++) {
//           System.out.println(arr.get(i));
//       }

        yazdir(arr);


    }
}

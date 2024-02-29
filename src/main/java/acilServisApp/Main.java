package acilServisApp;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue <Hasta> acilServis= new PriorityQueue<>();
        acilServis.offer(new Hasta("Ali" , "Yanık"));
        acilServis.offer(new Hasta("Ayşe" , "Baş ağrısı"));
        acilServis.offer(new Hasta("Ahmet" , "Yanık"));
        acilServis.offer(new Hasta("Can" , "Apandist"));
        acilServis.offer(new Hasta("Murat" , "Baş ağrısı"));
        acilServis.offer(new Hasta("Mustafa" , "Apandist"));

        int i=1;
        while(acilServis.isEmpty() != true){
            System.out.println("*******************************");
            System.out.println(i + "ıncı sırada");
            System.out.println(acilServis.poll());
            System.out.println("*******************************");
            i++;

        }
     }
}

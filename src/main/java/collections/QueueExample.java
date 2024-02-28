package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue= new LinkedList<>();
        queue.offer("Java");
        queue.offer("C");
        queue.offer("Javascript");
        queue.offer("PHP");

     //   System.out.println(queue.peek()); // kuyruğun en başındaki elemanı aldık

        for (String s : queue){
            System.out.println(s);
        }
        System.out.print("eleman çıkalarım: ");
        System.out.println(queue.poll());

        for (String s : queue){
            System.out.println(s);
        }
        while (!queue.isEmpty()){
            System.out.println("eleman çıkarılıyor: "  + queue.poll());

        }
    }
}

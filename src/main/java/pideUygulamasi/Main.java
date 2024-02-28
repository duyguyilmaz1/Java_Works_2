package pideUygulamasi;

import javax.swing.plaf.TableHeaderUI;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Ramazan pidesi uygulaması...");
        Random random= new Random();
        Queue<String> pideKuyrugu= new LinkedList<>();
        pideKuyrugu.offer("Ali");
        pideKuyrugu.offer("Ahmet");
        pideKuyrugu.offer("Mehmet");
        pideKuyrugu.offer("Murat");
        pideKuyrugu.offer("Mustafa");
        pideKuyrugu.offer("Can");
        pideKuyrugu.offer("Okan");
        pideKuyrugu.offer("Alp");
        pideKuyrugu.offer("Alper");
        pideKuyrugu.offer("Recep");

        int pideSayisi= 1+ random.nextInt(10);
        System.out.println("Pideler çıkıyor...");
        System.out.println("Çıkan pide sayısı: " + pideSayisi);
        Thread.sleep(3000);

        while (pideSayisi!=0){
            System.out.println(pideKuyrugu.poll() + " pideyi aldı..");
            pideSayisi--;
            Thread.sleep(1000);
        }
        System.out.println("pide kalmadı!");

    }
}

package GeometrikSekilHesapla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String islemler= "İşlemler..\n" +
                "1. Kare alan hesapla \n" +
                "2. Üçgen alan hesapla \n" +
                "3. Daire alan hesapla\n" +
                "Çıkış : q";

        while(true){
            System.out.println(islemler);
            System.out.println("Hangi şeklin alanını hesaplamak istiyorsunuz? ");
            String sekilTuru= scanner.nextLine();
            Sekil sekil=null;
            if (sekilTuru.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
            } else if (sekilTuru.equals("1")) {
                System.out.print("Karenin kenarı: ");
                int kenar= scanner.nextInt();
                scanner.nextLine();

                sekil= new Kare("Kare 1" , kenar);
                sekil.alanHesapla();
            } else if (sekilTuru.equals("2")) {
                System.out.print("Kenar 1:");
                int kenar1= scanner.nextInt();
                System.out.print("Kenar 2:");
                int kenar2= scanner.nextInt();
                System.out.print("Kenar 3:");
                int kenar3= scanner.nextInt();
                scanner.nextLine();

                sekil = new Ucgen("Ucgen 1 " , kenar1 , kenar2, kenar3);

                sekil.alanHesapla();
            } else if (sekilTuru.equals("3")) {
                System.out.println("Dairenin yarıcapı :");
                int yaricap= scanner.nextInt();
                scanner.nextLine();
                sekil= new Daire("Daire 1" , yaricap);
                sekil.alanHesapla();
            }else {
                System.out.println("Geçersiz işlem...");
            }
        }
    }
}

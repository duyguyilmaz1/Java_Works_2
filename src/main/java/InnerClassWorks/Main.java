package InnerClassWorks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Math ve Physic proglemleri uygulamasına hoş geldiniz..");
        String islemler= "İşlemler...\n" +
                "1. Daire alanı hesaplama\n" +
                "2. Ucgen cevresi hesaplama\n" +
                "3. 2 vektörün iç çarpımını hesaplama\n" +
                " Çıkış : q";

        while(true){
            System.out.println(islemler);
            System.out.println("İşlem seçiniz");
            String islem= scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("programdan çıkılıyor");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Dairenin yarıçapı:");
                int yaricap= scanner.nextInt();
                scanner.nextLine();

                Problem.Math.daireAlan(yaricap);
            } else if (islem.equals("2")) {
                System.out.println("Kenar 1:");
                int kenar1= scanner.nextInt();
                System.out.println("Kenar 2:");
                int kenar2= scanner.nextInt();
                System.out.println("Kenar 3:");
                int kenar3= scanner.nextInt();
                scanner.nextLine();
                Problem.Math.ucgenCevresi(kenar1,kenar2,kenar3);

            } else if (islem.equals("3")) {
                Vec vec1= new Vec("Vektör1");
                Vec vec2= new Vec("Vektör2");

                Problem.Physic.icCarpim(vec1,vec2);
            }
            else System.out.println("Geçersiz işlem");
        }
    }
}

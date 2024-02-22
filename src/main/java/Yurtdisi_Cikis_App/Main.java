package Yurtdisi_Cikis_App;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz...");

        String sartlar= "Yurtdışı çıkış kuralları \n"
                + "Herhangi bir siyasi yasağınız bulunmamalıdır. \n" +
                "250TL harç bedelinizi tam olarak yatırmalısınız \n" +
                "Gideceğiniz ülkeye vizenizin bulunması gerekiyor..";

        String mesaj= "Yurtdışı şartlarından hepsini sağlamalısınız..";

        while(true){
            System.out.println("******************************************************");
            System.out.println(sartlar);
            System.out.println("******************************************************");


            Yolcu yolcu = new Yolcu();

            System.out.println("Harç bedeli kontrol ediliyor...");
            Thread.sleep(3000);

            if(yolcu.yurtdisiHarciKontrol()== false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000);

            if (yolcu.siyasiYasakKontrol()== false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(3000);

            if (yolcu.vizeDurumuKontrol()== false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("İşlemleriniz tamam, yurtdışına çıkabilirsiniz...");
            break;

        }
    }
}

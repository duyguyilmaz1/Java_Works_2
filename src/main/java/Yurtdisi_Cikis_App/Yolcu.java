package Yurtdisi_Cikis_App;

import java.util.Scanner;

public class Yolcu implements Yurtdisi_kurallari {
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Yatırdığnız harç bedeli: ");
        this.harc=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Siyasi yasağınız bulunuyor mu? (evet -hayır");

        String cevap= scanner.nextLine();
        if (cevap.equals("evet")){
            this.siyasiYasak=true;
        }
        else {
            this.siyasiYasak=false;
        }

        System.out.println("Vizeniz bulunuyor mu? (evet-hayır");
        String cevap2=scanner.nextLine();

        if (cevap2.equals("evet")){
            this.vizeDurumu=true;
        }else{
            this.vizeDurumu=false;
        }
    }

    @Override
    public boolean yurtdisiHarciKontrol() {
        if(this.harc< 250){
            System.out.println("lütfen yurtdışı çıkış harcını tam yatırın");
            return false;
        }else{
            System.out.println("yurtdışı harç işlemi uygundur");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak==true){
            System.out.println("Siyasi yasağınız bulunduğundan dolayı yurtdışına çıkış yapamazsınız");
            return false;
        }else {
            System.out.println("Bu yolcu için siyasi yasak yoktur");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
       if (this.vizeDurumu){
           System.out.println("vize işlemleri tamamdır");
           return true;
       }else {
           System.out.println("vizeniz gideceğiniz ülke için uygun değildir.");
           return false;
       }
    }
}

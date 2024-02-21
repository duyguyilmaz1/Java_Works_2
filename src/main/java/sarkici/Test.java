package sarkici;

import java.util.Scanner;

public class Test {
    private static  Sarkicilar sarkicilar= new Sarkicilar();
    private static Scanner scanner= new Scanner(System.in);
    public static void islemleri_yazdir(){
        System.out.println("\t 0- İşlemleri Görüntüle");
        System.out.println("\t 1- Şarkıcıları Görüntüle");
        System.out.println("\t 2- Şarkıcı Ekle");
        System.out.println("\t 3- Şarkıcı Güncelle");
        System.out.println("\t 4- Şarkıcı Sil");
        System.out.println("\t 5- Şarkıcı Ara");
        System.out.println("\t 6- Uygulamadan Çıkış");
    }

    public static void goruntule(){
        sarkicilar.sarkicilari_bastir();
    }

    public static void sarkici_ekle(){
        System.out.println("Eklemek istediğiniz şarkıcının ismini giriniz: ");
        String isim= scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
    }
    public static void sarkici_guncelle(){
        System.out.println("Güncellemek istediğiniz pozisyonu giriniz ( 1,2,3 ): ");
        int pozisyon= scanner.nextInt();
        scanner.nextLine();
        String yeniIsim= scanner.nextLine();
        sarkicilar.sarkici_guncelle(yeniIsim, pozisyon-1);
    }
    public static void sil(){
        System.out.println("Silmek istediğiniz pozisyonu giriniz (1,2,3): ");
        int pozisyon= scanner.nextInt();

        sarkicilar.sarkici_sil(pozisyon-1);
    }
    public static void ara(){
        System.out.println("Aramak istediğiniz şarkıcı ismini giriniz: ");
        String isim= scanner.nextLine();
        sarkicilar.sarkici_ara(isim);
    }

    public static void main(String[] args) {

        System.out.println("\t Şarkıcı Uygulamasına hoşgeldiniz");

        islemleri_yazdir();

        boolean cikis= false;
        int islem;
        while(!cikis){
            System.out.println("İşlem seçiniz: ");
            islem= scanner.nextInt();
            scanner.nextLine(); // dummy kod
            switch (islem){
                case 0:
                    islemleri_yazdir();
                    break;
                case 1:
                    goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis=true;
                    System.out.println("uygulamadan çıkılıyor");
                    break;

            }
        }
    }
}

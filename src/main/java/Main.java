import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Çalışanlar programına hoşgeldiniz");
        String islemler= "İşlemler...\n"
                + "1. yazılımcı işlemleri\n"
                + "2. yönetici işlemleri\n"
                + "çıkış için Q'ya basınız";
        System.out.println("**************************************");
        System.out.println(islemler);
        System.out.println("**************************************");

        while (true){
            System.out.println("İşlemi seçiniz: ");
            String islem= scanner.nextLine();

            if (islem.equals("Q")){
                System.out.println("Programdan çıkılıyor");
                break;
            }
            else if(islem.equals("1")){
                Yazilimci yazilimci= new Yazilimci("Duygu ", "Yılmaz", 777, "Java, JavaScript");
                String yazilimci_islem= "1. Format At\n"
                        +"2. Bilgileri Göster\n"
                        +"Çıkış için Q'ya basınız.";
                System.out.println(yazilimci_islem);
                while(true){
                    System.out.println("İşlemi seçiniz: ");
                    String y_islem= scanner.nextLine();

                    if (y_islem.equals("Q")){
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.println("işletim sistemi: ");
                        String isletim_sistemi= scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    } else if (y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    }else System.out.println("Geçersiz yazılımcı işlemi..");

                }

            }else if(islem.equals("2")){
                Yonetici yonetici= new Yonetici("Ada","Yılmaz",444, 10);
                String yonetici_islem= "Yönetici işlemleri\n"
                        + "1. Zam Yap\n"
                        +"2. Bilgileri Göster\n"
                        +"Çıkış için Q'ya basınız..";

                System.out.println(yonetici_islem);

                while(true){
                    System.out.println("İşlemi seçiniz: ");
                    String y_islem= scanner.nextLine();
                    if (y_islem.equals("Q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.println("Yöneticinin ne kadar zam yapması gerekiyor?");
                        int zamMiktari= scanner.nextInt();

                        scanner.nextLine();

                        yonetici.zamYap(zamMiktari);
                    } else if (y_islem.equals("2")) {
                        yonetici.bilgileriGoster();
                    }else System.out.println("Geçersiz yönetici işlemi...");
                }

            }else System.out.println("Geçersiz işlem");
        }
    }
}

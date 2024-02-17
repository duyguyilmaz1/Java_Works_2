import java.util.Scanner;

public class asal_sayi_kontrol {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi= scanner.nextInt();

       int asalDurumKontrol=0;

        for (int i=2; i<sayi/2; i++){
            if (sayi%2==0){
                asalDurumKontrol++;
                break;
            }
        }
        if (asalDurumKontrol==0){
            System.out.println("sayınız asal sayıdır");
        }else System.out.println("sayınız asal değildir");

    }
}

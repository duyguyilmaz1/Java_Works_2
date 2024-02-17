import java.util.Scanner;

public class mukemmel_sayi {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Kontrol etmek istediğiniz sayıyı giriniz: ");
        int sayi= scanner.nextInt();

        int carpanToplam=0;

        for(int i=1; i<=sayi/2; i++ ){
            if(sayi%i==0){
                carpanToplam+=i;
            }
        }
            if (carpanToplam == sayi){
                System.out.println("sayınız mükemmel sayıdır.");
            }else
            {System.out.println("sayınız mükemmel sayı değildir.");
            }

    }
}

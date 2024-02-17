import java.util.Arrays;
import java.util.Scanner;

public class en_buyuk_sayi {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int[] sayilar = new int[4];

    System.out.println("Lütfen 4 sayı giriniz:");

        for (int i = 0; i < 4; i++) {
        sayilar[i] = scanner.nextInt();
        }

        int maxSayi= Arrays.stream(sayilar).max().orElseThrow();
        System.out.println("girdiğiniz en büyük sayı: " + maxSayi);
}
}

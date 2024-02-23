package generics;

public class Test {

    public static void main(String[] args) {
     /*   Character[] char_dizi = {'J', 'A', 'V', 'A'};
        Integer[] integer_dizi = {1, 8, 6, 7, 9};
        String[] string_dizi = {"Java", "Python", "C++"};
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Duygu"), new Ogrenci("Ali"), new Ogrenci("Mehmet")};

        yazdir(char_dizi);
        yazdir(string_dizi);
        yazdir(integer_dizi);
        yazdir(ogrenci_dizi);
    }

    public static <E> void yazdir(E[] dizi) {
        for (E e : dizi) {
            System.out.println(e);
        } */
        Sayisal sayisal1= new Sayisal(30,40,20,30);
        Sayisal sayisal2= new Sayisal(25,45,2,35);
        Sayisal birinci= birinci(sayisal1 ,sayisal2);

        EsitAgirlik esitAgirlik1= new EsitAgirlik(30,20,40,20);
        EsitAgirlik esitAgirlik2= new EsitAgirlik(40,10,50,0);
        EsitAgirlik birinci2= birinci(esitAgirlik1,esitAgirlik2);

        System.out.println("Birinci Sayısal öğrencinin puanı : " + birinci.puanHesapla());
        System.out.println("Birinci EA öğrencinin puanı : " + birinci2.puanHesapla());

    }
    public static <E extends Aday> E birinci(E e1, E e2){
        if (e1.puanHesapla() > e2.puanHesapla()){
            return e1;
        } else{
            return e2;
        }
    }
}

package abonelik;

public class Main {
    public static void main(String[] args) {

//        abonelik.Abone abone= new abonelik.Abone();
//        abone.isim="Duygu Yılmaz";
//        abone.bakiye=200;
//        abone.sehir="İstanbul";
//
//        abone.kontor_kullan(200);

        GelismisAbone abone= new GelismisAbone("Ahmet Yılmaz" , 200, "Ankara");
        abone.bakiyeOgren();

    }
}

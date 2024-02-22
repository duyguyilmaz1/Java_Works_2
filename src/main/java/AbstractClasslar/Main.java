package AbstractClasslar;

public class Main {
    public static void main(String[] args) {

        Sekil sekil;
        sekil= new Kare("kare2", 6);
        sekil.alanHesapla();

       Kare kare1= new Kare("kare1" , 5);
       Daire daire1= new Daire("daire1" , 3);

       kare1.alanHesapla();
       daire1.alanHesapla();

       kare1.cevreHesapla();
    }
}

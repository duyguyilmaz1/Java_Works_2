package polymorphism_basic1;
// polymorphism örneği:

class Hayvan{
    private String isim;
    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){
        return "Hayvan konuşabiliyor..";
    }
}

class Kedi extends Hayvan{
    public Kedi(String isim) {
        super(isim);
    }
    @Override
    public String konus() {
      return this.getIsim() + " miyavlıyor..";
    }
}

class Kopek extends Hayvan{
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havlıyor..";
    }
}

class Kus extends Hayvan{
    public Kus(String isim) {
        super(isim);
    }
    @Override
    public String konus() {
        return this.getIsim() + " şakıyor...";
    }
}
public class Main {
    public static void konustur(Object object){
//        System.out.println(object.konus());
        if (object instanceof Kopek){
            Kopek kopek= (Kopek) object;
            System.out.println(kopek.konus());
        } else if (object instanceof Kedi) {
            Kedi kedi= (Kedi) object;
            System.out.println(kedi.konus());
        } else if (object instanceof Kus) {
            Kus kus= (Kus) object;
            System.out.println(kus.konus());
        } else if (object instanceof Hayvan) {
            Hayvan hayvan= (Hayvan) object;
            System.out.println(hayvan.konus());
        }
    }
    public static void main(String[] args) {

//        polymorphism_basic1.Hayvan hayvan1= new polymorphism_basic1.Kedi("Tekir");
//        System.out.println(hayvan1.konus());
//
//        polymorphism_basic1.Hayvan hayvan2= new polymorphism_basic1.Kopek("Karabas");
//        System.out.println(hayvan2.konus());
//
//        polymorphism_basic1.Hayvan hayvan3=new polymorphism_basic1.Kus("CiciKuş");
//        System.out.println(hayvan3.konus());

//        konustur(new Kedi("Tekir"));
//        konustur(new Kopek("Karabas"));
//        konustur(new Kus("CiciKuş"));

//        Kopek kopek= new Kopek("Karabas");
//        if (kopek instanceof Hayvan){
//            System.out.println("Bu nesne hayvan sınıfındandır");
//        }

        Kopek kopek= new Kopek("Karabas");
        Kedi kedi= new Kedi("Tekir");
        Kus kus= new Kus("Cicikuş");
        Hayvan hayvan= new Hayvan("Limon");

        konustur(kopek);
        konustur(kedi);
        konustur(kus);
        konustur(hayvan);





    }


}

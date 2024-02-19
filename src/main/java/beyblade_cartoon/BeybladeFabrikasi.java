package beyblade_cartoon;

public class BeybladeFabrikasi {
    public Beyblade beybladeUret(String beybladeTuru){
        if (beybladeTuru.equals("Dragon")){
            return new Dragon("Takao", 800,300, "Mavi Ejderha" ,"Kutsal Canavar ile konuşmak");

        }else if (beybladeTuru.equals("Dranza")){
            return new Dranza("Kai" ,600 ,400 ,"Kırmızı Anka Kuşu");

        }else if (beybladeTuru.equals("Drayga")){
            return new Drayga("Rei" ,800 ,250 ,"Beyaz Kaplan");
        }
        else if (beybladeTuru.equals("Draciel")){
            return new Draciel("Max" ,400 ,1000 ,"Kara Kaplumbağa");
        }
        else {
            return null;
        }
    }
}

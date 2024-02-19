package abonelik;

public class GelismisAbone {

    private String isim;
    private int bakiye=120;
    private String sehir;

    public GelismisAbone(String isim, int bakiye, String sehir){
        this.isim=isim;
        if(this.bakiye>= 0  && bakiye <=120){
            this.bakiye=bakiye;
        } else System.out.println("Bakiye 0-120 TL arasında girilmelidir");
        this.sehir=sehir;
    }

    public void kontor_kullan(int miktar){
        if ((this.bakiye-miktar) <0){
            System.out.println("Yeterli Bakiye Yoktur");
        }else{
            this.bakiye-=miktar;
            if (this.bakiye<=0){
                System.out.println("bakiyeniz bitmiştir..Max. 120TL'lik bakiye yüklenebilir");
            }else {
                System.out.println("yeni bakiye: " + bakiye);
            }
        }
    }
    public void bakiyeOgren(){
        System.out.println("Bakiye= " + bakiye);
    }


}

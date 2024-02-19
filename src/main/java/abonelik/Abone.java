package abonelik;

public class Abone {

    public String isim;
    public int bakiye;
    public String sehir;

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

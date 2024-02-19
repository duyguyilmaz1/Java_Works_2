package composition;

public class Test {
    public static void main(String[] args) {
        Resolution resolution= new Resolution(1920, 1080);
        Monitor monitor= new Monitor("VS-197DE", "Asus", "18.5", resolution);
        Kasa kasa= new Kasa("ShadowBlade", "Shadow", "Cam");
        Anakart anakart= new Anakart("B250", "Asus", 10,"Windows");

        Bilgisayar pc= new Bilgisayar(monitor, kasa, anakart);

        pc.getKasa().bilgisayari_ac();
        pc.getMonitor().monitoru_kapat();
        pc.getAnakart().isletimSistemiYukle("Ubuntu 24.05");
    }
}

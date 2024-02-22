import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Iterator_example {
    public static void islemleri_yazdır(){
        System.out.println("0 - İşlemleri görüntüle");
        System.out.println("1 - Bir sonraki şehre git");
        System.out.println("2 - Bir önceki şehre git");
        System.out.println("3 - Uygulamadan çık");

    }
    public static void tour(LinkedList<String> cities){
        ListIterator<String> iterator= cities.listIterator();

        int islem;

        islemleri_yazdır();

        Scanner scanner= new Scanner(System.in);

        if(!iterator.hasNext()){
            System.out.println("Herhangi bir şehir bulunmuyor...");
        }
        boolean cikis= false;
        boolean ileri= true;

        while(!cikis){
            System.out.println("Bir işlem seçiniz: ");
            islem= scanner.nextInt();

            switch (islem){
                case 0:
                    islemleri_yazdır();
                    break;
                case 1:
                    if(!ileri){
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                        ileri=true;
                    }
                    if (iterator.hasNext()){
                        System.out.println("Şehre gidiliyor: " + iterator.next());
                    }
                    else {
                        System.out.println("Gidilecek şehir kalmadı...");
                        ileri=true;
                    }
                    break;
                case 2:
                    if (ileri){
                        if (iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri=false;
                    }
                    if (iterator.hasPrevious()){
                        System.out.println("Şehre gidiliyor: " + iterator.previous());
                    }
                    else {
                        System.out.println("Şehir turu başladı");
                    }
                        break;
                case 3:
                    cikis=true;
                    System.out.println("uygulamadan çıkılıyor");
                    break;
            }
        }
    }
    public static void main(String[] args) {

        LinkedList <String> cities= new LinkedList<>();
        cities.add("Rome");
        cities.add("NY");
        cities.add("Paris");
        cities.add("Prag");
        cities.add("Berlin");

        tour(cities);
    }
}

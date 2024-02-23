package InnerClassWorks;

public class Problem {

    public static class Math{
        public static void daireAlan(int yaricap){
            System.out.println("Dairenin Alanı: " + (java.lang.Math.PI *yaricap*yaricap));
        }
        public static void ucgenCevresi(int kenar1, int kenar2, int kenar3){
            System.out.println("Üçgenin Çevresi: " + (kenar1 + kenar2 + kenar3));
        }
    }
    public static class Physic{
        public static void icCarpim(Vec vec1, Vec vec2){
            int iccarpim= vec1.getI() * vec2.getI() + vec1.getJ() * vec2.getJ()+ vec1.getK() * vec2.getK();
            System.out.println(vec1.getIsim() + " ile " + vec2.getIsim()+ " in ic carpimi : " + iccarpim);
        }
    }
}

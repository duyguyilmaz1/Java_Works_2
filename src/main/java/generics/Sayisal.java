package generics;

public class Sayisal extends Aday {
    public Sayisal(int turkce, int matematik, int fizik, int kimya) {
        super(turkce, matematik, fizik, kimya);
    }

    @Override
    public int puanHesapla() {
        return getTurkce() * 5 + getMatematik()*5 + getFizik()*4 + getKimya()*1;
    }
}

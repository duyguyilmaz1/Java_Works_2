package generics;

public class EsitAgirlik extends Aday{
    public EsitAgirlik(int turkce, int matematik, int fizik, int kimya) {
        super(turkce, matematik, fizik, kimya);
    }

    @Override
    public int puanHesapla() {
        return getTurkce() * 8 + getMatematik()*4 + getFizik()*3 + getKimya()*3;
    }
}

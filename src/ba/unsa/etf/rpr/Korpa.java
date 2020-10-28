package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] artikli;

    public Korpa() {
        this.artikli = new Artikl[50];
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public boolean dodajArtikl(Artikl a) {
        for(int i = 0; i < 50; i++) {
            if(artikli[i] == null) {
                artikli[i] = a;
                return true;
            }
        }
        return false;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i = 0; i < artikli.length; i++) {
            if(artikli[i] != null && artikli[i].kod.equals(kod)) {
                Artikl temp = artikli[i];
                artikli[i] = null;
                return temp;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijena = 0;
        for (int i = 0; i < 50; i ++) {
            if (artikli[i] != null) ukupnaCijena = ukupnaCijena + artikli[i].cijena;
        }
        return ukupnaCijena;
    }
}

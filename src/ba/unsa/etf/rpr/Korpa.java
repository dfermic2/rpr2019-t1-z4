package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];

    public int getBrElemenata() {
        return brElemenata;
    }

    private int brElemenata = 0;

    /*public Korpa() {
        this.artikli = new Artikl[50];
    }*/

    public Artikl[] getArtikli() {
        return artikli;
    }

    public boolean dodajArtikl(Artikl a) {
        for(int i = 0; i < 50; i++) {
            if(artikli[i] == null) {
                artikli[i] = a;
                brElemenata++;
                return true;
            }
        }
        return false;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i = 0; i < artikli.length; i++) {
            if(artikli[i] != null && artikli[i].getKod().equals(kod)) {
                Artikl temp = artikli[i];
                artikli[i] = null;
                brElemenata--;
                return temp;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijena = 0;
        for (int i = 0; i < 50; i ++) {
            if (artikli[i] != null) ukupnaCijena = ukupnaCijena + artikli[i].getCijena();
        }
        return ukupnaCijena;
    }
}

package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl [] artikli = new Artikl[1000];

    /*public Supermarket() {
        this.artikli = new Artikl[1000];
    }*/

    public boolean dodajArtikl(Artikl artikl) {
        for(int i = 0; i < artikli.length; i++) {
            if(artikli[i] == null) {
                artikli[i] = artikl;
                return true;
            }
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return artikli;
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
}

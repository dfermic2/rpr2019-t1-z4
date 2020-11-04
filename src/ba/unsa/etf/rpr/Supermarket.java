package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl [] artikli = new Artikl[1000];

    private int brElemenata = 0;

    public int getBrElemenata() {
        return brElemenata;
    }


    /*public Supermarket() {
        this.artikli = new Artikl[1000];
    }*/

    public boolean dodajArtikl(Artikl artikl) {
        for(int i = 0; i < artikli.length; i++) {
            if(artikli[i] == null) {
                artikli[i] = artikl;
                brElemenata++;
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
            if(artikli[i] != null && artikli[i].getKod().equals(kod)) {
                Artikl temp = artikli[i];
                artikli[i] = null;
                brElemenata--;
                return temp;
            }
        }
        return null;
    }
}

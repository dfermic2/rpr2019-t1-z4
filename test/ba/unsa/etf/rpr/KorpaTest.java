package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void getArtikli() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("test", 150, "10"));
        Artikl[] artikli = korpa.getArtikli();
        assertAll(
                () -> assertEquals("test", artikli[0].getNaziv()),
                () -> assertEquals(150, artikli[0].getCijena()),
                () -> assertEquals("10", artikli[0].getKod())
        );
    }

    @Test
    void dodajArtikl() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("test", 150, "10"));
        assertEquals(1,korpa.getBrElemenata());
        korpa.dodajArtikl(new Artikl("test2", 45, "14"));
        assertEquals(2,korpa.getBrElemenata());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("test", 150, "10"));
        korpa.izbaciArtiklSaKodom("10");
        assertAll(
                () -> assertEquals(0,korpa.getBrElemenata()),
                () -> assertNull(korpa.izbaciArtiklSaKodom("8"))
        );
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("test", 150, "10"));
        korpa.dodajArtikl(new Artikl("test2", 45, "14"));
        assertEquals(195, korpa.dajUkupnuCijenuArtikala());
    }
}
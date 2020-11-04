package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("test", 150, "10"));
        assertEquals(1,supermarket.getBrElemenata());
    }

    @Test
    void getArtikli() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("test", 150, "10"));
        Artikl[] artikli = supermarket.getArtikli();
        assertAll(
                () -> assertEquals("test", artikli[0].getNaziv()),
                () -> assertEquals(150, artikli[0].getCijena()),
                () -> assertEquals("10", artikli[0].getKod())
        );
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("test", 150, "10"));
        supermarket.izbaciArtiklSaKodom("10");
        assertAll(
                () -> assertEquals(0,supermarket.getBrElemenata()),
                () -> assertNull(supermarket.izbaciArtiklSaKodom("8"))
        );
    }
}
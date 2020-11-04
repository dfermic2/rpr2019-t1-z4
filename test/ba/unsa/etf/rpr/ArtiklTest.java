package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl artikl = new Artikl("art1", 20, "5");
        assertEquals("art1", artikl.getNaziv());
    }

    @Test
    void getCijena() {
        Artikl artikl = new Artikl("art1", 20, "5");
        assertEquals(20, artikl.getCijena());
    }

    @Test
    void getKod() {
        Artikl artikl = new Artikl("art1", 20, "5");
        assertEquals("5", artikl.getKod());
    }

}
package cookies;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MasterOrderTest {

    @Test
    public void shouldReturnTotalBoxesOfOne() {

        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder(" ", 1);
        CookieOrder cookieOrderTest2 = new CookieOrder(" ", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        int check = underTest.getTotalBoxes();

        assertEquals(1, check);

    }

    @Test
    public void shouldReturnTotalBoxesOfTwo() {

        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder(" ", 1);
        CookieOrder cookieOrderTest2 = new CookieOrder(" ", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        int check = underTest.getTotalBoxes();

        assertEquals(2, check);
    }

    @Test
    public void shouldReturnTotalBoxesAsOneAfterRemoval() {
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder(" thin mints", 1);
        CookieOrder cookieOrderTest2 = new CookieOrder("samoas ", 1);
        CookieOrder cookieOrderTest3 = new CookieOrder(" thin mints", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        underTest.addOrder(cookieOrderTest3);
        underTest.removeVariety("thin mints");
        int check = underTest.getTotalBoxes();
        assertEquals(1, check);

    }

    @Test
    public void shouldReturnTotalBoxesOf2ForThinMints() {
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder(" thin mints", 1);
        CookieOrder cookieOrderTest2 = new CookieOrder("samoas ", 1);
        CookieOrder cookieOrderTest3 = new CookieOrder(" thin mints", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        underTest.addOrder(cookieOrderTest3);
        int check = underTest.getVarietyBoxes("thin mints");
        assertEquals(2, check);
    }
}

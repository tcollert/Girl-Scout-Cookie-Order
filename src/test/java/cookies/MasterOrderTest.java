package cookies;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MasterOrderTest {
    private MasterOrder underTest;

    @BeforeEach
    public void setup() {
        underTest = new MasterOrder();

        CookieOrder cookieOrderTest = new CookieOrder("Thin Mints ", 5);
        CookieOrder cookieOrderTest2 = new CookieOrder("Samoas ", 2);
        CookieOrder cookieOrderTest3 = new CookieOrder("Tagalongs ", 1);
        CookieOrder cookieOrderTest4 = new CookieOrder("Lemonades ", 3);

        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        underTest.addOrder(cookieOrderTest3);
        underTest.addOrder(cookieOrderTest4);

    }

    @Test
    public void testGetTotalBoxes() {

        int check = underTest.getTotalBoxes();

        assertEquals(11, check);

    }

    @Test
    public void testRemoveVariety() {

        underTest.removeVariety("Samoas ");

        assertEquals(9, underTest.getTotalBoxes());

    }

    @Test
    public void testGetVarietyBoxes() {

        CookieOrder cookieOrderTest5 = new CookieOrder("Lemonades ", 3);

        underTest.addOrder(cookieOrderTest5);
        int check = underTest.getVarietyBoxes("Lemonades ");

        assertEquals(6, check);
    }

}

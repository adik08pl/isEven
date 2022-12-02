import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class isEvenTest {

    @org.junit.jupiter.api.Test
    public void testIsEven() {
        Main x = new Main();
        assertTrue(x.isEven(0));
    }
    @org.junit.jupiter.api.Test
    public void testIsEven2() {
        Main x = new Main();
        assertTrue(x.isEven(2));
    }
    @org.junit.jupiter.api.Test
    public void testIsEven3() {
        Main x = new Main();
        assertFalse(x.isEven(4));
    }
    @org.junit.jupiter.api.Test
    public void testIsEven4() {
        Main x = new Main();
        assertFalse(x.isEven(453123));
    }
    @org.junit.jupiter.api.Test
    public void testIsEven5() {
        Main x = new Main();
        assertTrue(x.isEven(-42));
    }
}

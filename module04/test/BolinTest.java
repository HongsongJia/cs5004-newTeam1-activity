import org.junit.Test;
import static org.junit.Assert.*;

public class BolinTest {

    @Test
    public void testFactorialZero() {
        assertEquals(0, Bolin.factorial(0));
    }

    @Test
    public void testFactorialOne() {
        assertEquals(1, Bolin.factorial(1));
    }

    @Test
    public void testFactorialFive() {
        assertEquals(120, Bolin.factorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        Bolin.factorial(-1);
    }
}

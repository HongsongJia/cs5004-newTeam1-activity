import org.junit.Test;
import static org.junit.Assert.*;

public class BolinTest {

    @Test
    public void testnoxZero() {
        assertEquals("ab", Bolin.nox("ab"));
    }

    @Test
    public void testnoxOne() {
        assertEquals("cd", Bolin.nox("cxdxxxx"));
    }
    @Test
    public void testnoxNull() {
        assertEquals("", Bolin.nox("xxxx"));
    }
}

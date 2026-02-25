import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PowerNTest {

    @Test
    public void testPowerN_exp0() {
        assertEquals(1, PowerN.powerN(5, 0));   // = 1
    }

    @Test
    public void testPowerN_base1() {
        assertEquals(1, PowerN.powerN(1, 100)); // = 1
    }


    @Test
    public void testPowerN_base2_exp10() {
        assertEquals(1024, PowerN.powerN(2, 10)); // 2^10 = 1024
    }


    @Test
    public void testPowerN_base0_exp3() {
        assertEquals(0, PowerN.powerN(0, 3));     // 0^3 = 0
    }
}
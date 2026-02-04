package module03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HongkunTest {

    @Test
    void test_bothNonEmpty() {
        Hongkun h = new Hongkun();
        int[] res = h.front11(new int[]{1, 2, 3}, new int[]{7, 9, 8});
        assertArrayEquals(new int[]{1, 7}, res);
    }

    @Test
    void test_aLength1_bLength1() {
        Hongkun h = new Hongkun();
        int[] res = h.front11(new int[]{1}, new int[]{2});
        assertArrayEquals(new int[]{1, 2}, res);
    }

    @Test
    void test_bEmpty() {
        Hongkun h = new Hongkun();
        int[] res = h.front11(new int[]{1, 7}, new int[]{});
        assertArrayEquals(new int[]{1}, res);
    }

    @Test
    void test_aEmpty() {
        Hongkun h = new Hongkun();
        int[] res = h.front11(new int[]{}, new int[]{5, 6});
        assertArrayEquals(new int[]{5}, res);
    }

    @Test
    void test_bothEmpty() {
        Hongkun h = new Hongkun();
        int[] res = h.front11(new int[]{}, new int[]{});
        assertArrayEquals(new int[]{}, res);
    }

    @Test
    void test_negativeNumbers() {
        Hongkun h = new Hongkun();
        int[] res = h.front11(new int[]{-1, 2}, new int[]{-7, 9});
        assertArrayEquals(new int[]{-1, -7}, res);
    }

    @Test
    void test_zeroAsFirstElement() {
        Hongkun h = new Hongkun();
        int[] res = h.front11(new int[]{0, 99}, new int[]{0});
        assertArrayEquals(new int[]{0, 0}, res);
    }
}

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Map;
import java.util.HashMap;


public class HongkunTest {

    @Test
    public void testMapShareWithAllKeys() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");
        Map<String, String> result = Hongkun.mapShare(map);
        assertEquals("aaa", result.get("a"));
        assertEquals("aaa", result.get("b"));
        assertFalse(result.containsKey("c"));
    }

    @Test
    public void testMapShareWithoutKeyA() {
        Map<String, String> map = new HashMap<>();
        map.put("b", "xyz");
        map.put("c", "ccc");
        Map<String, String> result = Hongkun.mapShare(map);
        assertEquals("xyz", result.get("b"));
        assertFalse(result.containsKey("c"));
    }

    @Test
    public void testMapShareWithExtraKeys() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("c", "meh");
        map.put("d", "hi");
        Map<String, String> result = Hongkun.mapShare(map);
        assertEquals("aaa", result.get("a"));
        assertEquals("aaa", result.get("b"));
        assertEquals("hi", result.get("d"));
        assertFalse(result.containsKey("c"));
    }

    @Test
    public void testMapShareEmptyMap() {
        Map<String, String> map = new HashMap<>();
        Map<String, String> result = Hongkun.mapShare(map);
        assertTrue(result.isEmpty());
    }
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HongsongTest {

    @Test
    void test_k2() {
        // 1->2->3->4->5
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        Hongsong h = new Hongsong();
        ListNode res = h.reverseGroup(n1, 2);

        // expected: 2->1->4->3->5
        assertNotNull(res);
        assertEquals(2, res.val);

        assertNotNull(res.next);
        assertEquals(1, res.next.val);

        assertNotNull(res.next.next);
        assertEquals(4, res.next.next.val);

        assertNotNull(res.next.next.next);
        assertEquals(3, res.next.next.next.val);

        assertNotNull(res.next.next.next.next);
        assertEquals(5, res.next.next.next.next.val);

        assertNull(res.next.next.next.next.next);
    }

    @Test
    void test_k3() {
        // 1->2->3->4->5
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        Hongsong h = new Hongsong();
        ListNode res = h.reverseGroup(n1, 3);

        // expected: 3->2->1->4->5
        assertNotNull(res);
        assertEquals(3, res.val);

        assertNotNull(res.next);
        assertEquals(2, res.next.val);

        assertNotNull(res.next.next);
        assertEquals(1, res.next.next.val);

        assertNotNull(res.next.next.next);
        assertEquals(4, res.next.next.next.val);

        assertNotNull(res.next.next.next.next);
        assertEquals(5, res.next.next.next.next.val);

        assertNull(res.next.next.next.next.next);
    }

    @Test
    void test_k3_len8() {
        // 1->2->3->4->5->6->7->8
        ListNode n8 = new ListNode(8);
        ListNode n7 = new ListNode(7, n8);
        ListNode n6 = new ListNode(6, n7);
        ListNode n5 = new ListNode(5, n6);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        Hongsong h = new Hongsong();
        ListNode res = h.reverseGroup(n1, 3);

        // expected: 3->2->1->6->5->4->7->8
        assertNotNull(res);
        assertEquals(3, res.val);

        assertNotNull(res.next);
        assertEquals(2, res.next.val);

        assertNotNull(res.next.next);
        assertEquals(1, res.next.next.val);

        assertNotNull(res.next.next.next);
        assertEquals(6, res.next.next.next.val);

        assertNotNull(res.next.next.next.next);
        assertEquals(5, res.next.next.next.next.val);

        assertNotNull(res.next.next.next.next.next);
        assertEquals(4, res.next.next.next.next.next.val);

        assertNotNull(res.next.next.next.next.next.next);
        assertEquals(7, res.next.next.next.next.next.next.val);

        assertNotNull(res.next.next.next.next.next.next.next);
        assertEquals(8, res.next.next.next.next.next.next.next.val);

        assertNull(res.next.next.next.next.next.next.next.next);
    }
}

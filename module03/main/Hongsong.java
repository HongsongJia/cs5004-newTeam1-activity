/**
 *  @author HongsongJia
 *  LeetCode25 Reverse Nodes in k-Group.
 *  Given the head of a linked list, reverse the nodes of the list k
 *  at a time, and return the modified list.
 *  k is a positive integer and is less than or equal to the length of the linked list.
 *  If the number of nodes is not a multiple of k then left-out nodes,
 *  in the end, should remain as it is.
 *  You may not alter the values in the list's nodes, only nodes themselves may be changed.
 *
 *  Input: head = [1, 2, 3, 4, 5], k = 2
 *  Output: [2, 1, 4, 3, 5]
 *
 *  input: head = [1, 2, 3, 4, 5], k = 3
 *  Output: [3, 2, 1, 4, 5]
 *
 *  input: head = [1, 2, 3, 4, 5, 6, 7, 8], k = 3
 *  Output: [3, 2, 1, 6, 5, 4, 7, 8]
 */

// Definition for singly-linked list.
    class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Hongsong {
    public ListNode reverseGroup(ListNode head, int k){
    // My solution here.
        int cnt = 0;
        ListNode cur = head;
        while(cur != null){
            cnt ++;
            cur = cur.next;
        }
        cur = head;
        int round = cnt / k;

        ListNode dummyHead = new ListNode(0, head);
        ListNode prev = dummyHead;

        for(int j = 0; j < round; j++){
           ListNode tail = prev;
           ListNode tempHead = cur;
           for(int i = 0; i < k; i ++){
               ListNode temp = cur.next;
               cur.next = prev;
               prev = cur;
               cur = temp;
           }
           tail.next = prev;
           tempHead.next = cur;
           prev = tempHead;
        }
        return  dummyHead.next;
    }
}


/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: Nth to last node of a singly linked list. 
     */
    ListNode nthToLast(ListNode head, int n) {
        // write your code here
        if (head == null)
			return head;

		ListNode node = head;
		for (int i = 0; i < n - 1; i++)
			node = node.next;

		ListNode next = head;
		while (node.next != null) {
			node = node.next;
			next = next.next;
		}

		return next;
    }
}

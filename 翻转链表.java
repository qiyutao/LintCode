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
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        if (head == null)
			return head;

		ListNode node = head;
		ListNode lastNode = null;
		ListNode tmp = null;

		while (node.next != null) {
			tmp = node.next;
			node.next = lastNode;
			lastNode = node;
			node = tmp;
		}
		node.next = lastNode;

		return node;
    }
}

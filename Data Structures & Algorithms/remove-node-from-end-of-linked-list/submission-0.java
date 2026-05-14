/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode reversedListNode = reverseHead(head);
        if(n == 1 ){
            return reverseHead( reversedListNode.next);
        }

        ListNode temp = reversedListNode;
        int counter = 1;
        while(counter < n-1){
            temp = temp.next;
            counter++;
        }
        temp.next = temp.next.next;
        return reverseHead(reversedListNode);
        
    }
    public ListNode reverseHead(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}

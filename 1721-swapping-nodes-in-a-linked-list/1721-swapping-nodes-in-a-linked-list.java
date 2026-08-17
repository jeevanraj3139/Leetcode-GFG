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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode Node1 = head;
        for(int i=1; i<k; i++){
            Node1 = Node1.next;
        }
        ListNode Node2 = head;
        ListNode temp = Node1;
        while(temp.next != null){
            temp = temp.next;
            Node2 = Node2.next;
        }
        int data = Node1.val;
        Node1.val = Node2.val;
        Node2.val = data;
        return head;
    }

}

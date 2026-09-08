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
        ListNode tail=head;
        int count=0;
        ListNode mid=head;
        while(tail!=null){
            count++;
            tail=tail.next;
        }
        if(n==count){
            return head.next;
        }
        int i=count-n-1;
        while(i>0){
            mid=mid.next;
            i--;
        }
        mid.next=mid.next.next;
        return head;
        }
    }

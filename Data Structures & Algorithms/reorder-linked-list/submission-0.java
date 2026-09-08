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
    public void reorderList(ListNode head) {
        ListNode dummy=new ListNode(0);
        Stack<ListNode> st=new Stack<>();
        ListNode tail=head;
        ListNode cur=head;
        ListNode prev=head;
        while(tail!=null){
            st.push(tail);
            tail=tail.next;
        }
        int n=st.size();
        for(int i=0;i<n/2;i++){
            ListNode last=st.pop();
            ListNode next=cur.next;
            cur.next=last;
            last.next=next;
            cur=next;
        }
        cur.next=null;
    }
}

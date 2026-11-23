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
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<Integer> st=new Stack<>();
        ListNode left=head;
        ListNode right=head;
        while (left!=null) {
            st.push(left.val);
            if(st.size()==k){
                while(!st.isEmpty()){
                    right.val=st.pop();
                    right=right.next;
                }
            }
            left=left.next;
        }
        return head;
    }
}
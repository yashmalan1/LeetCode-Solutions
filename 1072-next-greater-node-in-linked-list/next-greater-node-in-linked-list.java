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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> ll=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ll.add(temp.val);
            temp=temp.next;
        }
        int n=ll.size();
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int curr=ll.get(i);
            //pop
            while (!st.isEmpty() && st.peek()<=curr) {
                st.pop();
            }
            //ans
            ans[i]=st.isEmpty()?0:st.peek();
            //push
            st.push(curr);
        }
        return ans;  
    }
}
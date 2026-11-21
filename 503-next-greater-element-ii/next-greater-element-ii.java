class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=2*n-1;i>=0;i--){
            int curr=nums[i%n];
            //pop
            while(!st.isEmpty() && st.peek()<=curr){
                st.pop();
            }
            //ans
            ans[i%n]=st.isEmpty()?-1:st.peek();
            //push
            st.push(curr);
        }
        return ans;
    }
}
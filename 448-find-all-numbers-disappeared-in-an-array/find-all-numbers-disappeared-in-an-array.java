class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n=nums.length;
        int fre[]=new int[n+1];
       
        for(int i=0;i<nums.length;i++){
            fre[nums[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(fre[i]==0){
                ans.add(i);
            }
        }
        
        return ans;
    }
}
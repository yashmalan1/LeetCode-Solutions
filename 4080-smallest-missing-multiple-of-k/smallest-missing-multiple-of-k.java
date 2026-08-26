class Solution {
    public int missingMultiple(int[] nums, int k) {
        int fre[]=new int[101];
        int prev_multiple=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0){
                fre[nums[i]]++;
            }
        }
        for(int i=k;i<101;i+=k){
            if(fre[i]==0){
                
                return i;
            }
            prev_multiple=i;
        }
        return k+prev_multiple;
    }
}
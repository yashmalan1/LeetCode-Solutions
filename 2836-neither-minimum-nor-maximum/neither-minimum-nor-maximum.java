class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length==2) return -1;
        int max=0,min=101;

        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==min || nums[i]==max){
                continue;
            }
            else{
                return nums[i];
            }
        }
        return -1;
    }
}
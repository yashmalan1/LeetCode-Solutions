class Solution {
    public boolean search(int[] nums, int tar) {
        int lo=0,hi=nums.length-1;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            
            if(nums[mid]==tar) return true;
            if(nums[mid]==nums[lo]){
                lo++;
                continue;
            }
            if(nums[lo]<=nums[mid]){
                if(nums[lo]<=tar && nums[mid]>tar){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
            else{
                if(nums[mid]<tar && nums[hi]>=tar){
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
        }
        return false;
    }
}
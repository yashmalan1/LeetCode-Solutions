class Solution {
    public int search(int[] nums, int tar) {
        int lo=0,hi=nums.length-1;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            
            if(nums[mid]==tar){
                return mid;
            }
            else if(nums[lo]<=nums[mid]){
                if(nums[lo]<=tar && tar<nums[mid]){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
            
            else{
                if(nums[mid]<tar && tar<=nums[hi]){
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
        }
        return -1;
    }
}
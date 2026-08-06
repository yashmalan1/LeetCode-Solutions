class Solution {
    public int[] searchRange(int[] nums, int tar) {
        int lo=0,hi=nums.length-1;
        int idx_1=-1;
        int idx_2=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]==tar){
                idx_1=mid;
                hi=mid-1;
            }
            else if(nums[mid]>tar){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        lo=0;
        hi=nums.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]==tar){
                idx_2=mid;
                lo=mid+1;
            }
            else if(nums[mid]>tar){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }

        int[] ans={idx_1,idx_2};
        return ans;

    }
}
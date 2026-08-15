class Solution {
    public int maximumCount(int[] nums) {
        int lo=0,hi=nums.length-1;
        int negCount=0;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(nums[mid]>=0){
                hi=mid-1;
            } 
            else{
                lo=mid+1;
            }
        }
        negCount=lo;

        lo=0;
        hi=nums.length-1;
        int posCount=0;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(nums[mid]<=0){
                lo=mid+1;
            } 
            else{
                hi=mid-1;
            }

        }
        posCount=nums.length-lo;
        return Math.max(negCount,posCount);
    }
}
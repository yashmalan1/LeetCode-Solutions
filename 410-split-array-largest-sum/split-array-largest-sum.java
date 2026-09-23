class Solution {
    public int splitArray(int[] nums, int k) {
        int lo=0,hi=0;
        for(int i=0;i<nums.length;i++){
            hi+=nums[i];
            lo=Math.max(lo,nums[i]);
        }
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(isPossible(nums,mid,k)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    static boolean isPossible(int arr[],int maxSum,int maxSubarray){
        int subarray=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=maxSum){
                sum+=arr[i];
            }
            else{
                subarray++;
                sum=arr[i];
            }
        }
        return subarray<=maxSubarray;
    }
}
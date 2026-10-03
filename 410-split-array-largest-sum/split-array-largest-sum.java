class Solution {
    public int splitArray(int[] nums, int k) {
        int lo=0,hi=0;
        for(int i:nums){
            lo=Math.max(i,lo);
            hi+=i;
        }
        int ans=0;

        while(lo<=hi){
            int mid=(lo+hi)/2;          //mid->max Sum
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
    static boolean isPossible(int []arr,int possibleSum,int k){
        int subarray=1;
        int sum=0;
        for(int i:arr){
            if(sum+i<=possibleSum){
                sum+=i;
            }
            else{
                subarray++;
                sum=i;
            }
        }
        return subarray<=k;
    }
}
class Solution {
    public int splitArray(int[] nums, int k) {
        
        int lo=-1,sum=0;
        for(int i=0;i<nums.length;i++){
            lo=Math.max(lo,nums[i]);
            sum+=nums[i];
        }
        int hi=sum;
        int ans=-1;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(isPossible(nums,k,mid)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int arr[],int k,int maxSum){
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
        return subarray<=k;

    }
}
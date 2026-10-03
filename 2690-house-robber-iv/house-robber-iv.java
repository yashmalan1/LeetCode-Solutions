class Solution {
    public int minCapability(int[] nums, int k) {
        int lo=Integer.MAX_VALUE,hi=0;
        for(int i:nums){
            lo=Math.min(lo,i);
            hi=Math.max(hi,i);
        }
        int ans=0;
        while(lo<=hi){
            int mid=(hi+lo)/2;
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
    static boolean isPossible(int arr[],int maxMoney,int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=maxMoney){
                count++;
                i++;
            }
        }
        return count>=k;
    }
}
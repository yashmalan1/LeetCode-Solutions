class Solution {
    public int smallestDivisor(int[] nums, int thre) {
        int lo=1,hi=thre;
        for(int i:nums){
            hi=Math.max(hi,i);
        }
        
        int ans=0;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(isPossible(nums,mid,thre)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    static boolean isPossible(int arr[],int divisor,int maxSum){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil(((double)arr[i]/divisor));
        }
        return sum<=maxSum;
    }
}
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int lo=0;
        int hi=0;
        for(int i:weights){
            lo=Math.max(lo,i);
            hi+=i;
        }
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(isPossible(weights,mid,days)){
                hi=mid-1;
                ans=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    static boolean isPossible(int arr[],int minCap,int days){
        int day=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=minCap){
                sum+=arr[i];
            }
            else{
                day++;
                sum=arr[i];
            }
        }
        return day<=days;
    }
}
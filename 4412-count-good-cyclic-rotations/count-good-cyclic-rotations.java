class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        long sum1=0;
        long sum2=0;
        int ans=0;

        for(int i=0;i<n/2;i++){
            sum1+=nums[i];
        }
        for(int i=n/2;i<n;i++){
            sum2+=nums[i];
        }
        if(sum1<sum2) ans++;

        for(int i=0;i<n-1;i++){
            sum1=sum1-nums[i]+nums[(n/2+i)%n];
            sum2=sum2-nums[(n/2+i)%n]+nums[i];
            if(sum1<sum2) ans++;
        }
        return ans;
    }
}
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int linear_sum=Kaden(nums);//7
        int total_sum=0;//7
        for(int i=0;i<nums.length;i++){
            total_sum+=nums[i];
            nums[i]*=-1;
        }
        int middle_sum=Kaden(nums);
        int circular_sum=total_sum + middle_sum;
        if(circular_sum==0){
            return linear_sum;
        }
        return Math.max(linear_sum,circular_sum);

    }
    static int Kaden(int arr[]){
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            ans=Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}
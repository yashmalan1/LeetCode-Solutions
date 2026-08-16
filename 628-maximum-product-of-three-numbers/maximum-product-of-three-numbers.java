class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        if(n==3) return nums[0]*nums[1]*nums[2];

        int f_max=-1001;
        int s_max=-1001;
        int t_max=-1001;

        int f_min=1001;
        int s_min=1001;

        for(int i=0;i<n;i++){
            if(nums[i]>f_max){
                t_max=s_max;
                s_max=f_max;
                f_max=nums[i];
            }
            else if(nums[i]>s_max){
                t_max=s_max;
                s_max=nums[i];
            }
            else if(nums[i]>t_max){
                t_max=nums[i];
            }



            if(nums[i]<f_min){
                s_min=f_min;
                f_min=nums[i];
            }
            else if(nums[i]<s_min){
                s_min=nums[i];
            }
        }

        int a=f_max*s_max*t_max;
        int b=f_max*s_min*f_min;
        int ans=Math.max(a,b);
        
        return ans;
    }
}
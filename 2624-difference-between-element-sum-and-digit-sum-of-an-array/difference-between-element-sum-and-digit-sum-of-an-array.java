class Solution {
    public int differenceOfSum(int[] nums) {
        int sumElements=0;
        for(int i:nums){
            sumElements+=i;
        }
        int sumDigits=0;
        for(int i=0;i<nums.length;i++){
            sumDigits+=sum_of_digits(nums[i]);
        }
        return Math.abs(sumElements-sumDigits);
    }
    int sum_of_digits(int i){
        int sum=0;
        while(i>0){
            int d=i%10;
            sum+=d;
            i/=10;
        }
        return sum;
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        int c=nums[0];
        int vote=1;
        for(int i=1;i<nums.length;i++){
            if(c==nums[i]){
                vote++;
            }
            else{
                vote--;
            }
            if(vote==0){
                c=nums[i];
                vote=1;
            }
        }
        return c;
    }
}
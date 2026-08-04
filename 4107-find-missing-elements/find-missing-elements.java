class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        boolean []contains=new boolean[101];

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
       
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min) min=nums[i];
            if(nums[i]>max) max=nums[i];
            contains[nums[i]]=true;            
        }

        List<Integer> ans=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!contains[i]){
                ans.add(i);
            }
        }

        return ans;
    }
}
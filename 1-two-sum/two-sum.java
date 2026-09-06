class Solution {
    public int[] twoSum(int[] nums, int tar) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            int n=tar-nums[i];
            if(!map.containsKey(n)){
                map.put(nums[i],i);
            }
            else{
                a=i;
                b=map.get(n);
            }
        }
        return new int[] {a,b};
    }
}
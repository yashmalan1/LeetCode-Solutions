class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            if(i>0) set.add(i);
        }
        int ans=1;
        while(set.contains(ans)){
            ans++;
        }
        return ans;
    }
}
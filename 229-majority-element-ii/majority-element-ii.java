class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<Integer> ans = new ArrayList<>();
        int n=nums.length;
        for(int i:map.keySet()){
            if(map.get(i)>n/3){
                ans.add(i);
            }
        }
        return ans;
    }
}
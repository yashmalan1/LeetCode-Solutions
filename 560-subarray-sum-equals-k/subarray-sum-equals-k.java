class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1); //kyuki agar pahle ele pe ek subarray milla to ek count hoga 
        int count=0;
        int sum=0;
        for(int i:nums){
            sum+=i;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
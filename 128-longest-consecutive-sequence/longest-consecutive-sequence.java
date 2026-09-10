class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;      
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int count=0;
        for (int i:set) {
            if (!set.contains(i-1)) {                
                int current=i;
                int currentCount=1;

                while (set.contains(current + 1)) {
                    current++;
                    currentCount++;
                }
                if (currentCount>count) {
                    count=currentCount;
                }
            }
        }

        return count;

    }
}
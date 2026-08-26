class Solution {
    public List<Integer> targetIndices(int[] nums, int tar) {
        List<Integer> idx =new ArrayList<>();
        int fre[]=new int[101];
        for(int i=0;i<nums.length;i++){
            fre[nums[i]]++;
        }
        int c=0;
        for(int i=1;i<tar;i++) {
            c+=fre[i];
        }

        for(int i=0;i<fre[tar];i++) {
            idx.add(c+i);
        }
        return idx;
        
    }
}
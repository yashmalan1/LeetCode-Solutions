class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        if(k==0){
            for(int i=0;i<n;i++){
                if(nums1[i]!=nums2[i]) return -1;
            }
            return 0;
        }
        long pos=0;
        long neg=0;
        for(int i=0;i<n;i++){
            long diff=(long)nums1[i]-nums2[i];
            if(diff%k!=0) return -1;

            if(diff>0) pos+=diff;
            else if(diff<0)neg+=Math.abs(diff);
        }
        if(neg!=pos) return -1;

        return pos/k;        
    }
}
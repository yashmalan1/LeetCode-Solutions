class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int m_Dist=0;
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            int c_dist=-1;
            if(i<=j && nums1[i]<=nums2[j]){
                c_dist=j-i;
                m_Dist=Math.max(m_Dist,c_dist);
            }
            else{
                i++;
            }            
            j++;
        }
        return m_Dist;
        
    }
}
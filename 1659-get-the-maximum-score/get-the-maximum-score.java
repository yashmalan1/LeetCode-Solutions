class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        int i=0,j=0;
        long sum1=0,sum2=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                sum1+=nums1[i];
                i++;
            }
            else if(nums2[j]<nums1[i]){
                sum2+=nums2[j];
                j++;
            }
            else{
                sum1=Math.max(sum1,sum2)+nums1[i];
                sum2=sum1;
                i++;
                j++;
            }
            
        }
        while(i<nums1.length){
            sum1+=nums1[i];
            i++;
        }
        while(j<nums2.length){
            sum2+=nums2[j];
            j++;
        }

        return (int)(Math.max(sum1,sum2)%1000000007);
    }
}
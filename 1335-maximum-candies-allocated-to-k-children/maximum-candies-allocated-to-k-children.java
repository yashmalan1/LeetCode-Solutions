class Solution {
    public int maximumCandies(int[] candies, long k) {
        int lo=1,hi=0;
      
        for(int i:candies){
            hi=Math.max(hi,i);
        }

        int ans=0;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(isPossible(candies,mid,k)){
                lo=mid+1;
                ans=mid;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
    static boolean isPossible(int arr[],int D_candy,long k){
        long count=0;
        
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            count+=temp/D_candy;
        }
        
        return count>=k;
    }
}
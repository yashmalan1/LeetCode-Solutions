class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int lo=1,hi=0;

         for(int i:piles){
            hi=Math.max(hi,i);
         }
        int ans=0;
         while(lo<=hi){
            int mid=(hi+lo)/2;
            if(isPossible(piles,mid,h)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
         }
         return ans;
    }
    static boolean isPossible(int arr[],int speed,int h){
        int time=0;
        for(int i=0;i<arr.length;i++){
            time+=Math.ceil((double)arr[i]/speed);
        }
        return time<=h;
    }
}
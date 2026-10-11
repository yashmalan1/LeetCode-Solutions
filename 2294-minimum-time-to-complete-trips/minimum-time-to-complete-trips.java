class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long lo=1,hi=0;
        for(int i:time){
            hi=Math.max(hi,i);
        }
        hi=hi*totalTrips;
        long ans=0;
        while(lo<=hi){
            long mid=(lo+hi)/2;
            if(isPossible(time,mid,totalTrips)){
                hi=mid-1;
                ans=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    static boolean isPossible(int arr[],long minTime,int trips){
        long trip=0;

        for(int i=0;i<arr.length;i++){
            trip+=minTime/arr[i];
        }
        return trip>=trips;
    }
}
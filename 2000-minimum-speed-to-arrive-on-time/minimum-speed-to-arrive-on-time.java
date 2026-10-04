class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int lo = 1, hi = 10000000;
        int ans=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(isPossible(dist,mid,hour)){
                hi=mid-1;
                ans=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    static boolean isPossible(int arr[],int speed,double hour){
        double time=0;
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                time+=((double)arr[i]/speed);
            }
            else{
                time+=Math.ceil((double)arr[i]/speed);
            }
        }
        return time<=hour;
    }
}
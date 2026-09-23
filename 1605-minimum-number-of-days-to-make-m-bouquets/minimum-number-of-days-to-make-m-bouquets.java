class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long)m*k) return -1;

        int lo=0;
        int hi=0;
        for(int i:bloomDay){
            hi=Math.max(hi,i);
        }
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(isPossible(bloomDay,m,k,mid)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    static boolean isPossible(int arr[],int buke,int k,int days){
        int bukeForm=0;
        int flower=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=days){
                flower++;
                if(flower==k){
                    bukeForm++;
                    flower=0;
                }
            }
            else{
                flower=0;
            }
        }
        return bukeForm>=buke;
    }
}
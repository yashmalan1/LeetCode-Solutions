class Solution {
    public boolean isPerfectSquare(int n) {
        int lo=1,hi=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(mid>n/mid){
                hi=mid-1;
            }
            else if(mid*mid==n){
                return true;
            }
            else{
                lo=mid+1;
            }
        }
        return false;
    }
}
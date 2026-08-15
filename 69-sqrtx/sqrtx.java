class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;

        int lo=1,hi=x;
        
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(mid>x/mid) hi=mid-1;
            else if(mid*mid==x) return mid;
            else lo=mid+1;
        }
        
        return hi;
    }
}
class Solution {
    public int countOdds(int low, int high) {
     int total=(high-low+1);
     int count=0;
     
     if(low%2==0 && high%2==0){
        count=total/2+1;
        return total-count;
     }
     count=total/2;
     return total-count;
    }
}
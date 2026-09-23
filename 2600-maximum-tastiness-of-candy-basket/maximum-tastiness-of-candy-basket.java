class Solution {
    public int maximumTastiness(int[] position, int m) {
      Arrays.sort(position);
        int lo=1,hi=position[position.length-1]-position[0];

        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(isPossible(position,mid,m)){
                lo=mid+1;
                ans=mid;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
    static boolean isPossible(int arr[],int minDis,int balls){
        int lastPos=arr[0];
        int placedBalls=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-lastPos>=minDis){
                placedBalls++;
                lastPos=arr[i];
            }
        }
        return placedBalls>=balls;
    }
}
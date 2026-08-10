class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isDivide(i)){
                ans.add(i);
            }
        }
        return ans;
    }
    boolean isDivide(int i){
        int temp=i;
        while(i>0){
            int d=i%10;
            if(d==0){
                return false;
            }
            if(temp%d!=0){
                return false;
            }
            i/=10;
        }
        return true;
    }
}
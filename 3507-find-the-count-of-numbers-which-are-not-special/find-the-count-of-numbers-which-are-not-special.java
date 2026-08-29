class Solution {
    public int nonSpecialCount(int l, int r) {
        int r_root=(int)Math.sqrt(r);
        int l_root=(int)Math.sqrt(l);

        boolean isPrime[]=new boolean[r_root+1];
        Arrays.fill(isPrime,true);

        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i<=r_root;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=r_root;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        int count=0;
        for(int i=l_root;i<=r_root;i++){
            if(isPrime[i] && i*i<=r && i*i>=l){
                count++;
            }
        }
        return (r-l+1)-count;
    }
}
class Solution {
    public int[] closestPrimes(int left, int right) {
        int first=-1;
        int second=-1;
        int prev=-1;
        int min_diff=Integer.MAX_VALUE;
        for (int i=left;i<=right;i++) {
            if(isPrime(i)) {
                if(prev != -1) {
                    int current=i-prev;
                    if (current<min_diff) {
                        min_diff=current;
                        first=prev;
                        second=i;
                    }
                    if (min_diff==1||min_diff==2) {
                        break;
                    }
                }
                prev=i;
            }
        }
        if (second==-1) return new int[]{-1, -1};
        return new int[]{first, second};
    }
    static boolean isPrime(int x) {
        if (x<2) return false;
        for (int i=2;i*i<=x;i++) {
            if (x%i==0)return false;
        }
        return true;
    }
}
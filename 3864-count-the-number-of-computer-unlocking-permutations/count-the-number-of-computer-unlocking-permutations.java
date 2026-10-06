class Solution {
    public int countPermutations(int[] complexity) {
        for(int i=1;i<complexity.length;i++){
            if(complexity[i]<=complexity[0]){
                return 0;
            }
        }
        long fact=1;
        for(int i=1;i<=complexity.length-1;i++){
            fact=(fact*i)%1000000007;
        }
        return (int)fact;
    }
}
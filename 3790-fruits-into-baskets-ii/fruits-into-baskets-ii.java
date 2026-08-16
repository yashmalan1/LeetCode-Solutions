class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        boolean[] isUsed=new boolean[n];
        int notYetPlaced=0;

        for(int i=0;i<n;i++){
            boolean placed=false;
            for(int j=0;j<n;j++){
                if(isUsed[j])  continue;
                if(baskets[j]>=fruits[i]){
                    isUsed[j]= true;
                    placed=true;
                    break;
                }
            }
            if(!placed){
                notYetPlaced++;
            }
        }
        return notYetPlaced;
    }
}
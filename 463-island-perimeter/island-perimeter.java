class Solution {
    public int islandPerimeter(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int actul=0,extra=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    actul++;
                    if(i>0 && grid[i-1][j]==1){
                        extra++;
                    }
                    if(j>0 && grid[i][j-1]==1){
                        extra++;
                    }
                }
            }
        }
        return actul*4-extra*2;
    }
}
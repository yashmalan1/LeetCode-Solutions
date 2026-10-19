class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int num=1;
        int left=0,right=n-1;
        int top=0,bottom=n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                arr[top][i]=num;
                num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=num;
                num++;
            }
            right--;

            for(int i=right;i>=left;i--){
                arr[bottom][i]=num;
                num++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                arr[i][left]=num;
                num++;
            }
            left++;
        }
        return arr;
    }
}
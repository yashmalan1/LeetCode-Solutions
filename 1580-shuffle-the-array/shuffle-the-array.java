class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0,j=n;
        int arr[]=new int[2*n];
        int k=0;
        while(j<nums.length){
            if(k%2==0){
                arr[k]=nums[i];
                i++;

            }
            else{
                arr[k]=nums[j];
                j++;
            }
            k++;

        }
        return arr;
    }
}
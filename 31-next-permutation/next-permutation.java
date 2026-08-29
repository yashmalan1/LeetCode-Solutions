class Solution {
    public void nextPermutation(int[] nums){
        int n=nums.length;
        int idx1=-1;
        int idx2=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx1=i;
                break;
            }
        }
        if(idx1==-1){
            reverse(nums,0,n-1);
        }
        else{
            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[idx1]){
                    idx2=i;
                    break;
                }
            }
            int temp=nums[idx1];
            nums[idx1]=nums[idx2];
            nums[idx2]=temp;
            reverse(nums,idx1+1,n-1);
        }


        
    }
    public static void reverse(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
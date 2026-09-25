class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=String.valueOf(nums[i]);
        }


        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                String ab=arr[j]+arr[j+1];
                String ba=arr[j+1]+arr[j];
                if(ab.compareTo(ba)<0){
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(arr[i]);
        }
        if(sb.charAt(0)=='0') return "0";
        return sb.toString();
    }
}
class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[2];

        for(int i:nums){
            if(map.containsKey(i)){
                int old=map.get(i);
                map.put(i,++old);
            }
            else{
                map.put(i,1);
            }
        }
        int c=0;
        for(int i:nums){
            if(map.get(i)==1){
                arr[c]=i;
                c++;
            }
        }
        return arr;
    }
}
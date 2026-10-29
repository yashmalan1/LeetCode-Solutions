class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Subset(nums,0,ans,ll);
        return ans;
    }
    static void Subset(int[] arr,int idx,List<List<Integer>> ans,List<Integer> ll){
        ans.add(new ArrayList<>(ll));
        for(int i=idx;i<arr.length;i++){
            ll.add(arr[i]);
            Subset(arr,i+1,ans,ll);
            ll.remove(ll.size()-1);
        }
    }
}
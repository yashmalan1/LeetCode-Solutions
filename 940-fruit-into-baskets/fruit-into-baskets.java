class Solution {
    public int totalFruit(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int k=2;
		int si=0,ei=0;
		int count=0;
		while(ei<arr.length){
		    //grow
		    map.put(arr[ei],map.getOrDefault(arr[ei],0)+1);
		    
		    //shrink
		    while(map.size()>k && si<=ei){
		        if(map.get(arr[si])==1){
		            map.remove(arr[si]);
		        }
		        else{
		            map.put(arr[si],map.get(arr[si])-1);
		        }
		        si++;
		    }
		    
		    //ans
		    count=Math.max(count,ei-si+1);
		    ei++;
		}
        return count;
    }
}
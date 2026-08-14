class Solution {
    public String[] sortPeople(String[] names, int[] height) {
        int idx=-1;
        for(int i=0;i<names.length;i++){
            int max=0;
            for(int j=i;j<names.length;j++){
               if(max<height[j]){
                max=height[j];
                idx=j;
               }
            }
            int temp=height[i];
            height[i]=height[idx];
            height[idx]=temp;

            String tem=names[i];
            names[i]=names[idx];
            names[idx]=tem;
        }
        return names;


    }
}
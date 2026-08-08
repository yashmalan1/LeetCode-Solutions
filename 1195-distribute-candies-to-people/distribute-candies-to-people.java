class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans=new int[num_people];

        int st_candies=1;
        while(candies!=0){
            for(int i=0;i<num_people;i++){
                
                if(candies<st_candies && candies>0){
                    st_candies=candies;
                }
                
                ans[i]+=st_candies;
                candies=candies-st_candies;
                st_candies++;

                
                if(candies<1){
                    break;
                }
            }
        }
        return ans;
    }
}
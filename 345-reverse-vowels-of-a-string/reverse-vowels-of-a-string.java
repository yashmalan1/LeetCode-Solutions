class Solution {
    public String reverseVowels(String s) {
        char words[]=s.toCharArray();
        int i=0,j=s.length()-1;
        
        while(i<j){
            
            while(i<j && !isVowel(words[i])){
                i++;
            }
            
            while(i<j && !isVowel(words[j])){
                j--;
            }

            char temp=words[i];
            words[i]=words[j];
            words[j]=temp;

            i++;
            j--;
        }
        return new String(words); 
    }
    boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}
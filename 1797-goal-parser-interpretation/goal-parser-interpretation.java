class Solution {
    public String interpret(String command) {
       String replaced1 = command.replace("()","o"); 
       String replaced2 = replaced1.replace("(",""); 
       String replaced3 = replaced2.replace(")",""); 
       return replaced3;
    }
}
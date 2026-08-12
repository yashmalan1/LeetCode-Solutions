class Solution {
    public boolean isValid(String s) {
        int is_o = 0; 
        int is_c = 0; 
        int is_s = 0; 
        char[] count = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                count[is_c] = ch;
                is_c++; 
            } else {
                if (is_c == 0) return false;

                is_o = count[is_c - 1];
                is_s = ch;
                if ((is_o == '(' && is_s == ')') || 
                    (is_o == '{' && is_s == '}') || 
                    (is_o == '[' && is_s == ']')) {
                    is_c--;
                } else {
                    return false;
                }
            }
        }
        return is_c == 0; 
    }
}
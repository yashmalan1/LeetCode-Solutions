class Solution {
    public int clumsy(int n) {

        long ans = 0;
        long cf = n;
        int x = 4;
        for (int i = n - 1; i > 0; i--){
            if (x == 4) {
                cf *= i;
            }
            else if (x == 3) {
                cf /= i;
            }
            else if (x == 2) {
                ans += cf;
                cf = i;
            }
            else {
                ans += cf;
                cf = -i;
            }
            x--;
            if (x == 0) {
                x = 4;
            }
        }
        ans += cf;
        return (int) ans;
    }
}
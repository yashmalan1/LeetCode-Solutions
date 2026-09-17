class Solution {
    public int minimumSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = Integer.MAX_VALUE;

        // 1. Three horizontal parts
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {

                int first = res(grid, 0, 0, i, m - 1);
                int second = res(grid, i + 1, 0, j, m - 1);
                int third = res(grid, j + 1, 0, n - 1, m - 1);

                ans = Math.min(ans, first + second + third);
            }
        }
        // 2. Three vertical parts
        for (int i = 0; i < m - 2; i++) {
            for (int j = i + 1; j < m - 1; j++) {

                int first = res(grid, 0, 0, n - 1, i);
                int second = res(grid, 0, i + 1, n - 1, j);
                int third = res(grid, 0, j + 1, n - 1, m - 1);

                ans = Math.min(ans, first + second + third);
            }
        }
        // 3. Top part + bottom part divided vertically
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {

                int first = res(grid, 0, 0, i, m - 1);
                int second = res(grid, i + 1, 0, n - 1, j);
                int third = res(grid, i + 1, j + 1, n - 1, m - 1);

                ans = Math.min(ans, first + second + third);
            }
        }
        // 4. Top part divided vertically + bottom part
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {

                int first = res(grid, 0, 0, i, j);
                int second = res(grid, 0, j + 1, i, m - 1);
                int third = res(grid, i + 1, 0, n - 1, m - 1);

                ans = Math.min(ans, first + second + third);
            }
        }
        // 5. Left part + right part divided horizontally
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {

                int first = res(grid, 0, 0, j, i);
                int second = res(grid, j + 1, 0, n - 1, i);
                int third = res(grid, 0, i + 1, n - 1, m - 1);

                ans = Math.min(ans, first + second + third);
            }
        }
        // 6. Right part divided horizontally + left part
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {

                int first = res(grid, 0, 0, n - 1, i);
                int second = res(grid, 0, i + 1, j, m - 1);
                int third = res(grid, j + 1, i + 1, n - 1, m - 1);

                ans = Math.min(ans, first + second + third);
            }
        }
        return ans;
    }

    public int res(int[][] arr, int cr, int cc, int er, int ec) {

        int minr = Integer.MAX_VALUE;
        int minc = Integer.MAX_VALUE;
        int maxr = Integer.MIN_VALUE;
        int maxc = Integer.MIN_VALUE;

        for (int i = cr; i <= er; i++) {
            for (int j = cc; j <= ec; j++) {

                if (arr[i][j] == 1) {
                    minr = Math.min(minr, i);
                    minc = Math.min(minc, j);
                    maxr = Math.max(maxr, i);
                    maxc = Math.max(maxc, j);
                }
            }
        }

        // No 1 present
        if (minr == Integer.MAX_VALUE) {
            return 0;
        }

        int length = maxc - minc + 1;
        int breadth = maxr - minr + 1;

        return length * breadth;
    }
}
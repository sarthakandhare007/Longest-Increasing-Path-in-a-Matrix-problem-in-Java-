public class LongestIncreasingPath {
    private int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    private int m, n;

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;

        m = matrix.length;
        n = matrix[0].length;
        int[][] dp = new int[m][n]; // memoization
        int maxLen = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxLen = Math.max(maxLen, dfs(matrix, dp, i, j));
            }
        }
        return maxLen;
    }

    private int dfs(int[][] matrix, int[][] dp, int i, int j) {
        if (dp[i][j] != 0) return dp[i][j];

        int max = 1; // at least the cell itself
        for (int[] dir : directions) {
            int x = i + dir[0], y = j + dir[1];
            if (x >= 0 && x < m && y >= 0 && y < n && matrix[x][y] > matrix[i][j]) {
                max = Math.max(max, 1 + dfs(matrix, dp, x, y));
            }
        }
        dp[i][j] = max;
        return max;
    }

    // Quick test
    public static void main(String[] args) {
        LongestIncreasingPath sol = new LongestIncreasingPath();
        int[][] matrix = {
            {9,9,4},
            {6,6,8},
            {2,1,1}
        };
        System.out.println(sol.longestIncreasingPath(matrix)); // Output: 4
    }
}

# Longest-Increasing-Path-in-a-Matrix-problem-in-Java-Problem

Given an m x n integer matrix, return the length of the longest increasing path in the matrix.

From each cell, you can move up, down, left, right to a neighboring cell with a strictly larger value.


---

Example

Input:
matrix = [
  [9,9,4],
  [6,6,8],
  [2,1,1]
]

Output: 4

Explanation: The longest increasing path is [1, 2, 6, 9].


---

🔹 Intuition

This is a graph problem on a grid.

Each cell is a node, edges go to neighbors with larger values.

A simple DFS may revisit nodes → exponential time.

✅ Use DFS + memoization (DP):

dp[i][j] = length of the longest increasing path starting from (i, j).

Compute recursively and store results to avoid recomputation.


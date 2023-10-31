package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class BfsPlay {
}


class Solution {
    private final static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;


        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        int maxarea = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    count = bfs(grid, i, j, rows, cols);
                    maxarea = Math.max(count, maxarea);
                }
            }
        }
        return maxarea;

    }


    public int bfs(int[][] grid, int x, int y, int rows, int cols) {
        Queue<int[]> q = new LinkedList<>();
        int count = 1;
        grid[x][y] = 0;
        q.add(new int[]{x, y});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int row = cur[0];
            int col = cur[1];

            for (int[] dir : dirs) {
                int nx = row + dir[0];
                int ny = col + dir[1];
                if (nx >= 0 && nx < rows && ny >= 0 && ny < cols && grid[nx][ny] == 1) {
                    q.add(new int[]{nx, ny});
//                    grid[nx][ny] = 0;
                    count++;
                }
            }
        }
        return count;

    }

}

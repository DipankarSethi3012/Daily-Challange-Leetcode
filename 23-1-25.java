class Solution {
    public int countServers(int[][] grid) {
        int count = 0;
        int n = grid.length, m = grid[0].length;
        for(int i = 0; i < n; i++) {
            int temp = 0;
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 1) {
                    temp++;
                }
            }

            if(temp > 1) {
                for(int k = 0; k < m; k++) {
                    if(grid[i][k] == 1) grid[i][k] = 2;
                }
                count += temp;
            }
        }

        // for(int[] row : grid) {
        //     System.out.println(Arrays.toString(row));
        // }

        // System.out.println("row : " + count);
        for(int i = 0; i < m; i++) {
            int temp = 0, minus = 0;
            boolean flag = false;
            for(int j = 0; j < n; j++) {
                if(grid[j][i] == 1 || grid[j][i] == 2) temp++;
                if(grid[j][i] == 2) minus++;
            }

           if(temp > 1) {
            count += (temp - minus);
           }
        }

        return count;
    }
}
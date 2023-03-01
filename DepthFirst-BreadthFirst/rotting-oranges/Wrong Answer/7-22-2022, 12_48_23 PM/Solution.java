// https://leetcode.com/problems/rotting-oranges

class Solution {
    public int orangesRotting(int[][] grid) {
        
        Queue<int[]> q = new LinkedList();
        int fresh = 0;
        
        
        for(int i = 0; i < grid.length;i++){
            for(int j = 0; j < grid[0].length;j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j] == 1){
                    fresh++;
                }
                
            }
        }
        if(fresh == 0){
            return 0;
        }
        int time = 0;
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        while(!q.isEmpty()){
            int size = q.size();
            time++;
            for(int i = 0; i < q.size();i++){
                int[] curr = q.poll();
                for(int[] dir : dirs){
                    int x = curr[0] + dir[0];
                    int y = curr[1] + dir[1];
                    if(x < 0 || y < 0 || x > grid.length-1 || y > grid[0].length- 1 || grid[x][y] == 2 || grid[x][y] == 0){
                        continue;
                    }
                    grid[x][y] = 2;
                    q.offer(new int[]{x,y});
                    fresh--;
                    
                }
                
                
                
                
            }
            
            
        }
        
        return fresh == 0 ? time-1 : -1;
        
        
    }
}
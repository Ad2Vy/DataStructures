package Graphs;

public class NumberOfIsland {
        // Function to find the number of islands.
        public static int numIslands(char[][] grid) {
            //number of row
            int u=grid.length;
            //number of column;
            int v=grid[0].length;
            //defining a boolean visited array
            boolean[][] visited=new boolean[u][v];
            // result
            int res=0;

            //traversing through the matrix and checking for visited
            //and doing DFS
            for(int i=0;i<u;i++){
                for(int j=0 ; j<v;j++){
                    if(grid[i][j]=='1'&&!visited[i][j]){
                        DFS(grid,i,j,visited,u,v);
                        res++;
                    }
                }
            }
            return res;
        }
        //the DFS function
        static void DFS(char[][] grid,int row,int col,boolean[][] visited,int u,int v){
            int[] row_extension={-1,-1,-1,0,1,1,1,0};
            int[] col_extension={-1,0,1,1,1,0,-1,-1};

            visited[row][col]=true;
            //traversing and checking for the connected components
            for(int i=0;i<8;i++){
                if(isSafe(grid,row+row_extension[i],col+col_extension[i],visited,u,v)){
                    DFS(grid,row+row_extension[i],col+col_extension[i],visited,u,v);
                }
            }
        }

        //checking few set of conditions..
        static boolean isSafe(char[][] grid,int row,int col,boolean[][] visited,int u,int v){
            return ((row>=0&&row<u)&&(col>=0&&col<v))&&(!visited[row][col]&&grid[row][col]=='1');
        }

    public static void main(String[] args){
            char[][] grid={{'1','1','0','0','0'},
                    {'0','1','0','0','1'},
                    {'1','0','0','1','1'},
                    {'0','0','0','0','0'},
                    {'1','0','1','0','1'}};
            int res=numIslands(grid);
            System.out.println(res);

    }



}


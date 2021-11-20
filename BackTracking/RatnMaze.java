package BackTracking;

public class RatnMaze {
    // a maze with 0 and 1 matrix
    // 0 means blocked
    // 1 means clear or unblocked
    // start from 0,0 and target is n,n

    //backtracking solution



    static boolean isSafe(int i, int j, int N, boolean[][] maze){
        return (i<N && j<N && maze[i][j] );
    }

    static boolean solveMazeRec(boolean[][] maze, int[][] sol, int i, int j, int N){
        if(i==N-1 && j==N-1){
            sol[i][j]=1;
            return true;
        }
        if(isSafe(i,j,N,maze)){
            sol[i][j]=1;
            if(solveMazeRec(maze,sol,i+1,j,N))return true;
            else if(solveMazeRec(maze,sol,i,j+1,N))return true;
            sol[i][j]=0;
        }
        return false;
    }

    static void printMatrix(int[][] sol, int N){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }


    static boolean solveMaze(boolean[][] maze,int N ){
        int[][] sol= new int[N][N];
        if(!solveMazeRec(maze,sol,0,0,N)){
            return false;
        }
        else {
            printMatrix(sol,N);
            return true;
        }
    }

    public static void main(String[] args) {
        boolean[][] maze={  {true,false,false,false},
                            {true,false,false,true},
                            {true,true,false,false},
                            {false,true,true,true}};
        int N=maze[0].length;
        System.out.println(solveMaze(maze,N));

    }
}

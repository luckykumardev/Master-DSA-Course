package class_31;

public class DesignTicTacToe {
	int rowSum[];
    int colSum[];
    
    int leftToRightDiagonalSum;
    int rightToLeftDiagonalSum;

    public DesignTicTacToe(int n) {
        rowSum = new int[n];
        colSum = new int[n];
    }
    
    public int move(int row, int col, int player) {
        int val = player == 1 ?1 :-1;
        int n = rowSum.length;
        rowSum[row] += val;
        if(rowSum[row] == n || rowSum[row] == -n)
                return player;
        
        colSum[col] +=val;
        if(colSum[col] == n || colSum[col] == -n)
              return player;
                
        if(row == col){
            leftToRightDiagonalSum +=val;
            if(leftToRightDiagonalSum == n || leftToRightDiagonalSum == -n)
                return player;
        }
        
        if(col == n - row -1){
            rightToLeftDiagonalSum +=val;
            if(rightToLeftDiagonalSum == n || rightToLeftDiagonalSum == -n)
                return player;
        }
        
        return 0;
    }
}

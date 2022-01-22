package class_36;
/*
 * https://leetcode.com/problems/valid-sudoku/
 */
public class ValidSudoku {
	
	   public boolean isValidSudoku(char[][] board) {
	        int r = board.length;
	        int c = board[0].length;
	      
	        for(int i =0; i <r; i++){
	            for(int j =0; j <c; j++){
	                if(board[i][j] != '.'){
	                     // System.out.println(board[i][j]);
	                    boolean ans = isSafe(board, i, j, Character.getNumericValue(board[i][j]));
	                   if(ans == false) return false;
	              }
	            }
	        }
	        
	        return true;
	    }
	    
	    private static boolean isSafe(char board[][], int curr_r , int curr_c, int k){
	        int r = board.length;
	        int c = board[0].length;
	         
	        char ch = (k + "").charAt(0);
	        //check row
	        for(int i = 0; i <c; i++){
	             if(i == curr_c) continue;
	            if(board[curr_r][i] == ch ){
	                return false;
	              }                              
	         }
	        
	        //check col
	        for(int i = 0; i <r; i++){
	             if(i == curr_r) continue;
	            if(board[i][curr_c] == ch ) {
	                return false;
	            }
	        }
	        
	        //check block
	        int box_r = (curr_r/3)*3;
	        int box_c = (curr_c/3)*3;
	        for(int i =box_r; i <box_r + 3; i++){
	            for(int j =box_c; j <box_c + 3; j++){
	              if(i == curr_r && j == curr_c) continue;
	              if(board[i][j] == ch){ 
	                return false;
	              }                     
	            }
	        }
	        
	        return true;
	    }
}
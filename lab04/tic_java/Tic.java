package tic;

public class Tic {
	String[][] board;
	int rows;
	int cols;
	String turn;
	public Tic(int row, int col) {
		board = new String[row][col];
		rows = row;
		cols = col;
		turn = "X";
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				board[i][j] = "_";
			}
		}
	}
	
	public int getRows() {
		return rows;
	}
	
	public int getCols() {
		return cols;
	}
	
	public String getSquare(int row, int col) {
		return board[row][col];
	}
	
	public boolean equals(Object obj) {
		if (! (obj instanceof Tic)) return false;
		
		Tic tic = (Tic) obj;
		
		if (rows != tic.getRows() || cols != tic.getCols()) return false;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (board[i][j] != tic.getSquare(i, j)) return false;
			}
		}
		return true;
	}
}

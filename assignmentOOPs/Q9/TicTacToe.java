package assignmentOOPs.Q9;

public class TicTacToe {
	char[][] board;
	int turns;

	public TicTacToe() {
		this.turns = 0;
		this.board = new char[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				this.board[i][j] = ' ';
			}
		}
	}
	
	boolean isFull() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(this.board[i][j]!='O' || this.board[i][j]!='X') {
					return false;
				}
			}
		}
		return true;
	}
	
}

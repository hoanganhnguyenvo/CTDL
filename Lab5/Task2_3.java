package Lab5;

public class Task2_3 {
	public class TicTacToe {
		private static final char EMPTY = ' ';
		private char[][] board;
	public boolean checkDiagonals() {
	    
	    int countX = 0, countO = 0; // biến đếm số lượng "X" hoặc "O" liên tiếp trên đường chéo
	    
	    for (int i = 0; i < 3; i++) {
	        if (board[i][i] == 'X') {
	            countX++; // nếu là "X", tăng biến đếm của X lên 1
	        } else if (board[i][i] == 'O') {
	            countO++; // nếu là "O", tăng biến đếm của O lên 1
	        }
	    }
	    
	    if (countX == 3 || countO == 3) {
	        return true; // nếu đường chéo này toàn X hoặc toàn O, trả về true người chơi đã thắng
	    }
	    
	   
	    countX = countO = 0; // reset biến đếm về 0
	    
	    for (int i = 0; i < 3; i++) {
	        if (board[i][2-i] == 'X') {
	            countX++; // nếu là "X", tăng biến đếm của X lên 1
	        } else if (board[i][2-i] == 'O') {
	            countO++; // nếu là "O", tăng biến đếm của O lên 1
	        }
	    }
	    
	    if (countX == 3 || countO == 3) {
	        return true; // nếu đường chéo này toàn X hoặc toàn O, trả về true người chơi đã thắng
	    }
	    
	    return false; // nếu không tìm được đường chéo nào toàn X hoặc toàn O, trả về false
	}
}

package Lab5;

public class Task2_2 {
	public class TicTacToe {
		private static final char EMPTY = ' ';
		private char[][] board;

		public boolean checkColumns() {
			int countX, countO; // biến đếm số lượng "X" hoặc "O" liên tiếp trong cột

			for (int j = 0; j < 3; j++) { // xét từng cột của bảng cờ
				countX = countO = 0; // reset biến đếm về 0 cho mỗi cột mới

				for (int i = 0; i < 3; i++) { // duyệt qua từng ô trên cột
					if (board[i][j] == 'X') {
						countX++; // nếu là "X", tăng giá trị đếm của X lên 1
					} else if (board[i][j] == 'O') {
						countO++; // nếu là "O", tăng giá trị đếm của O lên 1
					}
				}

				if (countX == 3 || countO == 3) {
					return true; // nếu tìm được cột nào đó toàn X hoặc toàn O, trả về true và kết thúc phương
									// thức
				}
			}

			return false; // nếu không tìm được cột nào toàn X hoặc toàn O, trả về false
		}
	}
}

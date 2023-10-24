package Lab5;

public class Task2_1 {
	public class TicTacToe {
		private static final char EMPTY = ' ';
		private char[][] board;
		// …

		public boolean checkRows() {
			int countX, countO; // biến đếm số lượng "X" hoặc "O" liên tiếp trong hàng

			for (int i = 0; i < 3; i++) { // xét từng hàng của bảng cờ
				countX = countO = 0; // reset biến đếm về 0 cho mỗi hàng mới

				for (int j = 0; j < 3; j++) { // duyệt qua từng ô trên hàng

					if (board[i][j] == 'X') {
						countX++; // nếu là "X", tăng giá trị đếm của X lên 1
					} else if (board[i][j] == 'O') {
						countO++; // nếu là "O", tăng giá trị đếm của O lên 1
					}
				}

				if (countX == 3 || countO == 3) {
					return true; // nếu tìm được hàng nào đó toàn X hoặc toàn O, trả về true và kết thúc phương
									// thức
				}
			}

			return false; // nếu không tìm được hàng nào toàn X hoặc toàn O, trả về false
		}

	}
}

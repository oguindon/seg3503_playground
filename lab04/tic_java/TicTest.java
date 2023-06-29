package tic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicTest {

	@Test
	void testConstructor() {
		Tic board = new Tic(3, 3);
		Tic board2 = new Tic(3,3);
		assertEquals(board, board2);
		//testing ability to declare a board
	}

	@Test
	void testRow0() {
		Tic board = new Tic(0, 3);
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> board.getSquare(0, 1));
	}
}

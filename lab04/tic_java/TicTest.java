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
		assertThrows(IllegalArgumentException.class,() -> new Tic(0, 3));
	}

	@Test
	void testGetSquareOutOfBounds() {
		Tic board =  new Tic(3, 3);
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> board.getSquare(4, 1));
	}
}

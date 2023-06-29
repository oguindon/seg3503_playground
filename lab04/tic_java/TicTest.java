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
		assertThrows(IllegalArgumentException.class, () -> board.getSquare(4, 1));
	}

	@Test
	void testBoardsRowNotEqual() {
		Tic board = new Tic(4, 3);
		Tic board2 = new Tic(3, 3);
		assertNotEquals(board, board2);
	}
	
	@Test
	void testBoardsColNotEqual() {
		Tic board = new Tic(3, 4);
		Tic board2 = new Tic(3, 3);
		assertNotEquals(board, board2);
	}

	@Test
	void testNonTicObject() {
		Tic object = new Tic(3, 3);
		Tic board = new Tic(3, 3);
		assertNotEquals(board, object);
	}
}

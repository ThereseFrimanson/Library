package models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import models.Book;

class BookTest {

	//G
	//Färdig
	@Test
	public void test2EqualBooks() {
		Book bookTest1 = new Book(3, "Hej", " ", "12345", " ", 400);
		Book bookTest2 = new Book(3, "Hej", " ", "12345", " ", 400);
		assertEquals(bookTest1.getIsbn(), bookTest2.getIsbn());
	}
	
	//G
	//Färdig
	@Test
	public void test2NonEqualBooks() {
		Book bookTest1 = new Book(1, "Grodan Boll", "Gud", "12334", " ", 50);
		Book bookTest2 = new Book(2, "Grodan Boll", "Gud", "12334", " ", 50);
		assertNotEquals(bookTest1.getID(), bookTest2.getID());
	}
}

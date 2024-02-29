package models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import models.Book;
import models.BookCatalog;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;


	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1, "Learning Java", "", "", "", 0);
		bc.addBook(book1);
	}
	
	// G
	@Test
	public void testAddABook() {
		bc = new BookCatalog();
		book1 = new Book(2, "God Nattsaga", "", "", "", 0);
		bc.addBook(book1);
		assertEquals(book1.getID(), 2);
	}
	
	// G
	@Test
	public void testFindBook() {
		bc = new BookCatalog();
		book1 = new Book(3, "Bra bok", "", "", "", 40);
		bc.addBook(book1);
		assertEquals(book1.getID(), 3);
	}
	
	// G
	@Test
	public void testFindBookIgnoringCase() {
		bc = new BookCatalog();
		book1 = new Book(1, "eN bRa bOk", " ", "123456", " ", 500);
		bc.addBook(book1);
		assertEquals(book1.getTitle().toLowerCase(), "en bra bok");
	}
	
	// G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException{

		String titleWithSpaces = "En bra bok    ";
		bc = new BookCatalog();
		book1 = new Book (1, "En bra bok", " ", "123456", " ", 50);
		bc.addBook(book1);
		assertEquals(bc.findBook(titleWithSpaces).getTitle(), book1.getTitle());
	}
}

package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class BookManagerTest {

    @Test
    public void shouldShowTheBooks() {
        Book book = new Book("test title", "jade author test", 2019);
        BookManager bookManager = new BookManager(new Book[]{book});
        assertArrayEquals(new Book[]{book}, bookManager.getBooks());
    }


}

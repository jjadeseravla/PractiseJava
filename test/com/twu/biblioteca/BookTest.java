package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book1;

    @Before
    public void setUp() {
       book1 = new Book("my life", "jade alvares", 1991);
    }

    @Test
    public void getTitleTest() {
        //book = new Book("my life", "jade alvares", 1991);
        assertEquals(book1.getTitle(), "my life");
    }

    @Test
    public void getAuthorTest() {
        assertEquals(book1.getAuthor(), "jade alvares");
    }

    @Test
    public void getYearPublishedTest() {
        assertEquals(book1.getYearPublished(), 1991);
    }

}

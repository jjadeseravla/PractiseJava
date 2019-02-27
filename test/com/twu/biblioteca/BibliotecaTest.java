//package com.twu.biblioteca;
//
//
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//
//import static org.junit.Assert.*;
//
//public class BibliotecaTest {
//
//    private ApplicationService applicationService;
//    private Book[] books;
//
//    @Before
//    public void setUp() {
//        applicationService = new ApplicationService();
//        books = new Book[] {
//                    new Book ("book1", "author1", 1991),
//                    new Book ("book2", "author2", 1800),
//                    new Book ("book3", "author3", 2016)
//        };
//
//    }
//
//    @Test
//    public void welcomeMessage() {
//        assertEquals(applicationService.welcomeMessage(), "Welcome to Biblioteca");
//    }
//
//    @Test
//    public void getBooks() {
//        assertArrayEquals(applicationService.getBooks(), books);
//    }
//
//    @Test
//    public void getYearPublishedOfSecondBook() {
//        assertEquals(applicationService.getBooks()[1].getYearPublished(), 1800);
//    }
//
//    @Test
//    public void itShouldDisplayMainMenu() {
//        ApplicationService applicationService = new ApplicationService();
//        applicationService.start();
//        assertEquals("welcome");
//
//    }
//
////    @Test
////    public void itReturnsABookByAuthor() {
////        ApplicationService applicationService = new ApplicationService(new Book[] {
////                    new Book ("book1", "author1", 1991),
////                    new Book ("book2", "author2", 1800),
////                    new Book ("book3", "author3", 2016)
////        };
////
////        Book bookFound = applicationService.getBookByAuthor("author1");
////
////        assertEquals(new Book ("book1", "author1", 1991), bookFound);
////
////    }
//}

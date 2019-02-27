package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ApplicationServiceTest {

    final String NEWLINE = System.getProperty("line.separator");
    private ApplicationService service;
    private String EXPECTED_MESSAGE = "Welcome to Biblioteca";
    private String EXPECTED_MENU = "------- Main Menu -------" + NEWLINE +
            "1. Loan a book" + NEWLINE +
            "2. Return a book" + NEWLINE +
            "3. Exit";

    @Before
    public void setUp() {
        service = new ApplicationService();
    }

    @Test
    public void shouldDisplayWelcomeMessage() {
        String message = service.getWelcomeMessage();
        assertEquals(EXPECTED_MESSAGE, message);
    }

    @Test
    public void shouldDisplayMainMenu() {
        String menu = service.getMainMenu();
        assertEquals(EXPECTED_MENU, menu);
    }
}

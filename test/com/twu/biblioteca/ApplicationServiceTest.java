package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ApplicationServiceTest {

    final String NEWLINE = System.getProperty("line.separator");
    private ApplicationService service;
    private String EXPECTED_MESSAGE = "Welcome to Biblioteca";
    private String EXPECTED_MENU = "------- Main Menu -------" + NEWLINE +
            "1. View List of Test Books with author and publication year" + NEWLINE +
            "2. Checkout a Test book" + NEWLINE +
            "3. Return a Test book" + NEWLINE +
            "4. Exit Test Biblioteca Application";

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

    @Test
    public void shouldBeNotifiedWhenUserChosenAnOption() {

    }
}

package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
//import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

public class ApplicationServiceTest {

    final String NEWLINE = System.getProperty("line.separator");
    private ApplicationService service;
    private String EXPECTED_MESSAGE = "Welcome to Biblioteca";
    private String EXPECTED_MENU = "------- Main Menu -------" + NEWLINE +
            "1. View List of Test Books with author and publication year" + NEWLINE +
            "2. Checkout a Test book" + NEWLINE +
            "3. Return a Test book" + NEWLINE +
            "4. Exit Test Biblioteca Application";

    //@Mock
    //Scanner mockSc;
    ScannerFactory factory;

    @Before
    public void setUp() {
        factory = Mockito.mock(ScannerFactory.class);
        service = new ApplicationService(factory.getInstance());
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
    public void shouldBeNotifiedWhenUserChosenOption1toDisplayBook() {
        //when(factory.getInstance()).thenReturn(new Scanner(System.in));
        //when(factory.nextInt()).thenReturn(1);
        ApplicationService spyService = spy(service);
        spyService.handleUserResponse(1);
        verify(spyService, times(1)).displayBook();
    }

    @Test
    public void shouldBeNotifiedWhenUserChosenAnOption2toCheckOutBook() {
        ApplicationService spyService = spy(service);
        spyService.handleUserResponse(2);
        verify(spyService, times(1)).checkOutBook();
    }

    @Test
    public void shouldBeNotifiedWhenUserChosenAnOption3toReturnBook() {
        ApplicationService spyService = spy(service);
        spyService.handleUserResponse(3);
        verify(spyService, times(1)).returnBook();
    }



    @Test
    public void shouldDisplayBooks() {

    }
}


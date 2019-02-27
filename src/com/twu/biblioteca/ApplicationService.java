package com.twu.biblioteca;

import java.util.Scanner;

public class ApplicationService {

    final String NEWLINE = System.getProperty("line.separator");
    private static final String WELCOME_MESSAGE = "Welcome to Biblioteca";
    private String MAIN_MENU = "------- Main Menu -------" + NEWLINE +
            "1. Loan a book" + NEWLINE +
            "2. Return a book" + NEWLINE +
            "3. Exit";

    private Book[] books = new Book[]{
            new Book("book1", "author1", 1991),
            new Book("book2", "author2", 1800),
            new Book("book3", "author3", 2016)
    };

    public Book[] getBooks() {
        return books;
    }

    public void startApp() {
        String welcomeMessage = getWelcomeMessage();
        String mainMenu = getMainMenu();
        System.out.println(welcomeMessage);
        System.out.println(mainMenu);
    }

    public String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

    public String getMainMenu() {
        return MAIN_MENU;
    }


}
//
//    public String welcomeMessage() {
//        String message = "Welcome to Biblioteca";
//        System.out.println(message);
////        Scanner reader = new Scanner(System.in);
////        String input = reader.nextLine();
////        reader.close();
////        return input;
//        return message;
//    }
//
////    public String mainMenuMessage() {
////        String message = "main menu message";
////        System.out.println(message);
////        return message;
////    }
//}

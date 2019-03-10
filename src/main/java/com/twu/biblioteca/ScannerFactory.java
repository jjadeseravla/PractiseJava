package com.twu.biblioteca;

import java.util.Scanner;

public class ScannerFactory {
    private final ScannerFactory factory; //need to initialize when creating a Final field
    private final Scanner INSTANCE;

    public ScannerFactory() {
        factory = new ScannerFactory();
        INSTANCE = new Scanner(System.in);
    }

//    public Scanner getInstance(User user) {
//        return factory.getInstance(accessToken(user));
//    }
//
//    private AccessToken accessToken(User user) {
//        return new AccessToken(user.getAccessToken(), user.getAccessTokenSecret());
//    }
    public int nextInt() {
        //return factory.getInstance().nextInt();
        return INSTANCE.nextInt();
    }

    public Scanner getInstance() {
        //return factory.getInstance();
            return INSTANCE;
    }
}

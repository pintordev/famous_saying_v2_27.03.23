package org.example;

import java.util.Scanner;

public class App {

    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        while(true) {
            System.out.printf("Input command: ");

            String command = sc.nextLine().trim().toLowerCase();

            if (command.equals("terminate")) {
                break;
            }

        }

    }
}

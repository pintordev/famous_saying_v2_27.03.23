package org.example;

import java.util.Scanner;

public class CommandRegister {

    private final Scanner sc;

    public CommandRegister(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.printf("Faymous Saying: ");

        String faymousSaying = sc.nextLine().trim();

        System.out.printf("Author: ");

        String author = sc.nextLine().trim();

        System.out.println("Faymous Saying: " + faymousSaying + ", Author: " + author);

    }

}

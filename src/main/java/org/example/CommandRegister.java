package org.example;

import java.util.Scanner;

public class CommandRegister {

    private final Scanner sc;
    private int order = 0;

    public CommandRegister(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.printf("Faymous Saying: ");

        String faymousSaying = sc.nextLine().trim();

        System.out.printf("Author: ");

        String author = sc.nextLine().trim();

        System.out.println(this.ordinal(++this.order) + " faymous saying has been registered.");
        System.out.println("Faymous Saying: " + faymousSaying + ", Author: " + author);

    }

    public String ordinal(int order) {
        if (order % 10 == 1) {
            return order + "st";
        } else if (order % 10 == 2) {
            return order + "nd";
        } else if (order % 10 == 3) {
            return order + "rd";
        } else {
            return order + "th";
        }
    }

}

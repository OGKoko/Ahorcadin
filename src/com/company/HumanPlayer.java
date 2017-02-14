package com.company;

import java.util.Scanner;

public class HumanPlayer {

    private Scanner scanner = new Scanner(System.in);

    public char chooseLetter() {

        String letter = "";
        while (true) {
            GamePrinter.printInstructions();
            letter = scanner.next();
            if (letter.length() == 1 && Character.isLetter(letter.charAt(0))) {
                return Character.toLowerCase(letter.charAt(0));
            }else {
                System.out.println("Escoje una letrita");
            }
        }
    }
}
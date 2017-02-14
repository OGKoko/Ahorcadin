package com.company;

public class GamePrinter {

    public static void printWelcome(){
        System.out.println("Holas!");
    }

    public static void printInstructions(){
        System.out.println("Escoje una letra nomas:");
    }

    public static void printFinalResult(GameState game){
        GamePrinter.printCurrentResult(game.getCurrentResult());
        if(game.hasWon()) {
            System.out.println("Ganaste we!");
        }else{
            System.out.println("LOOOOOOOOSER!");
        }


    }

    public static void printCurrentResult(String currentResult){
        System.out.println("La palabra es : " + currentResult);
    }
}

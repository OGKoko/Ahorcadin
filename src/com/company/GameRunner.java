package com.company;

public class GameRunner {

    private GameState game;
    private HumanPlayer humanPlayer;

    public GameRunner() {
        this.game = new GameState();
        this.humanPlayer = new HumanPlayer();
    }

    public void run() {
        while(!game.isOver()){

            GamePrinter.printCurrentResult(game.getCurrentResult());
            char letter = humanPlayer.chooseLetter();
            game.checkLetter(letter);
        }
        GamePrinter.printFinalResult(game);

    }

}

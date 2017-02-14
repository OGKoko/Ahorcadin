package com.company;

import java.util.ArrayList;
import java.util.List;

public class GameState {
    private String word;
    private boolean[] success;
    private int attempts;
    private List<Character> usedLetters = new ArrayList<>();

    public GameState() {

        Dictionary dictionary = new Dictionary();

        this.word = dictionary.getRandomWord();

        this.success = new boolean[word.length()];

    }

    public void addUsedLetter(Character letter){
        if(!isUsedLetter(letter)){
            usedLetters.add(letter);
        }
    }

    public boolean isUsedLetter(Character letter){
        if(usedLetters.contains(letter)){
            return true;
        }else{
            return false;
        }
    }

    public String getCurrentResult(){

        String result = "";

        for(int i = 0; i<word.length(); i++){
            if(success[i] == false){
                result = result + "_ ";
            }else{
                result = result + word.charAt(i);
            }
        }

        result = result + System.lineSeparator();
        result = result + "Te quedan:  "+ (10- attempts) + " Intentos";

        return result;
    }

    public boolean isOver(){

        boolean pendingLetter = false;

        for(int i = 0; i<success.length; i++) {
            if (success[i] == false) {
                pendingLetter = true;
                break;
            }
        }

        if((pendingLetter == true && attempts ==10) || pendingLetter == false){
            return true;
        }else {
            return false;
        }
    }

    public void checkLetter(char letter){

        if(isUsedLetter(letter)){
            attempts++;
            System.out.println("Letra repetido");
            return;
        }else{
            addUsedLetter(letter);
        }
        int coincidence = 0;

        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i) == letter){
                success[i] = true;
                coincidence++;
            }
        }
        if(coincidence==0){
            attempts++;
            System.out.println("La letra no es valida");
        } else{
            System.out.println("YEEEEEEP!");
        }
    }

    public boolean hasWon(){
        if(isOver() && attempts <10){
            return true;
        }else{
            return false;
        }
    }
}
package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dictionary {

    private List<String> wordSet = Arrays.asList("abdominal", "teclado", "pizza", "rap", "enero", "perfecto", "amor", "skate", "cafe");

    public String getRandomWord() {
        Collections.shuffle(wordSet);

        return wordSet.get(0);

    }
}

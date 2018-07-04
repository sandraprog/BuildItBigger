package com.sandraprog.jokelib;

import java.util.Random;

public class Joker {

    private final String jokesList[]={
            "Joke #1",
            "Joke #2",
            "Joke #3",
            "Joke #4",
            "Joke #5"
    };

    public String getJoke() {
        Random random  = new Random();
        int idx = random.nextInt(jokesList.length -1);
        return jokesList[idx];
    }

}

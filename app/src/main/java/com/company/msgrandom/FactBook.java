package com.company.msgrandom;

import java.util.Random;

class FactBook {

    private final String[] frases = {
            "Mensaje 1",
            "Mensaje 2",
            "Mensaje 3",
            "Mensaje 4",
            "Mensaje 5",
            "Mensaje 6",
            "Mensaje 7",
            "Mensaje 8",
            "Mensaje 9",
            "Mensaje 10",
            "Mensaje 11"

    };

    String getFact(){

        Random randomGenerator = new Random();

        int randomNumber = randomGenerator.nextInt(frases.length);
        return frases[randomNumber];

    }

}

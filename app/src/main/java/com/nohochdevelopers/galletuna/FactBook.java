package com.nohochdevelopers.galletuna;

import java.util.Random;

class FactBook {

    private final String[] frases{
            "Hola",
            "HOLA2",
            "QUE ONDA",
            "COMO ESTAS",
            "BIENVENIDO",
            "QUE TRANZA",
            "JAJA",
            "LOL",
            "NOSE"   };

    String getFact(){

        Random randomGenerator = new Random();

        int randomNumber = randomGenerator.nextInt(frases.length);
        String aleatorio = frases[randomNumber];

    }

}

package com.nohochdevelopers.galletuna;

import java.util.Random;

public class FactBook {

    public String getFact(){

        String[] frases = {
                "Hola",
                "HOLA2",
                "QUE ONDA",
                "COMO ESTAS",
                "BIENVENIDO",
                "QUE TRANZA",
                "JAJA",
                "LOL",
                "NOSE"   };

        Random randomGenerator = new Random();

        int randomNumber = randomGenerator.nextInt(frases.length);
        String aleatorio = frases[randomNumber];

    }

}

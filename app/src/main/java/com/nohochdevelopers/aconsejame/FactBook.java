package com.nohochdevelopers.aconsejame;

import java.util.Random;

class FactBook {

    private final String[] frases = {
            "Vale más un diamante con defecto que un pedrusco sin ninguno",
            "Es una locura amar, a menos que se ame con locura",
            " Habrá un romance feliz para ti dentro de muy poco",
            "Atraigo el éxito y la prosperidad con todas mis ideas",
            "Las oportunidades y las ventajas están detrás de cada puerta que abro",
            "Estar en la ruina es una situación temporal. Ser pobre es un estado mental",
            "Tengo la mayor de todas riquezas: la de no desearla",
            "Trabajo con pasión y a cada paso, una oportunidad aparece frente a tí",
            "Pronto encontrarás trabajo",
            "La salud no es sólo la ausencia de enfermedad, sino también la armonía con uno mismo y el entorno",
            "Tienes que dormir más"

    };

    String getFact(){

        Random randomGenerator = new Random();

        int randomNumber = randomGenerator.nextInt(frases.length);
        return frases[randomNumber];

    }

}

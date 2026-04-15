package com.mycompany.casino;

import com.murcia.utils.ColaEnlazada;
import java.util.Random;

public class Mazo {

    private ColaEnlazada cartas;
    
    public Mazo() {
        cartas = new ColaEnlazada();
        crearMazo();
    }

    private void crearMazo() {

        String[] palos = {"Corazones", "Diamantes", "Treboles", "Picas"};
        String[] valores = {
            "As","2","3","4","5","6","7","8","9","10",
            "J","Q","K"
        };

        for (String palo : palos) {
            for (String valor : valores) {
                cartas.add(new Carta(palo, valor));
            }
        }
    }
    public Carta robarCarta() {
        return (Carta) cartas.desencolar(); 
    }
      public void barajar() {
    Random rand = new Random();

    int n = 52;

    for (int i = 0; i < n * 2; i++) {
        
        Carta carta1 = (Carta) cartas.desencolar();

        int pasos = rand.nextInt(n);

        for (int j = 0; j < pasos; j++) {
            Carta c = (Carta) cartas.desencolar();
            cartas.encolar(c);
        }
        cartas.encolar(carta1);
    }

    System.out.println("Mazo barajado");
 }
}
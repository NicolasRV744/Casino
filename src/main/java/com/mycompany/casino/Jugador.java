package com.mycompany.casino;

import com.murcia.utils.ColaEnlazada;

public class Jugador {

    private String nombre;
    private ColaEnlazada mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ColaEnlazada();
    }

    public void recibirCarta(Carta carta) {
        mano.encolar(carta);
        System.out.println(nombre + " recibe: " + carta);
    }

    public int calcularPuntos() {

        int total = 0;
        int ases = 0;

        ColaEnlazada copia = new ColaEnlazada();
        Carta c;

        
        while ((c = (Carta) mano.desencolar()) != null) {

            int valor = c.obtenerValorNumerico();

            if (valor == 11) {
                ases++;
            }

            total += valor;

            copia.encolar(c);
        }

  
        while ((c = (Carta) copia.desencolar()) != null) {
            mano.encolar(c);
        }

        while (total > 21 && ases > 0) {
            total -= 10;
            ases--;
        }

        return total;
    }

    public void limpiarMano() {
        mano = new ColaEnlazada();
    }

    public String getNombre() {
        return nombre;
    }
}

package com.mycompany.casino;
public class Carta {

    private String palo;
    private String valor;


public Carta(String palo, String valor) {
    this.palo = palo;
    this.valor = valor;
    
    } 
    public int obtenerValorNumerico() {

        if (valor.equals("J") || valor.equals("Q") || valor.equals("K"))
            return 10;

        if (valor.equals("A"))
            return 11;

        return Integer.parseInt(valor);
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}
   
   



package com.mycompany.casino;
import com.murcia.utils.Input;

public class Juego {

    private Mazo mazo;
    private Jugador jugador;
    private Jugador dealer;
    private Input input;

    public void iniciar() {

     
    String nombre = Input.nextLine("Ingrese su nombre: ");

    jugador = new Jugador(nombre);
    dealer = new Jugador("Dealer");
    
    boolean seguirJugando = true;
    while (seguirJugando) {

    mazo = new Mazo();
    mazo.barajar();

    int rondas = 3;
    
    for (int i = 1; i <= rondas; i++) {
        System.out.println("\n=======================");
        System.out.println("      RONDA " + i);
        System.out.println("=======================");
        jugarRonda();
    }
     Input.nextLine("");
       System.out.println("\n==============================");
       System.out.println("¿Quieres jugar otras 3 rondas?");
       String opcion = Input.nextLine("(si/no): ");
       System.out.println("==============================\n");

        if (opcion.equalsIgnoreCase("no")) {
            seguirJugando = false;
            System.out.println("Gracias por jugar");
        }
    }
    
}
    private void jugarRonda() {

        jugador.limpiarMano();
        dealer.limpiarMano();

        mazo = new Mazo();
        mazo.barajar();

        // cartas iniciales
        jugador.recibirCarta(mazo.robarCarta());
        jugador.recibirCarta(mazo.robarCarta());

        dealer.recibirCarta(mazo.robarCarta());
        dealer.recibirCarta(mazo.robarCarta());

        turnoJugador();
        turnoDealer();
        mostrarGanador();
    }

    private void turnoJugador() {

        boolean seguir = true;

        while (seguir) {

            int puntos = jugador.calcularPuntos();

            System.out.println("\n" + jugador.getNombre() + " tienes " + puntos + " puntos");

            if (puntos > 21) {
                System.out.println("Te pasaste!");
                break;
            }

            System.out.println("1. Plantarse");
            System.out.println("2. Pedir carta");

            int opcion = Input.nextInt("Elige: ");
            if (opcion == 2) {
                jugador.recibirCarta(mazo.robarCarta());
            } else if (opcion == 1) {
                seguir = false;
                System.out.println("Te plantaste con: " + puntos);
            } else {
                System.out.println("Opcion invalida");
            }
        }
    }

    private void turnoDealer() {

        while (dealer.calcularPuntos() < 17) {
            dealer.recibirCarta(mazo.robarCarta());
        }

        int puntosDealer = dealer.calcularPuntos();

       if (puntosDealer > 21) {
       System.out.println("Dealer se pasó con " + puntosDealer);
       } else {
       System.out.println("Dealer se planta con " + puntosDealer);
}
    }

    private void mostrarGanador() {

        int p1 = jugador.calcularPuntos();
        int p2 = dealer.calcularPuntos();
        
        System.out.println("\n----- RESULTADO -----");
        System.out.println("Jugador: " + p1);
        System.out.println("Dealer: " + p2);

        if (p1 > 21) {
            System.out.println("Gana el Dealer");
        } else if (p2 > 21 || p1 > p2) {
            System.out.println("Gana el Jugador");
        } else if (p1 < p2) {
            System.out.println("Gana el Dealer");
        } else {
            System.out.println("Empate");
        }
    }
}
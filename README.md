Titulo: Proyecto Casino - Juego de Blackjack en Java

Descripción:

Este proyecto consiste en la implementación de un juego de Blackjack en Java, ejecutado por consola. El jugador compite contra el dealer siguiendo las reglas básicas del juego, donde el objetivo es obtener una puntuación lo más cercana posible a 21 sin pasarse.

El sistema maneja cartas, mazos, turnos y cálculo de puntajes utilizando estructuras de datos como colas enlazadas.



Objetivo:

Desarrollar un programa en Java que simule el juego de Blackjack, aplicando conceptos de:

- Programación orientada a objetos (POO)
- Manejo de estructuras de datos (cola enlazada)
- Control de flujo (condicionales y ciclos)
- Interacción con el usuario por consola



Funcionalidades principales:

- Creación automática de un mazo de 52 cartas
- Barajado del mazo de forma aleatoria
- Reparto de cartas al jugador y dealer
- Turno interactivo del jugador (pedir carta o plantarse)
- Lógica automática del dealer (pide cartas hasta mínimo 17 puntos)
- Manejo dinámico del As (puede valer 1 u 11)
- Cálculo de puntajes
- Sistema de rondas (3 rondas por juego)
- Opción para seguir jugando después de cada ciclo de rondas



Instrucciones de ejecución:

1. Abrir el proyecto en un IDE como NetBeans o IntelliJ.
2. Asegurarse de tener incluida la librería proporcionada:
   - "com.murcia.utils.ColaEnlazada"
   - "com.murcia.utils.Input"
3. Ejecutar la clase principal:

Casino.java

4. Ingresar el nombre del jugador cuando el sistema lo solicite.
5. Elegir opciones durante el juego:
   - 1 → Plantarse
   - 2 → Pedir carta
6. Al finalizar 3 rondas, decidir si desea continuar jugando.



Reglas del juego:

- Las cartas numéricas valen su número.
- J, Q, K valen 10 puntos.
- El As puede valer 11 o 1 dependiendo del puntaje.
- El jugador pierde si supera 21 puntos.
- El dealer pide cartas hasta tener al menos 17 puntos.



Estructura del proyecto:

- "Carta.java" → Representa una carta del mazo
- "Mazo.java" → Maneja la creación y barajado del mazo
- "Jugador.java" → Gestiona la mano y puntos del jugador
- "Juego.java" → Controla la lógica del juego
- "Casino.java" → Clase principal para ejecutar el programa



Integrantes:

- Nicolas Romero Vargas
- Juan David Rodriguez Pachón 

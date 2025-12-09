# Ejercicio 04 – ControlJuego (Singleton aplicado a videojuegos)

## Objetivo
Utilizar Singleton para manejar el estado global de un juego, de modo que todos los módulos (jugador, enemigos, interfaz) compartan el mismo estado.

## ¿Qué hace este ejercicio?
La clase `ControlJuego` maneja:
- Nivel actual
- Puntaje
- Vidas

Todos los módulos del juego acceden a este estado mediante `ControlJuego.getInstancia()`.

## ¿Qué se prueba en el main?
Se simulan tres módulos:
1. Jugador → suma puntos
2. Enemigo → resta vidas
3. Interfaz → avanza nivel

Cada módulo modifica la misma instancia global.

## Resultado esperado
El estado del juego se comparte entre todos los módulos y las tres referencias (jugador, enemigo, interfaz) son la misma instancia.

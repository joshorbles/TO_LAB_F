# Ejercicio 01 – Configuración (Singleton Básico)

## Objetivo
Aplicar el patrón Singleton para garantizar que solo exista una instancia de la clase `Configuracion`, que almacena ajustes globales como idioma y zona horaria.

## ¿Qué hace este ejercicio?
- Crea la clase `Configuracion` con un constructor privado.
- Implementa el método `getInstancia()` que devuelve siempre la misma instancia.
- Demuestra en el `main` que, aunque se llamen dos variables (`c1` y `c2`), ambas apuntan al mismo objeto.

## ¿Qué se prueba en el main?
- Que el idioma cambiando en `c2` también afecta a `c1`.
- Que el hashCode de ambas referencias es igual.
- Que `c1 == c2` es `true`.

## Resultado esperado
El programa muestra que los valores se comparten y que solo existe una instancia real de `Configuracion`.

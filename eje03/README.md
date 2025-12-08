# Ejercicio 03 – Conexión a Base de Datos Simulada (Singleton)

## Objetivo
Simular una conexión a base de datos donde solo puede existir una conexión activa mediante el patrón Singleton.

## ¿Qué hace este ejercicio?
- Implementa la clase `ConexionBD` como Singleton.
- Tiene métodos: `conectar()`, `desconectar()` y `estado()`.
- Solo permite una conexión activa a la vez.

## ¿Qué se prueba en el main?
- `c1.conectar()` establece la conexión.
- `c2.conectar()` detecta que ya existe una conexión.
- `c2.desconectar()` afecta también a `c1` porque es la misma instancia.
- Se muestra que `c1 == c2` es verdadero.

## Resultado esperado
El programa demuestra que solo puede haber una conexión real, y todas las referencias apuntan al mismo objeto en memoria.

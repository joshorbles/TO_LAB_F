# Ejercicio 05 – Singleton Thread-Safe (Seguro en Múltiples Hilos)

## Objetivo
Modificar el Singleton para hacerlo seguro en entornos con múltiples hilos (multithreading), evitando que dos hilos creen instancias diferentes al mismo tiempo.

## ¿Qué hace este ejercicio?
- Usa `volatile` para asegurar visibilidad entre hilos.
- Implementa “double-checked locking” para mayor eficiencia.
- Sincroniza los métodos críticos (`conectar()` y `desconectar()`).
- Simula múltiples hilos accediendo a la misma conexión.

## ¿Qué se prueba en el main?
- Dos hilos (`Hilo-A` y `Hilo-B`) intentan conectarse a la BD.
- Solo un hilo establece realmente la conexión.
- El otro detecta que ya existe una conexión activa.
- Ambos trabajan con la misma instancia.

## Resultado esperado
Se demuestra que:
- Solo se crea UNA instancia, incluso con hilos paralelos.
- Los métodos sincronizados evitan condiciones de carrera.
- El comportamiento del Singleton es consistente y seguro.


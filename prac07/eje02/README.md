# Ejercicio 02 – Logger (Singleton con Archivo)

## Objetivo
Implementar un Logger que registre mensajes en un archivo de texto utilizando el patrón Singleton para evitar múltiples instancias del sistema de logging.

## ¿Qué hace este ejercicio?
- Crea un archivo `bitacora.log` (si no existe) en la carpeta donde se ejecuta el programa.
- Cada llamada al método `log(mensaje)` escribe una línea con fecha y hora.
- Garantiza que todo el programa use un único Logger.

## ¿Qué se prueba en el main?
- Que `l1` y `l2` apuntan al mismo Logger.
- Que ambos escriben en el mismo archivo.
- Que se crea correctamente el archivo `bitacora.log`.

## Resultado esperado
El archivo `bitacora.log` contiene las líneas generadas por todos los módulos, confirmando que el Logger es único en todo el programa.

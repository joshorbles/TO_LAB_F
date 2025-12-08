# Práctica 07 – Patrón Singleton

Este repositorio contiene los ejercicios requeridos para la práctica 07, cada uno en su carpeta correspondiente (eje01 – eje05).  
Cada ejercicio incluye su implementación en Java y su README explicativo.

## Integrantes
- JOSHUA ORBEGOZO LESCANO

## Contenido del entregable
- eje01: Singleton básico (Configuración)
- eje02: Logger Singleton que escribe en archivo
- eje03: Conexión a BD simulada (Singleton aplicado)
- eje04: Control del estado global de un juego
- eje05: Singleton con soporte multihilo (Thread-safe)

# Cuestionario

1) ¿Qué desventajas tiene el patrón Singleton en pruebas unitarias?
- Dificulta el aislamiento de pruebas porque mantiene estado global.
- Complica el mockeo; muchas herramientas requieren inyectar dependencias.
- Puede crear efectos colaterales si no se reinicia el estado entre pruebas.

2) ¿Cuándo no es recomendable usar Singleton?
- Si varias instancias no causarían problemas o son necesarias.
- En código que debe ser fácil de testear con mocks.
- Cuando se busca un diseño desacoplado (prefiere inyección de dependencias).

3) ¿Cómo se diferencia de una clase estática?
- Singleton tiene una instancia y puede implementar interfaces, y control de inicialización.
- Clase estática no puede ser instanciada ni mockeada y su estado es verdaderamente global.

## Cómo compilar y ejecutar
Desde la carpeta `prac07`:
- Compilar un ejercicio: `javac eje01/Configuracion.java` (o compilar todos).
- Ejecutar: `java -cp eje01 Configuracion`
- Para pruebas multi-hilo del eje05 compilar y ejecutar los archivos en `eje05`.

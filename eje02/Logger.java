package eje02;

import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instancia;
    private static final Path LOG_PATH = Paths.get("bitacora.log");
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private Logger() {
        // crear archivo si no existe
        try {
            if (!Files.exists(LOG_PATH)) {
                Files.createFile(LOG_PATH);
            }
        } catch (IOException e) {
            System.err.println("No se pudo crear bitacora.log: " + e.getMessage());
        }
    }

    public static Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void log(String mensaje) {
        String linea = dtf.format(LocalDateTime.now()) + " - " + mensaje + System.lineSeparator();
        try {
            Files.write(LOG_PATH, linea.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println("Error escribiendo en log: " + e.getMessage());
        }
    }

    // Main de prueba
    public static void main(String[] args) {
        Logger l1 = Logger.getInstancia();
        Logger l2 = Logger.getInstancia();

        l1.log("Inicio de la aplicacion");
        l2.log("Evento desde otro componente");

        System.out.println("Ambos apuntan a la misma instancia: " + (l1 == l2));
        System.out.println("Revisa el archivo bitacora.log en la carpeta desde donde ejecutes.");
    }
}

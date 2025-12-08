package eje05;

public class ConexionBDThreadSafe {
    private static volatile ConexionBDThreadSafe instancia;
    private boolean conectado;

    private ConexionBDThreadSafe() { conectado = false; }

    public static ConexionBDThreadSafe getInstancia() {
        if (instancia == null) {
            synchronized (ConexionBDThreadSafe.class) {
                if (instancia == null) {
                    instancia = new ConexionBDThreadSafe();
                }
            }
        }
        return instancia;
    }

    public synchronized void conectar() {
        if (!conectado) {
            conectado = true;
            System.out.println("Conexión establecida por " + Thread.currentThread().getName());
        } else {
            System.out.println("Ya hay conexión (consultado por " + Thread.currentThread().getName() + ")");
        }
    }

    public synchronized void desconectar() {
        if (conectado) {
            conectado = false;
            System.out.println("Conexión cerrada por " + Thread.currentThread().getName());
        } else {
            System.out.println("No había conexión para cerrar (" + Thread.currentThread().getName() + ")");
        }
    }

    public String estado() { return conectado ? "Conectado" : "Desconectado"; }

    // Prueba multi-hilo
    public static void main(String[] args) throws InterruptedException {
        Runnable tarea = () -> {
            ConexionBDThreadSafe conn = ConexionBDThreadSafe.getInstancia();
            conn.conectar();
            System.out.println("Estado en hilo " + Thread.currentThread().getName() + ": " + conn.estado());
            conn.desconectar();
        };

        Thread t1 = new Thread(tarea, "Hilo-A");
        Thread t2 = new Thread(tarea, "Hilo-B");
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Prueba de ConexionBDThreadSafe finalizada.");
    }
}

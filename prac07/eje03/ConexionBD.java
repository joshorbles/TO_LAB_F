package eje03;

public class ConexionBD {
    private static ConexionBD instancia;
    private boolean conectado;

    private ConexionBD() {
        this.conectado = false;
    }

    public static ConexionBD getInstancia() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }

    public void conectar() {
        if (!conectado) {
            // simulación de conexión
            conectado = true;
            System.out.println("Conexión a BD establecida.");
        } else {
            System.out.println("Ya existe una conexión activa.");
        }
    }

    public void desconectar() {
        if (conectado) {
            conectado = false;
            System.out.println("Conexión a BD cerrada.");
        } else {
            System.out.println("No hay conexión activa para cerrar.");
        }
    }

    public String estado() {
        return conectado ? "Conectado" : "Desconectado";
    }

    // Main de prueba
    public static void main(String[] args) {
        ConexionBD c1 = ConexionBD.getInstancia();
        ConexionBD c2 = ConexionBD.getInstancia();

        c1.conectar();
        System.out.println("Estado desde c2: " + c2.estado());
        c2.conectar(); // debe indicar que ya hay conexión
        c2.desconectar();
        System.out.println("Estado desde c1: " + c1.estado());
        System.out.println("c1 == c2 ? " + (c1 == c2));
    }
}

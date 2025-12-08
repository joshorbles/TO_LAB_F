package eje04;

public class ControlJuego {
    private static ControlJuego instancia;

    private int nivel;
    private int puntaje;
    private int vidas;

    private ControlJuego() {
        this.nivel = 1;
        this.puntaje = 0;
        this.vidas = 3;
    }

    public static ControlJuego getInstancia() {
        if (instancia == null) {
            instancia = new ControlJuego();
        }
        return instancia;
    }

    public int getNivel() { return nivel; }
    public void avanzarNivel() { nivel++; }

    public int getPuntaje() { return puntaje; }
    public void sumarPuntos(int p) { puntaje += p; }

    public int getVidas() { return vidas; }
    public void perderVida() { if (vidas>0) vidas--; }

    public void mostrarEstado() {
        System.out.println("Nivel: " + nivel + " | Puntaje: " + puntaje + " | Vidas: " + vidas + " | Instancia: " + this.hashCode());
    }

    // Simulación simple en el main
    public static void main(String[] args) {
        // Módulo Jugador
        ControlJuego jugador = ControlJuego.getInstancia();
        jugador.sumarPuntos(100);
        jugador.mostrarEstado();

        // Módulo Enemigo
        ControlJuego enemigo = ControlJuego.getInstancia();
        enemigo.perderVida();
        enemigo.mostrarEstado();

        // Interfaz
        ControlJuego ui = ControlJuego.getInstancia();
        ui.avanzarNivel();
        ui.mostrarEstado();

        System.out.println("Todas las referencias apuntan igual: " + (jugador == enemigo && enemigo == ui));
    }
}

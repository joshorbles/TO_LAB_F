package eje01;

public class Configuracion {
    private static Configuracion instancia;
    private String idioma;
    private String zonaHoraria;

    private Configuracion() {
        // valores por defecto
        this.idioma = "es";
        this.zonaHoraria = "America/Lima";
    }

    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    public String getIdioma() { return idioma; }
    public void setIdioma(String idioma) { this.idioma = idioma; }

    public String getZonaHoraria() { return zonaHoraria; }
    public void setZonaHoraria(String zonaHoraria) { this.zonaHoraria = zonaHoraria; }

    public void mostrarConfiguracion() {
        System.out.println("Idioma: " + idioma);
        System.out.println("Zona horaria: " + zonaHoraria);
        System.out.println("Instancia hash: " + this.hashCode());
    }

    // Main de prueba
    public static void main(String[] args) {
        Configuracion c1 = Configuracion.getInstancia();
        Configuracion c2 = Configuracion.getInstancia();

        c1.mostrarConfiguracion();
        System.out.println("--- cambiando idioma desde c2 ---");
        c2.setIdioma("en");
        c1.mostrarConfiguracion();

        System.out.println("c1 == c2 ? " + (c1 == c2));
    }
}

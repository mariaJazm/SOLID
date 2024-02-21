package openClosed;

public abstract class baseExhibicionZoo implements exhibicionZoo {
    protected String nombre;

    public baseExhibicionZoo(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInformacion() {
        System.out.println("Información genérica de la exhibición: " + nombre);
    }
}
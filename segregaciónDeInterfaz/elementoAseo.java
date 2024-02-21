package segregaciónDeInterfaz;

public abstract class elementoAseo {
    protected String nombre;

    public elementoAseo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

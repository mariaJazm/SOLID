package segregaciónDeInterfaz;

public class jabon extends elementoAseo implements elementoLimpieza, elementoCuidadoPersonal {
    public jabon(String nombre) {
        super(nombre);
    }

    @Override
    public void limpiar() {
        System.out.println(getNombre() + " se utiliza para limpiar el cuerpo.");
    }

    @Override
    public void cuidar() {
        System.out.println(getNombre() + " ayuda a cuidar la piel.");
    }
}


package segregaciónDeInterfaz;

public class desinfectante extends elementoAseo implements elementoLimpieza {
    public desinfectante(String nombre) {
        super(nombre);
    }

    @Override
    public void limpiar() {
        System.out.println(getNombre() + " se utiliza para desinfectar superficies.");
    }
}

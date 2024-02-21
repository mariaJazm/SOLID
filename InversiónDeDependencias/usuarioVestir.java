package InversiónDeDependencias;

public class usuarioVestir {
    private final vestir servicioVestir;
    private final cuidadoRopa servicioCuidadoRopa;
    
    public usuarioVestir(vestir servicioVestir, cuidadoRopa servicioCuidadoRopa) {
        this.servicioVestir = servicioVestir;
        this.servicioCuidadoRopa = servicioCuidadoRopa;
    }
    
    public void realizarActividadesVestir() {
        servicioVestir.vestirse();
        servicioCuidadoRopa.cuidarRopa();
    }
}

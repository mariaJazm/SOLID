package liskovSubstitution;

public class jugueteElectronico extends juguete {
    private String tipoBateria;

    public jugueteElectronico(String nombre, double precio, String tipoBateria) {
        super(nombre, precio);
        this.tipoBateria = tipoBateria;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    @Override
    public void jugar() {
        System.out.println("¡Juguemos con el juguete electrónico!");
    }

}
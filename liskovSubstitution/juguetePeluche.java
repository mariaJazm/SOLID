package liskovSubstitution;

public class juguetePeluche extends juguete {
    private String material;

    public juguetePeluche(String nombre, double precio, String material) {
        super(nombre, precio);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void jugar() {
        System.out.println("¡Juguemos con el juguete electrónico!");
    }

}

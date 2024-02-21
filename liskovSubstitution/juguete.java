package liskovSubstitution;

public class juguete {
    
    private String nombre;
    private double precio;

    public juguete(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // acción única del 
    public void jugar() {
        System.out.println("¡Juguemos con el juguete!");
    }

}

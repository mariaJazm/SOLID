package singleResponsability;
import java.util.ArrayList;
import java.util.List;

// correcta aplicación del principio de responsabilidad única
// la clase biblioteca tiene como única responsabilidad, tener registro del prestamo y devolución de libros

public class biblioteca {
    private String nombre;
    List<libro> listaLibros = new ArrayList<>();
    List<cliente> listaClientes = new ArrayList<>();

        // Constructor
        public biblioteca(String nombre) {
            this.nombre = nombre;
        }
    
        // Agregar libros
        public void agregarLibro(libro libro) {
            listaLibros.add(libro);
        }
    
        // Agregar libros
        public void agregarCliente(cliente cliente) {
            listaClientes.add(cliente);
        }

        public void prestarLibro(libro libro, cliente cliente) {
            // registra el prestamo del libro a x cliente
        }

        public void devolverLibro(libro libro, cliente cliente) {
            // registra la devolución del libro de X cliente
        }
    
}
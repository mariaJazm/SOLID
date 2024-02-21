package openClosed;

    public class exhibicionAves extends baseExhibicionZoo {
        public exhibicionAves(String nombre) {
            super(nombre);
        }
    
        @Override
        public void mostrarInformacion() {
            System.out.println("Información de la Exhibición de Aves: " + nombre);
            // Lógica específica para mostrar información de esta nueva exhibición de aves
        }
    }

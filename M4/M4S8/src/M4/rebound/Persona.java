package M4.rebound;

abstract class Persona {
        private String nombre;
        private String identificador;

        public Persona(String nombre, String identificador) {
                this.nombre = nombre;
                this.identificador = identificador;
        }

        public String getNombre() {
                return nombre;
        }

        public String getIdentificador() {
                return identificador;
        }

        public abstract void leer();

        public abstract void realizarEjercicios();

}

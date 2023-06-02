    public class videojuegos {
        //videojuegos implementar 5 intancias de una clase  creando sett-gett y constructor
        String nombre_juego;
        String genero;
        int anioLanzamiento;
        String creador;

    //constructor
    public videojuegos(String nombre_juego,String genero,int anioLanzamiento,String creador){
        this.nombre_juego=nombre_juego;
        this.genero=genero;
        this.anioLanzamiento=anioLanzamiento;
        this.creador=creador;
    }

    //setters y getters

        public String getNombre_juego() {
            return nombre_juego;
        }

        public void setNombre_juego(String nombre_juego) {
            this.nombre_juego = nombre_juego;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public int getAnioLanzamiento() {
            return anioLanzamiento;
        }

        public void setAnioLanzamiento(int anioLanzamiento) {
            this.anioLanzamiento = anioLanzamiento;
        }

        public String getCreador() {
            return creador;
        }

        public void setCreador(String creador) {
            this.creador = creador;
        }
        //ALMACENAR PARA IMPRIMIR DATOS
        public void imprimirDatos(){
        System.out.println("NOMBRE DEL JUEGO:"+this.nombre_juego);
        System.out.println("GENERO:"+this.genero);
        System.out.println("ANIO LANZAMIENTO:"+this.anioLanzamiento);
        System.out.println("CREADOR:"+this.creador);
        }
    }
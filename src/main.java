public class main {
    public static void main(String[] args ){
        //Crear Instancias
        videojuegos Pacman = new videojuegos("Pacman", "clasico",1980,"Kirito" );
        videojuegos Fornite= new videojuegos("Fornite", "Online-Disparos",2018,
                "EpicGames" );
        videojuegos RocketLeague = new videojuegos("RocketLeague", "Deporte-Conduccion",
                2018, "EpicGames" );
        videojuegos MarioCars = new videojuegos("MarioCars", "Carreras",
                2015, "Nintendo" );
        videojuegos FullGuys = new videojuegos("FullGuys", "Carreras-obstaculos",
                2018, "EpicGames" );
        //Imprimir Instancias
        System.out.println("\n\tVIDEOJUEGOS");
        System.out.println("\n******VIDEOJUEGO 1******");
        Pacman.imprimirDatos();
        System.out.println("\n******VIDEOJUEGO 2******");
        Fornite.imprimirDatos();
        System.out.println("\n******VIDEOJUEGO 3******");
        RocketLeague.imprimirDatos();
        System.out.println("\n******VIDEOJUEGO 4******");
        MarioCars.imprimirDatos();
        System.out.println("\n******VIDEOJUEGO 5******");
        FullGuys.imprimirDatos();
    }
}

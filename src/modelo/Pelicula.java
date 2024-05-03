package modelo;

import java.util.Scanner;

public class Pelicula extends Titulo{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void cargarPelicula(Pelicula pelicula){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la pelicula:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el año de lanzamiento:");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Ingrese la duración en minutos de la pelicula:");
        int duracionEnMinutos = teclado.nextInt();
        teclado.nextLine();
        Pelicula peliculaUsuario = new Pelicula();
        peliculaUsuario.setNombre(nombre);
        peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
        peliculaUsuario.setDuracionEnMinutos(duracionEnMinutos);
        peliculaUsuario.muestraFichaTecnica();
    }

    public void contadorDePeliculas(){
        int contadorTotalMinutos=0;
        System.out.println("*******MARATON DE PELICULAS*******");
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantas peliculas vas a mirar?");
        int cantidadPeliculas = teclado.nextInt();
        for (int i = 0; i < cantidadPeliculas; i++) {
            System.out.println("Ingrese el nombre de la pelicula Nº"+(i+1));
            String nombre = teclado.next();
            teclado.nextLine();
            System.out.println("Ingrese la duración en minutos de la pelicula Nº"+(i+1));
            int duracionEnMinutos = teclado.nextInt();
            teclado.nextLine();
            contadorTotalMinutos= contadorTotalMinutos + duracionEnMinutos;
            Pelicula peliculaUsuario = new Pelicula();
            peliculaUsuario.setNombre(nombre);
            peliculaUsuario.setDuracionEnMinutos(duracionEnMinutos);
        }

        if(cantidadPeliculas > 1){
            System.out.println(ANSI_CYAN+"la cantidad total de minutos para ver todas esas peliculas es: "+contadorTotalMinutos+ANSI_RESET+"\n");

        }else if(cantidadPeliculas < 1){
            System.out.println(ANSI_RED+"Debe ingresar un numero mayor"+ANSI_RESET+"\n");
        }else{
            System.out.println(ANSI_CYAN+"la cantidad total de minutos para ver esa peliculas es: "+contadorTotalMinutos+ANSI_RESET+"\n");
        }



    }
}

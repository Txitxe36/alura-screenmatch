import modelo.Pelicula;
import modelo.Serie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public void muestraElMenu(){
        int opcion =0;
        Scanner teclado = new Scanner(System.in);

    while(opcion != 9){
        String titulo= """
                ***************************************************************
                ******************* BIENVENID@ A SCREENMATCH ****************** 
                ***************************************************************
                """;
        String menu = """ 
                BIENVENID@ A SCREENMATCH
                1) Registrar nueva pelicula
                2) Registrar nueva serie
                3) Maratón de peliculas
                4) Maraton de series
                9) Salir
                """;
        System.out.println(ANSI_BLUE + titulo + ANSI_RESET);
        System.out.println(ANSI_PURPLE+ menu + ANSI_RESET);
        opcion = teclado.nextInt();
        teclado.nextLine();

        switch (opcion){
            case 1:
                Pelicula pelicula= new Pelicula();
                pelicula.cargarPelicula(pelicula);
                break;
            case 2:
                Serie serie = new Serie();
                serie.cargarSerie();
                break;
            case 3:
                Pelicula peliMaraton = new Pelicula();
                peliMaraton.contadorDePeliculas();
                break;
            case 4:
                Serie serieMaraton = new Serie();
                serieMaraton.contadorDeSeries();
                break;
            case 9:
                System.out.println("SALIENDO DEL SISTEMA");
                break;
            default:
                System.out.println("ERROR");
                break;

        }
    }


    }
}

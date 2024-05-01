import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        System.out.println(ANSI_BLUE + "*********BIENVENIDOS A LA INMERSIÓN DE JAVA*********" + ANSI_RESET);

        String nombre;
        double mediaEvaluacionUsuario = 0;
        Scanner teclado = new Scanner(System.in);
        int cantidadDeNotas = 0;
        int fechaDeLanzamiento =0;
        int i =0;

        System.out.println(ANSI_PURPLE+ "Ingrese el nombre de la pelicula que desea puntuar: ");
        nombre = teclado.nextLine();

        System.out.println("Ingrese el año de lanzamiento: ");
        fechaDeLanzamiento = teclado.nextInt();

        System.out.println("Ingrese la cantidad de puntuaciones que le quiere dar: ");
        cantidadDeNotas = teclado.nextInt();

        while (i < cantidadDeNotas){
            System.out.println("nota Nº "+(i+1)+" que le das a "+nombre+" (ENTRE 0 Y 5)");
            double notaPelicula = teclado.nextDouble();
            if(notaPelicula > 5 || notaPelicula < 0 ){
                System.out.println(ANSI_RED+"Nota fuera de rango. intente de nuevo"+ANSI_CYAN);
            }else{

                mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaPelicula;
                i++;
            }

        }

        System.out.println(ANSI_BLUE + "*********RESUMEN*********");

        if(fechaDeLanzamiento >= 2023){
            System.out.println(ANSI_GREEN+nombre +" es una pelicula popular del momento");
        }else{
            System.out.println(ANSI_GREEN+nombre +" es una pelicula retro que vale la pena ver");
        }

        double puntucionFinal = mediaEvaluacionUsuario / cantidadDeNotas;


        if(puntucionFinal <=1){
            System.out.println(ANSI_RED+"La nota media de la pelicula "+nombre+ "" +
                    " calculada por el usuario es: "+ puntucionFinal + ANSI_RESET);
        }else if (puntucionFinal >1 && puntucionFinal < 4) {
            System.out.println(ANSI_YELLOW+"La nota media de la pelicula "+nombre+ "" +
                    " calculada por el usuario es: "+ puntucionFinal + ANSI_RESET);
        }else {
            System.out.println(ANSI_GREEN+"La nota media de la pelicula "+nombre+ "" +
                    " calculada por el usuario es: "+ puntucionFinal + ANSI_RESET);
        }


    }
}
package modelo;

import java.util.Scanner;

public class Serie extends Titulo{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static final String ANSI_CYAN = "\u001B[36m";

    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    @Override
    public int getDuracionEnMinutos() {
        return minutosPorEpisodio * episodiosPorTemporada * temporadas;
    }

    public void cargarSerie(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la serie:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el año de lanzamiento:");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Ingrese la cantidad de temporadas:");
        int cantidadDeTemporadas = teclado.nextInt();
        System.out.println("Ingrese la cantidad de  episodios por temporadas:");
        int cantidadDeEpisodiosPorTemporadas = teclado.nextInt();
        System.out.println("Ingrese la cantidad  minutos por episodio (APROX):");
        int minutosPorEpisodio = teclado.nextInt();
        teclado.nextLine();
        Serie serie =new Serie();
        serie.setNombre(nombre);
        serie.setFechaDeLanzamiento(fechaDeLanzamiento);
        serie.setTemporadas(cantidadDeTemporadas);
        serie.setEpisodiosPorTemporada(cantidadDeEpisodiosPorTemporadas);
        serie.setMinutosPorEpisodio(minutosPorEpisodio);
        serie.muestraFichaTecnica();
    }

    public void contadorDeSeries() {
        int contadorTotalMinutos = 0;
        System.out.println("*******MARATON DE SERIES*******");
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantas series vas a mirar?");
        int cantidadSeries = teclado.nextInt();
        for (int i = 0; i < cantidadSeries; i++) {
            System.out.println("Ingrese el nombre de la serie Nº" + (i + 1));
            String nombre = teclado.next();
            teclado.nextLine();
            System.out.println("Ingrese la duración en minutos de la serie Nº" + (i + 1));
            int duracionEnMinutos = teclado.nextInt();
            teclado.nextLine();
            contadorTotalMinutos = contadorTotalMinutos + duracionEnMinutos;
            Serie serieUsuario = new Serie();
            serieUsuario.setNombre(nombre);
            serieUsuario.setDuracionEnMinutos(getDuracionEnMinutos());
        }

        if(cantidadSeries > 1){
            System.out.println(ANSI_CYAN+"la cantidad total de minutos para ver todas esas series es: "+contadorTotalMinutos+ANSI_RESET+"\n");
        }else if(cantidadSeries < 1){
            System.out.println(ANSI_RED+"Debe ingresar un numero mayor"+ANSI_RESET+"\n");
        }else{
            System.out.println(ANSI_CYAN+"la cantidad total de minutos para ver esa series es: "+contadorTotalMinutos+ANSI_RESET+"\n");
        }
    }
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorTemporada() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}

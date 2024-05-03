package modelo;

public class Titulo {

    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnPlanBAsico;

    public void muestraFichaTecnica(){
        System.out.println("El nombre es: " + getNombre());
        System.out.println("Su año de lanzamiento fue: " + getFechaDeLanzamiento());
        System.out.println("Su duración total es: " + getDuracionEnMinutos() + " minutos");
        System.out.println("\n");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public boolean isIncluidoEnPlanBAsico() {
        return incluidoEnPlanBAsico;
    }

    public void setIncluidoEnPlanBAsico(boolean incluidoEnPlanBAsico) {
        this.incluidoEnPlanBAsico = incluidoEnPlanBAsico;
    }


}

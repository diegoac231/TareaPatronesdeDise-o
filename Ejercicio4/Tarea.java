package Ejercicio4;


public class Tarea {
    private String nombre;
    private boolean completada;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.completada = false;
    }

    public void completar() {
        this.completada = true;
    }

    public void descompletar() {
        this.completada = false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isCompletada() {
        return completada;
    }

    public boolean setNombre(String nuevoNombre) {
        return completada;
    }
}

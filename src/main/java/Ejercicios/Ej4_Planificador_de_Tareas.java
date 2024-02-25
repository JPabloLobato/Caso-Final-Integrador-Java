package Ejercicios;
import java.util.ArrayList;
import java.util.List;
// Clase para crear tareas
class Tarea {
    private String nombre;
    private int duracion;
    // Constructor para crear una tarea
    public Tarea(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }
    // Método para obtener el nombre de la tarea
    public String getNombre() {
        return nombre;
    }
    // Método para obtener la duración de la tarea
    public int getDuracion() {
        return duracion;
    }
}
// Clase para crear tripulación
class Tripulacion {
    private String nombre;
    private int disponibilidad;
    // Constructor para crear tripulación
    public Tripulacion(String nombre, int disponibilidad) {
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
    }
    // Método para obtener el nombre de la tripulación
    public String getNombre() {
        return nombre;
    }
    // Método para obtener la disponibilidad de la tripulación
    public int getDisponibilidad() {
        return disponibilidad;
    }
    // Método para disminuir la disponibilidad de la tripulación después de asignar una tarea
    public void disminuirDisponibilidad(int tiempo) {
        this.disponibilidad -= tiempo;
    }
}
// Clase para planificar tareas
public class Planificador_de_Tareas {

    // Método para asignar tareas a la tripulación
    public static void asignarTareas(List<Tarea> tareas, List<Tripulacion> tripulacion) {
        int[][] asignaciones = new int[tripulacion.size()][tareas.size()];

        for (int i = 0; i < tripulacion.size(); i++) {
            for (int j = 0; j < tareas.size(); j++) {
                if (tripulacion.get(i).getDisponibilidad() >= tareas.get(j).getDuracion()) {
                    asignaciones[i][j] = 1; // Asignar la tarea si la tripulación tiene suficiente disponibilidad
                    tripulacion.get(i).disminuirDisponibilidad(tareas.get(j).getDuracion());
                }
            }
        }

        // Imprimir asignaciones
        for (int i = 0; i < tripulacion.size(); i++) {
            System.out.println("Asignaciones para " + tripulacion.get(i).getNombre() + ":");
            for (int j = 0; j < tareas.size(); j++) {
                if (asignaciones[i][j] == 1) {
                    System.out.println("   - " + tareas.get(j).getNombre());
                }
            }
        }
    }

    public static void main(String[] args) {
        // Crear tareas
        List<Tarea> tareas = new ArrayList<>();
        tareas.add(new Tarea("Tarea 1", 3));
        tareas.add(new Tarea("Tarea 2", 2));
        tareas.add(new Tarea("Tarea 3", 4));

        // Crear tripulación
        List<Tripulacion> tripulacion = new ArrayList<>();
        tripulacion.add(new Tripulacion("Tripulación 1", 8));
        tripulacion.add(new Tripulacion("Tripulación 2", 6));

        // Asignar tareas a la tripulación
        asignarTareas(tareas, tripulacion);
    }
}

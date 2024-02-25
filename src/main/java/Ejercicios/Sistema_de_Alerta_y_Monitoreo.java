package Ejercicios;
import java.util.ArrayList;
import java.util.List;
public class Sistema_de_Alerta_y_Monitoreo {
    private int[] VariablesAmbientales;
    private int[] Eventos;
    //Constructor que inicializa las variables de la clases.
    public Sistema_de_Alerta_y_Monitoreo(int[] VariablesAmbientales, int[] Eventos) {
        this.VariablesAmbientales = VariablesAmbientales;
        this.Eventos = Eventos;
    }
    //Identificador de eventos raros.
    public void IdentificarEventosRaros() {
        for (int Evento : Eventos) {
            if (Evento < 0 || Evento > 1000) {
                System.out.println("Evento raro detectado: " + Evento);
            }
        }
    }
}

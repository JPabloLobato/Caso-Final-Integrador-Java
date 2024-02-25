package Ejercicios;
import java.util.ArrayList;
import java.util.List;
public class Ej3_Sistema_de_Alerta_y_Monitoreo {
    private int[] VariablesAmbientales;
    private int[] Eventos;
    //Constructor que inicializa las variables de la clases.
    public Ej3_Sistema_de_Alerta_y_Monitoreo(int[] VariablesAmbientales, int[] Eventos) {
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
    //Monitoreo constante de las variables ambientales.
    public void MonitoreoConstante (int Umbral) {
        for (int Variable : VariablesAmbientales) {
            if (Variable > Umbral) {
                System.out.println("Alerta: " + Variable + " excede el umbral de " + Umbral);
            }
        }
    }
    //Análisis de tendencias.
    private boolean isPrime (int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    //Descomposición de problemas.
    public void DescomposicionDeProblemas (int num) {
        List<Integer> factores = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            while (num % i == 0 && isPrime(i)) {
                factores.add(i);
                num /= i;
            }
        }
        System.out.println("Factores primos: " + factores);
    }
    public static void main (String[] args) {
        int[] VariablesAmbientales = {10, 20, 30, 40, 50};
        int[] Eventos = {5, 15, 25, 35, 45};
        int Umbral = 25;
        int num = 100;
        Ej3_Sistema_de_Alerta_y_Monitoreo sistema = new Ej3_Sistema_de_Alerta_y_Monitoreo(VariablesAmbientales, Eventos);
        sistema.IdentificarEventosRaros();
        sistema.MonitoreoConstante(Umbral);
        sistema.DescomposicionDeProblemas(num);
    }
}

package Ejercicios;
// Clase para crear un cronometro cósmico
public class Ej1_Cronometro_Cosmico {
    private double PlanetaDiaEnSegundos;
    private double PlanetaAnosEnSegundos;
    // Constructor para crear un cronometro cósmico
    public Ej1_Cronometro_Cosmico(double PlanetaDiaEnSegundos, double PlanetaAnosEnSegundos){
        this.PlanetaDiaEnSegundos = PlanetaDiaEnSegundos * 24 * 60 * 60;
        this.PlanetaAnosEnSegundos = PlanetaAnosEnSegundos * 365 * 24 * 60 * 60;
    }
    // Método para convertir el tiempo en segundos a tiempo en un planeta
    public double convertTimeToPlanet(double TiempoEnSegondos) {
        return TiempoEnSegondos / this.PlanetaDiaEnSegundos;
    }
    // Método para mostrar el tiempo en segundos, minutos, horas, días y años
    public void mostrarTiempo (double TiempoEnSegundos) {
        double minutes = TiempoEnSegundos / 60;
        double hours = minutes / 60;
        double days = hours / 24;
        double years = days / 365;

        System.out.println("Tiempo en segundos: " + TiempoEnSegundos);
        System.out.println("Tiempo en minutos: " + minutes);
        System.out.println("Tiempo en horas: " + hours);
        System.out.println("Tiempo en dias: " + days);
        System.out.println("Tiempo en años: " + years);
    }
    // Método para analizar el límite de datos
    public void dataLimitAnalysis() {
        System.out.println("Valor máximo por byte: " + Byte.MAX_VALUE);
        System.out.println("Valor máximo por short: " + Short.MAX_VALUE);
        System.out.println("Valor máximo por int: " + Integer.MAX_VALUE);
        System.out.println("Valor máximo por long: " + Long.MAX_VALUE);
        System.out.println("Valor máximo por float: " + Float.MAX_VALUE);
        System.out.println("Valor máximo por double: " + Double.MAX_VALUE);
    }
    public static void main(String[] args) {
        Ej1_Cronometro_Cosmico cronometro = new Ej1_Cronometro_Cosmico(86400, 31536000);
        double tiempoEnSegundos = 1000000000;
        double tiempoEnPlaneta = cronometro.convertTimeToPlanet(tiempoEnSegundos);
        System.out.println("Tiempo en segundos: " + tiempoEnSegundos);
        cronometro.mostrarTiempo(tiempoEnSegundos);
        cronometro.dataLimitAnalysis();
    }
}



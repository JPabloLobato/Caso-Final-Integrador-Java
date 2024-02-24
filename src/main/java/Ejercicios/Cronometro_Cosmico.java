package Ejercicios;

public class Cronometro_Cosmico {
    private double PlanetaDiaEnSegundos;
    private double PlanetaAnosEnSegundos;
    public Cronometro_Cosmico (double PlanetaDiaEnSegundos, double PlanetaAnosEnSegundos){
        this.PlanetaDiaEnSegundos = PlanetaDiaEnSegundos * 24 * 60 * 60;
        this.PlanetaAnosEnSegundos = PlanetaAnosEnSegundos * 365 * 24 * 60 * 60;
    }
    public double convertTimeToPlanet(double TiempoEnSegondos) {
        return TiempoEnSegondos / this.PlanetaDiaEnSegundos;
    }
    public tiempo (double TiempoEnSegundos) {
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
    public void dataLimitAnalysis() {
        System.out.println("Valor máximo por byte: " + Byte.MAX_VALUE);
        System.out.println("Valor máximo por short: " + Short.MAX_VALUE);
        System.out.println("Valor máximo por int: " + Integer.MAX_VALUE);
        System.out.println("Valor máximo por long: " + Long.MAX_VALUE);
        System.out.println("Valor máximo por float: " + Float.MAX_VALUE);
        System.out.println("Valor máximo por double: " + Double.MAX_VALUE);
    }
}


package Ejercicios;
// Clase para calcular recursos y suministros
public class Ej2_Recursos_y_suministros {
    private int NivelActualDeRecursos;
    private int UmbralSeguro;
    public Ej2_Recursos_y_suministros(int NivelActualDeRecursos, int UmbralSeguro) {
        this.NivelActualDeRecursos = NivelActualDeRecursos;
        this.UmbralSeguro = UmbralSeguro;
    }
    // Calculadora del consumo de recursos vitales.
    public int CalculadoraDeConsumo (int[] DatosDeConsumo) {
        int total = 0;
        for (int Consumo : DatosDeConsumo) {
            total += Consumo;
        }
        return total;
    }
    // Predicción de necesidades.
    public int PrediccionDeNecesidades(int[] DatosDeConsumo, int RangoDeProdiccion) {
        int total = CalculadoraDeConsumo(DatosDeConsumo);
        int promedio = total / DatosDeConsumo.length;
        return promedio * RangoDeProdiccion;
    }
    // Alerta sobre recursos caen por debajo de un umbral seguro.
    public boolean AlertaSobreRecursosBajos () {
        return NivelActualDeRecursos < UmbralSeguro;
    }
    //Estadísticas sobre el uso de recursos.
    public int[] EstadisticasDeUsoDeRecursos (int[] DatosDeConsumo) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int total = 0;
        for (int Consumo : DatosDeConsumo) {
            if (Consumo < min) {
                min = Consumo;
            }
            if (Consumo > max) {
                max = Consumo;
            }
            total += Consumo;
        }
        int promedio = total / DatosDeConsumo.length;
        return new int[] {min, max, promedio};
    }
    // Mostrar resultados.
    public void MostrarResultados (int [] DatosDeConsumo, int RangoDeProdiccion) {
        int consumo = CalculadoraDeConsumo(DatosDeConsumo);
        int prediccion = PrediccionDeNecesidades(DatosDeConsumo, RangoDeProdiccion);
        boolean alerta = AlertaSobreRecursosBajos();
        int [] estadisticas = EstadisticasDeUsoDeRecursos(DatosDeConsumo);
        System.out.println("Consumo total: " + consumo);
        System.out.println("Predicción de necesidades: " + prediccion);
        System.out.println("Alerta de recursos bajos: " + (alerta ? "Sí" : "No"));
        System.out.println("Estadísticas de consumo. Mínimo = " + estadisticas[0] + ", Máximo = " + estadisticas[1] + ", Promedio = " + estadisticas[2]);
    }
    public static void main(String[] args) {
        System.out.println("Inicio del programa");
        Ej2_Recursos_y_suministros recursos = new Ej2_Recursos_y_suministros(100, 50);
        int[] DatosDeConsumo = {10, 20, 30, 40, 50};
        int RangoDeProdiccion = 7;
        recursos.MostrarResultados(DatosDeConsumo, RangoDeProdiccion);
        System.out.println("Fin del programa");
    }
}

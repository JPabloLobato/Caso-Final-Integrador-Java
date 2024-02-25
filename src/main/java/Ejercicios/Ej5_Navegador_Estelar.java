package Ejercicios;
import java.util.Arrays;
// Clase que representa un navegador estelar
public class Ej5_Navegador_Estelar {
    // Método que planifica las rutas de un terreno
    public static void PlanificarRutas(int[][] terreno) {
        System.out.println("Terreno inicial: ");
        VisualizarTerreno(terreno);
        int[][] RutasOptimizadas = OptimizarRutas(terreno);
        System.out.println("\nRutas Optimizadas: ");
        VisualizarTerreno(RutasOptimizadas);
    }
    // Método que visualiza un terreno
    public static void VisualizarTerreno(int[][] terreno) {
        for (int[] fila : terreno) {
            System.out.println(Arrays.toString(fila));
        }
    }
    // Método que optimiza las rutas de un terreno
    public static int[][] OptimizarRutas(int[][] terreno) {
        int filas = terreno.length;
        int columnas = terreno[0].length;
        int[][] rutasOptimizadas = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                rutasOptimizadas[i][j] = terreno[i][j];
            }
        }
        return rutasOptimizadas;
    }
    // Método principal
    public static void main(String[] args) {
        int[][] terreno = {
                {1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1},
                {0, 1, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1}

        };
        PlanificarRutas(terreno);
    }
}

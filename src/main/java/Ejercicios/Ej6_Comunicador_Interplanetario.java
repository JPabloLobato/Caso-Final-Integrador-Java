package Ejercicios;
import java.util.HashMap;
import java.util.Map;
public class Ej6_Comunicador_Interplanetario {
    private Map<String, String> MensajesRecibidos;
    public Ej6_Comunicador_Interplanetario() {
        MensajesRecibidos = new HashMap<>();
    }
    public String AnalizarYTraducirMensajes(String mensajes) {
        int ContarCaracteres = ContarCaracteres(mensajes);
        boolean EsPalindromo = EsPalindromo(mensajes);
        String respuesta = ConstruirRespuesta(ContarCaracteres, EsPalindromo);
        MensajesRecibidos.put(mensajes, respuesta);
        return respuesta;
    }
    private int ContarCaracteres(String mensajes) {
        int conteo = 0;
        for (char caracter : mensajes.toCharArray()) {
            if (Character.toLowerCase(caracter) == 'e') {
                conteo++;
            }
        }
        return conteo;
    }
    private boolean EsPalindromo(String mensajes) {
        String MensajeSinEspacios = mensajes.replaceAll("\\s", "").toLowerCase();
        String MensajeInvertido = new StringBuilder(MensajeSinEspacios).reverse().toString();
        return MensajeSinEspacios.equals(MensajeInvertido);
    }
    private String ConstruirRespuesta(int ContarCaracteres, boolean EsPalindromo) {
        if (ContarCaracteres > 0 && EsPalindromo) {
            return "Mensaje recibido: Contiene la letra 'e' y es un palíndromo.";
        } else if (ContarCaracteres > 0) {
            return "Mensaje recibido: Contiene la letra 'e'.";
        } else if (EsPalindromo) {
            return "Mensaje recibido: Es un palíndromo.";
        } else {
            return "Mensaje recibido: Análisis completo.";
        }
    }
    public Map<String, String> getMensajesRecibidos() {
        return MensajesRecibidos;
    }
    public static void main(String[] args) {
        Ej6_Comunicador_Interplanetario comunicador = new Ej6_Comunicador_Interplanetario();
        String mensaje1 = "Pablo haz los deberes";
        String mensaje2 = "Hola, ¿cómo te ha ido el día?";
        String mensaje3 = "Debes hacer los deberes";
        String mensaje4 = "Seguro que tengo un 9 en la tarea Caso Final Integrador (es broma profe ponme un 10)";
        String respuesta1 = comunicador.AnalizarYTraducirMensajes(mensaje1);
        String respuesta2 = comunicador.AnalizarYTraducirMensajes(mensaje2);
        String respuesta3 = comunicador.AnalizarYTraducirMensajes(mensaje3);
        String respuesta4 = comunicador.AnalizarYTraducirMensajes(mensaje4);
        System.out.println(respuesta1);
        System.out.println(respuesta2);
        System.out.println(respuesta3);
        System.out.println(respuesta4);
        System.out.println("\nMensajes recibidos:");
        for (Map.Entry<String, String> entry : comunicador.getMensajesRecibidos().entrySet()) {
            System.out.println("Mensaje: " + entry.getKey() + " Respuesta: " + entry.getValue());
        }
    }
}

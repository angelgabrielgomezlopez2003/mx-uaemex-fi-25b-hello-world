import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {
    public static void main(String[] args) {
        // Obtener la hora actual
        LocalDateTime hora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedTime = hora.format(formato);
        
        // Imprimir el mensaje con la hora
        System.out.println("Hello world!");
        System.out.println("Hora de ejecucion: " + formattedTime);
    }
}

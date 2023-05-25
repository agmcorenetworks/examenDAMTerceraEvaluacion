package es.core.networks.dam.poo.examenTerceraEvaluacion.parte;
import java.util.Scanner;

public class ParteI {
	
	// Método 1
    public static void cadenas() {
        char[] nombre = {'J', 'a', 'v', 'i', 'e', 'r'};
        char[] apellido1 = {'P', 'u', 'e', 'n', 't', 'e', 's'};
        char[] apellido2 = {'C', 'a', 'b', 'r', 'e', 'r', 'i', 'z', 'o'};

        // Longitud del primer apellido
        System.out.println("Longitud del primer apellido: " + apellido1.length);
    }
    
    // Método 2
    public static void dam() {
        String dam1 = "DAM";
        String dam2 = new String(new char[] {'D', 'A', 'M'});
        
        System.out.println("Forma 1: " + dam1);
        System.out.println("Forma 2: " + dam2);
    }
    
    // Método 3
    public static void literal() {
        String frase = "curso de DAM";
        int longitud = frase.length();
        
        System.out.println("Longitud del literal \"curso de DAM\": " + longitud);
    }
    
    // Método 4
    public static void arrayString() {
        String texto = "Esta es la clase de POO";
        String[] palabras = texto.split(" ");
        
        // Concateno el primer y tercer elemento del array
        String concatenacion = palabras[0] + palabras[2];
        System.out.println("Concatenación del primer y tercer elemento: " + concatenacion);
        
        String palabraMenor = palabras[0];
        String palabraMayor = palabras[0];
        
        // Itero para encontrar la palabra menor y mayor dentro del array
        for (String palabra : palabras) {
            if (palabra.compareTo(palabraMenor) < 0) {
                palabraMenor = palabra;
            }
            
            if (palabra.compareTo(palabraMayor) > 0) {
                palabraMayor = palabra;
            }
        }
        
        System.out.println("Palabra menor: " + palabraMenor);
        System.out.println("Palabra mayor: " + palabraMayor);
    }
    
    // Método 5
    public static void buscaEspacios(String frase) {
        int cantidadEspacios = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                cantidadEspacios++;
            }
        }
        
        String mensajeSinEspacios = frase.replace(" ", "");
        
        if (cantidadEspacios == 0) {
        	System.out.println("No existen espacios en el string");
        }
        else {
        	System.out.println("Mensaje sin espacios: " + mensajeSinEspacios);
            System.out.println("Cantidad de espacios en la frase: " + cantidadEspacios);
        }
    }
    
    // Método 6
    public static void usoStringBuffer() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingresa tu primer apellido: ");
        String apellido1 = scanner.nextLine();
        
        System.out.print("Ingresa tu segundo apellido: ");
        String apellido2 = scanner.nextLine();
        
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(nombre).append(" ").append(apellido1).append(" ").append(apellido2);
        
        System.out.println("Antes de eliminar el nombre: " + stringBuffer.toString());
        
        stringBuffer.delete(0, nombre.length() + 1);
        
        System.out.println("Despues de eliminar el nombre: " + stringBuffer.toString());
        
        scanner.close();
    }
    
    
    public static void main(String[] args) {
        // Prueba del método 1
        cadenas();
        
        // Prueba del método 2
        dam();
        
        // Prueba del método 3
        literal();
        
        // Prueba del método 4
        arrayString();
        
        // Prueba del método 5
        String frase = "Esta es una frase de prueba";
        buscaEspacios(frase);
        
        // Prueba del método 6
        usoStringBuffer();
    }


}
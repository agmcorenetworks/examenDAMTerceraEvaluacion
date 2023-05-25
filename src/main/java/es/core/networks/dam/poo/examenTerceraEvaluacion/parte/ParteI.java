package es.core.networks.dam.poo.examenTerceraEvaluacion.parte;

import java.util.Scanner;

public class ParteI {
    
    public static void cadenas() {
        char[] nombre = {'J', 'u', 'a', 'n'};
        char[] apellido1 = {'P', 'e', 'r', 'e', 'z'};
        char[] apellido2 = {'G', 'o', 'm', 'e', 'z'};
        
        System.out.println("- Longitud del apellido primero: " + apellido1.length);
    }
    
    public static void dam() {
        String metodo1 = new String("DAM");
        String metodo2 = "D" + "A" + "M";
        
        System.out.println("- Metodo 1: " + metodo1);
        System.out.println("- Metodo 2: " + metodo2);
    }
    
    public static void literal() {
        String literal = "curso de DAM";
        int longitud = literal.length();
        
        System.out.println("- Longitud del literal \"curso de DAM\": " + longitud);
    }
    public static void arrayString() {
        String frase = "Esta es la clase de POO";
        String[] palabras = frase.split(" ");
        
        String concatenacion = palabras[0] + palabras[2];
        System.out.println("- Concatenacion del primer y tercer elemento: " + concatenacion);
        
        String menor = palabras[0];
        String mayor = palabras[0];
        
        for (String palabra : palabras) {
            if (palabra.length() < menor.length()) {
                menor = palabra;
            }
            
            if (palabra.length() > mayor.length()) {
                mayor = palabra;
            }
        }
        
        System.out.println("- Palabra menor: " + menor);
        System.out.println("- Palabra mayor: " + mayor);
    }
    public static String buscaEspacios(String frase) {
        int espacios = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                espacios++;
            }
        }
        
        String mensaje = "- La frase sin espacios es: " + frase.replace(" ", "") + "\n";
        mensaje += "- La frase contiene " + espacios + " espacios.";
        
        return mensaje;
    }
    
    public static void usoStringBuffer() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("- Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("- Ingrese su primer apellido: ");
        String apellido1 = scanner.nextLine();
        
        System.out.print("- Ingrese su segundo apellido: ");
        String apellido2 = scanner.nextLine();
        
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(nombre).append(" ").append(apellido1).append(" ").append(apellido2);
        
        stringBuffer.delete(0, nombre.length() + 1);
        
        System.out.println("Resultado final: " + stringBuffer.toString());
    }
    
    public static void main(String[] args) {
        cadenas();
        dam();
        literal();
        arrayString();
        System.out.println(buscaEspacios("h"));
        usoStringBuffer();
    }
}

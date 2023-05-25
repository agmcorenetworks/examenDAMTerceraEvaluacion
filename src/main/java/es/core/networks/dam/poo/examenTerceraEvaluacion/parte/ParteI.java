package es.core.networks.dam.poo.examenTerceraEvaluacion.parte;

import java.util.Scanner;

public class ParteI {
	public static void cadenas() {
        char[] nombre = {'C', 'a', 'r', 'l', 'o', 's'};
        char[] apellido1 = {'G', 'o', 'n', 'z', 'a', 'l', 'e', 'z'};
        char[] apellido2 = {'F', 'e', 'r', 'n', 'a', 'n', 'd', 'e', 'z'};
        
        System.out.println("Longitud del primer apellido: " + apellido1.length);
    }
    
    public static void dam() {
        String forma1 = new String("DAM");
        String forma2 = "D" + "A" + "M";
        
        System.out.println("Forma 1: " + forma1);
        System.out.println("Forma 2: " + forma2);
    }
    
    public static void literal() {
        String literal = "curso de DAM";
        int longitud = literal.length();
        System.out.println("Longitud del literal \"curso de DAM\": " + longitud);
    }
    
    public static void arrayString() {
        String[] palabras = {"Esta", "es", "la", "clase", "de", "POO"};
        String resultado = palabras[0] + palabras[2];
        System.out.println("Concatenacion de la primera y tercera palabra: " + resultado);
        
        String menor = palabras[0];
        String mayor = palabras[0];
        
        for (String palabra : palabras) {
            if (palabra.compareTo(menor) < 0) {
                menor = palabra;
            }
            
            if (palabra.compareTo(mayor) > 0) {
                mayor = palabra;
            }
        }
        
        System.out.println("Palabra menor: " + menor);
        System.out.println("Palabra mayor: " + mayor);
    }
    
    public static String buscaEspacios(String frase) {
        int espacios = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                espacios++;
            }
        }
        
        return "Frase sin espacios: " + frase.replace(" ", "") + "\nEl numero de espacios es: " + espacios;
    }
    
    public static void usoStringBuffer() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Introduce tu primer apellido: ");
        String apellido1 = scanner.nextLine();
        
        System.out.println("Introduce tu segundo apellido: ");
        String apellido2 = scanner.nextLine();
        
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(nombre);
        stringBuffer.append(" ");
        stringBuffer.append(apellido1);
        stringBuffer.append(" ");
        stringBuffer.append(apellido2);
        
        stringBuffer.delete(0, nombre.length() + 1);
        
        System.out.println("Resultado sin el nombre: " + stringBuffer.toString());
    }
}

package es.core.networks.dam.poo.examenTerceraEvaluacion.parte;

import java.util.Scanner;

public class ParteI {
    public static void cadenas() {
        char[] nombre = {'J', 'o', 'h', 'n'};
        char[] apellido1 = {'D', 'o', 'e'};
        char[] apellido2 = {'S', 'm', 'i', 't', 'h'};
        
        System.out.println("Longitud del primer apellido: " + apellido1.length);
    }
    
    public static void dam() {
        String palabra1 = new String("DAM");
        String palabra2 = "D" + "A" + "M";
        
        System.out.println("Palabra 1: " + palabra1);
        System.out.println("Palabra 2: " + palabra2);
    }
    
    public static void literal() {
        String texto = "curso de DAM";
        int longitud = texto.length();
        
        System.out.println("Longitud del literal: " + longitud);
    }
    
    public static void arrayString() {
        String[] palabras = {"Esta", "es", "la", "clase", "de", "POO"};
        String concatenacion = palabras[0] + palabras[2];

        String menor = palabras[0];
        String mayor = palabras[0];

        for (String palabra : palabras) {
            if (palabra.length() < menor.length()) menor = palabra;
            if (palabra.length() > mayor.length()) mayor = palabra;
        }

        System.out.println("Concatenación: " + concatenacion);
        System.out.println("Palabra menor: " + menor);
        System.out.println("Palabra mayor: " + mayor);
    }

    
    public static String buscaEspacios(String frase) {
        int contadorEspacios = 0;
        
        for (char c : frase.toCharArray()) {
            if (c == ' ') contadorEspacios++;
        }
        
        if (contadorEspacios == 0) {
            return "La frase no contiene espacios.";
        } else {
            return "La frase contiene " + contadorEspacios + " espacios.";
        }
    }

    
    public static void usoStringBuffer() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese su primer apellido: ");
        String apellido1 = scanner.nextLine();
        
        System.out.print("Ingrese su segundo apellido: ");
        String apellido2 = scanner.nextLine();
        
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(nombre).append(" ").append(apellido1).append(" ").append(apellido2);
        
        stringBuffer.delete(0, nombre.length() + 1);
        
        System.out.println("Resultado: " +stringBuffer.toString());
    }
    
    public static void main(String[] args) {
        cadenas();
        dam();
        literal();
        arrayString();
        String frase = "Esta es una frase de ejemplo";
        System.out.println(buscaEspacios(frase));
        usoStringBuffer();
    }
}



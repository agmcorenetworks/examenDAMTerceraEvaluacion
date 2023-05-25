package es.core.networks.dam.poo.examenTerceraEvaluacion.parte;

import java.util.Scanner;

public class ParteI {
	
	//método cadenas para crear tres arrays con mi nomnbre
	
    public static void cadenas() {
        char[] nombre = {'j', 'o', 's', 'e'};
        char[] primerApellido = {'g', 'o', 'n', 'z', 'a', 'l', 'e', 'z'};
        char[] segundoApellido = {'r', 'u', 'i', 'z'};

        System.out.println("Longitud del primer apellido: " + primerApellido.length);
    }

    // string de dam de dos formas distintas
    
    public static void dam() {
        String f1 = "DAM";
        String f2 = new String(new char[] {'D', 'A', 'M'});

        System.out.println("Forma 1: " + f1);
        System.out.println("Forma 2: " + f2);
    }

   // longitud del literal
    
    public static void literal() {
        String texto = "curso de DAM";
        int longitud = texto.length();

        System.out.println("Longitud del literal: " + longitud);
    }
    
    
    //arrayString de la clase de POO
    
    public static void arrayString() {
    	String frase = "Esta es la clase de POO";
        String[] palabras = frase.split(" ");

        String resultado = palabras[0] + palabras[2];
        System.out.println("Concatenación: " + resultado);

        String palabraMenor = palabras[0];
        String palabraMayor = palabras[0];

        for (int i = 1; i < palabras.length; i++) {
            if (palabras[i].compareTo(palabraMenor) < 0) {
                palabraMenor = palabras[i];
            }
            if (palabras[i].compareTo(palabraMayor) > 0) {
                palabraMayor = palabras[i];
            }
        }

        System.out.println("La palabra menor es: " + palabraMenor);
        System.out.println("La palabra mayor es: " + palabraMayor);
    }
    
    // buscar los espacios en blanco:
    
    public static void buscaEspacios(String frase) {
        int espacios = 0;
        StringBuilder fraseSinEspacios = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == ' ') {
                espacios++;
            } else {
                fraseSinEspacios.append(c);
            }
        }

        if (espacios > 0) {
            System.out.println("Mensaje sin espacios: " + fraseSinEspacios.toString());
            System.out.println("Cantidad de espacios: " + espacios);
        } else {
            System.out.println("La frase no tiene espacios.");
        }
    }
    
    //método stringBuffer
    
    public static void usoStringBuffer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dime tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Tu primer apellido: ");
        String apellido1 = scanner.nextLine();

        System.out.print("Y el segundo también: ");
        String apellido2 = scanner.nextLine();

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(nombre).append(" ").append(apellido1).append(" ").append(apellido2);

        stringBuffer.delete(0, nombre.length() + 1);

        System.out.println("Los apellidos son: " + stringBuffer.toString());
    }
    
    
    //main de pruebas
    
    public static void main(String[] args) {
        cadenas();
        dam();
        literal();
        arrayString();
        
        String s1 = "Frase de prueba.";
        String s2 = "Grasia por no hacernos abrir una caja fuerte";

        buscaEspacios(s2);
        buscaEspacios(s2);
        usoStringBuffer();
    }
    
    
}


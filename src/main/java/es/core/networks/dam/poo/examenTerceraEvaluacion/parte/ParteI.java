package es.core.networks.dam.poo.examenTerceraEvaluacion.parte;

import java.util.Arrays;
import java.util.Scanner;

public class ParteI {
	
	

    public static void cadenas() {
        // Crear las cadenas de caracteres
        char[] nombre = {'J', 'u', 'a', 'n'};
        char[] primerApellido = {'P', 'e', 'r','e','z'};
        char[] segundoApellido = {'B', 'e', 'l', 'l', 'i','n','f','a','n','t','e'};

        // Mostrar la longitud del primer apellido
        int longitudPrimerApellido = primerApellido.length;
        // String apellido1 = new String(primerApellido);
        // System.out.println("El primer apellido es: " + apellido1);
        System.out.println("Longitud del primer apellido: " + longitudPrimerApellido);
    }

    public static void dam() {
        // Forma 1: Crear un String directamente
        String forma1 = "DAM";

        // Forma 2: Crear un String utilizando un arreglo de char
        char[] letras = {'D', 'A', 'M'};
        String forma2 = new String(letras);

        // Mostrar los Strings por pantalla
        System.out.println("Forma 1: " + forma1);
        System.out.println("Forma 2: " + forma2);
    }
    
    public static void literal() {
        String cadena = "curso de DAM";
        int longitud = cadena.length();
        System.out.println("Longitud del literal: " + longitud);
    }
    
    public static void arrayString() {
        String frase = "Esta es la clase de POO";
        String[] palabras = frase.split(" ");

        // Concatenar el primer y tercer elemento del arreglo
        String concatenacion = palabras[0] + palabras[2];
        System.out.println("Concatenacion: " + concatenacion);


        // Ordenar alfabéticamente
        Arrays.sort(palabras);

        // Encontrar la palabra menor y la palabra mayor
        String menor = palabras[0];
        String mayor = palabras[palabras.length - 1];

        System.out.println("Palabra menor: " + menor);
        System.out.println("Palabra mayor: " + mayor);
    
    }
    
    public static void buscaEspacios(String frase) {
        int contadorEspacios = 0;
        StringBuilder mensajeSinEspacios = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter != ' ') {
                mensajeSinEspacios.append(caracter);
            } else {
                contadorEspacios++;
            }
        }

        System.out.println("Mensaje sin espacios: " + mensajeSinEspacios.toString());
        System.out.println("Numero de espacios: " + contadorEspacios);
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
        stringBuffer.append(nombre);
        stringBuffer.append(" ");
        stringBuffer.append(apellido1);
        stringBuffer.append(" ");
        stringBuffer.append(apellido2);

        System.out.println("StringBuffer base: " + stringBuffer.toString());

        stringBuffer.delete(0, nombre.length() + 1); // Eliminar el nombre y el espacio

        System.out.println("StringBuffer sin el nombre: " + stringBuffer.toString());

        scanner.close();
    }
    
    public static void main(String[] args) {
// -----------------------Ejercicio 1-----------------------------------
        cadenas();
// -----------------------Ejercicio 2-----------------------------------
        dam();
// -----------------------Ejercicio 3-----------------------------------
        literal();
// -----------------------Ejercicio 4-----------------------------------
        arrayString();
// -----------------------Ejercicio 5-----------------------------------
        String frase = "Aque voy a poner una frase cualquiera";
        buscaEspacios(frase); 
// -----------------------Ejercicio 6-----------------------------------
        usoStringBuffer();
    }
}

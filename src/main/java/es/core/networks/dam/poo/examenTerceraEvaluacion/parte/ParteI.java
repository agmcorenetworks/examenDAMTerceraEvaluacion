package es.core.networks.dam.poo.examenTerceraEvaluacion.parte;

import java.util.Scanner;

public class ParteI {
	
	// 1 - Metodo cadenas()
	public static void cadenas() {
		// Arrays tipo char
        char[] nombre = {'A', 'l', 'e', 'x'};
        char[] primerApellido = {'S', 'a', 'n', 'c', 'h', 'e', 'z'};
        char[] segundoApellido = {'C', 'a', 'b', 'a', 'l', 'l', 'e', 'r', 'o'};
        
        // Longitud del apellido que nos pide el ejercicio
        System.out.println("Longitud del Primer Apellido: " + primerApellido.length);
    }
	
	// 2 - Metodo dam()
	public static void dam() {
		// Definimos la cadena literalmente
        String dam1 = "DAM";
        
        // Tambien la podemos hacer con array de tipo char utilizando el constructor de la clase String que acepta array de caracteres
        String dam2 = new String(new char[] {'D', 'A', 'M'});
        
        // Las imprimimos por consola
        System.out.println("Forma 1: " + dam1);
        System.out.println("Forma 2: " + dam2);
    }
	
	
	// 3 - Metodo literal()
	public static void literal() {
        String frase = "curso de DAM";
        
        // Utilizamos el metodo .length() para comprobar la longitud y lo imprimimos por pantalla
        int longitud = frase.length();

        System.out.println("Longitud del literal: " + longitud);
    }
	
	
	
	// 4 - Metodo arrayString()
	public static void arrayString() {
        String frase = "Esta es la clase de POO";
        
        // Array de las palabras de la frase. Utilizamos .split para trocear la frase por la parte que deseamos en este caso " "
        String[] palabras = frase.split(" ");

        // Concatenar elementos primero y tercero buscandolos en el array de palabras en la posicion 0 y 2
        String concatenacion = palabras[0] + palabras[2];
        System.out.println("Concatenación: " + concatenacion);

        /*Encontrar la palabra menor y la mayor. Igualo las palabras a la de la posicion 0 del array de las 
        palabras para compararlas con las demas palabras del array*/
        
        String palabraMenor = palabras[0];
        String palabraMayor = palabras[0];

        //Utilizo el metodo compareTo para ver si es mayor o menor
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
	
	
	
	
	// 5- Metodo buscaEspacios(String frase)
	public static void buscaEspacios(String frase) {
        int contadorEspacios = 0;
        String fraseSinEspacios = "";

        /*Recorremos el parametro String con bucle for, sacando cada caracter y 
        comparandolo con una cadena de un espacio y vamos añadiendo cada caracter que no sea un espacio al String sin espacios*/
        
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter == ' ') {
                contadorEspacios++;
            } else {
                fraseSinEspacios += caracter;
            }
        }

        System.out.println("Frase sin espacios: " + fraseSinEspacios);
        System.out.println("Cantidad de espacios: " + contadorEspacios);
    }
	
	
	// 6- Metodo usoStringBuffer()
	public static void usoStringBuffer() {
        Scanner scanner = new Scanner(System.in);

        // Pido los nombres y los apellidos por consola
        System.out.println("Atencion! Si introduces numeros o cualquier caracter lo tomara como parte de tu nombre");
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su primer apellido: ");
        String apellido1 = scanner.nextLine();

        System.out.print("Ingrese su segundo apellido: ");
        String apellido2 = scanner.nextLine();

        // Creo un objeto StringBuffer() y concatenamos el nombre y los apellidos
        StringBuffer nombreCompleto = new StringBuffer();
        nombreCompleto.append(nombre).append(" ").append(apellido1).append(" ").append(apellido2);
        System.out.println("StringBuffer original: " + nombreCompleto);

        /*Elimino la palabra, la cual se encuentra en la posicion 0 del StringBuffer y termina en (la longitud del nombre) +1 para eliminar 
         el espacio entre nombre y el apellido
         */
        nombreCompleto.delete(0, nombre.length() + 1);
        System.out.println("StringBuffer después de eliminar el nombre: " + nombreCompleto);
    }
	
	// Comprobacion de los metodos en el Array
	public static void main(String[] args) {
		System.out.println("Metodo 1");
		cadenas();
		System.out.println("Metodo 2");
		dam();
		System.out.println("Metodo 3");
		literal();
		System.out.println("Metodo 4");
		arrayString();
		System.out.println("Metodo 5");
		buscaEspacios("Esta es una frase con 6 espacios");
		System.out.println("Metodo 6");
		usoStringBuffer();
		
	}

}
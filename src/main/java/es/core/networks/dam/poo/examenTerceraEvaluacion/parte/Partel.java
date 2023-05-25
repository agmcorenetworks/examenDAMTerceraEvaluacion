package es.core.networks.dam.poo.examenTerceraEvaluacion.parte;

import java.util.Scanner;

public class Partel {

	public static void cadenas() {
		String nombre = "Alejandro";
		String primerApellido = "Muñoz";
		String segundoApellido = "Dominguez";

		// Convertimos los apellidos a arrays de caracteres
		char[] ApellidoArray1 = primerApellido.toCharArray();
		char[] ApellidoArray2 = segundoApellido.toCharArray();

		// Mostramos la longitud del primer apellido
		int longitudPrimerApellido = ApellidoArray1.length;
		System.out.println("Longitud del primer apellido: " + longitudPrimerApellido);
	}

	public static void dam() {
		// Usando comillas simples
		String forma1 = "DAM";

		// Concatenamos caracteres
		String forma2 = String.valueOf('D') + 'A' + 'M';

		// Mostramos las dos formas por pantalla
		System.out.println("Forma 1: " + forma1);
		System.out.println("Forma 2: " + forma2);
	}

	public static void literal() {
		String texto = "curso de DAM";
		int longitudLiteral = texto.length();
		System.out.println("Longitud del literal 'curso de DAM': " + longitudLiteral);

	}

	public static void arrayString() {

		String texto = "Esta es la clase de POO";

		// Crear un array de Strings con las palabras de la frase
		String[] palabras = texto.split(" ");

		// Concatenar los elementos primero y tercero del array
		String concatenacion = palabras[0] + palabras[2];
		System.out.println("Resultado de la concatenación: " + " "+ concatenacion);

		// Encontrar la palabra menor y la mayor
		String palabraMenor = palabras[0];
		String palabraMayor = palabras[0];

		for (String palabra : palabras) {
			if (palabra.compareTo(palabraMenor) < 0) {
				palabraMenor = palabra;
			}

			if (palabra.compareTo(palabraMayor) > 0) {
				palabraMayor = palabra;
			}
		}

		System.out.println("Palabra menor: " + " "+ palabraMenor);
		System.out.println("Palabra mayor: " + " "+ palabraMayor);
	}
	
	
	public static void buscarEspacios(String f) {
		
		 int contadorEspacios = 0;
	        String mensajeSinEspacios = "";

	        for (int i = 0; i < f.length(); i++) {
	            char c = f.charAt(i);
	            if (c == ' ') {
	                contadorEspacios++;
	            } else {
	                mensajeSinEspacios += c;
	            }
	        }

	        System.out.println("Mensaje sin espacios: " + " " + mensajeSinEspacios);
	        System.out.println("Cantidad de espacios: " + " "+ contadorEspacios);
	    }

	
	public static void usoStringBuffer() {
		 Scanner sc = new Scanner(System.in);

	        // Pedir el nombre, primer apellido y segundo apellido por consola
	        System.out.print("Ingrese su nombre: ");
	        String nombre = sc.nextLine();

	        System.out.print("Ingrese su primer apellido: ");
	        String primerApellido = sc.nextLine();

	        System.out.print("Ingrese su segundo apellido: ");
	        String segundoApellido = sc.nextLine();

	        // Creamos un StringBuffer con la composición de todos los elementos
	        StringBuffer stringBuffer = new StringBuffer();
	        stringBuffer.append(nombre);
	        stringBuffer.append(" ");
	        stringBuffer.append(primerApellido);
	        stringBuffer.append(" ");
	        stringBuffer.append(segundoApellido);

	        // Eliminamos el nombre del StringBuffer
	        stringBuffer.delete(0, nombre.length() + 1); // +1 para eliminar también el espacio
	        
	        // Mostramos el resultado
	        System.out.println("Resultado: " + stringBuffer.toString());
	}
	
	public static void main(String[] args) {
		// Llamar al método cadenas()
        cadenas();

        // Llamar al método dam()
        dam();

        // Llamar al método literal()
        literal();

        // Llamar al método arrayString()
        arrayString();

        // Llamar al método buscaEspacios()
        String frase = "Esta es una frase con espacios";
        buscarEspacios(frase);

        // Llamar al método usoStringBuffer()
        usoStringBuffer();
	}
}

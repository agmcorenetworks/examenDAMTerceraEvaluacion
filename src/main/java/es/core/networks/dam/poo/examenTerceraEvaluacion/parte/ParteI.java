package es.core.networks.dam.poo.examenTerceraEvaluacion.parte;

import java.util.Scanner;

public class ParteI {

	public static void cadenas() {
		char[] nombre = { 'l', 'u', 'c', 'i', 'a', 'n', 'o' };
		char[] primerApellido = { 'o', 'c', 'h', 'o', 'a' };
		char[] segundoApellido = { 'a', 'l', 'v', 'a', 'r', 'e', 'z' };

		System.out.println("La longitud de primer apellido es: " + primerApellido.length);

	}

	public static void dam() {
		String palabra1 = "DAM";
		String palabra2 = new String("DAM");

		System.out.println("Creacion de String-Primera forma: " + palabra1);
		System.out.println("Creacion de String-Segunda forma: " + palabra2);

	}

	public static void literal() {
		String literal = "curso de DAM";
		int longitud = literal.length();
		System.out.println("La longitud del literal es: " + longitud);
	}

	public static void arrayString() {
		String palabraEntera = "Esta es la clase de POO";

		// separo la palabraEntera en palabras
		String[] palabra = palabraEntera.split(" ");
		// CONCATENO
		String concateno = palabra[0].concat(palabra[2]);
		System.out.println("La concatenacion es la siguiente: " + concateno);

		// COMPARACION
		String menor = palabra[0];
		String mayor = palabra[0];

		for (int i = 1; i < palabra.length; i++) {
			if (palabra[i].compareTo(menor) < 0) {
				menor = palabra[i];
			}

			if (palabra[i].compareTo(mayor) > 0) {
				mayor = palabra[i];
			}
		}
		System.out.println("La palabra menor es: " + palabra[0]);
		System.out.println("La palabra mayor es: " + palabra[1]);

	}
	
	public static void buscaEspacios(String frase) {
		int contador = 0;
        String mensaje = "";

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter != ' ') {
                mensaje += caracter;
            } else {
                contador++;
            }
        }

        String cantidadEspacios = "Cantidad de espacios: " + contador;
        System.out.println("Cantidad de espacios: " +  cantidadEspacios);
//        System.out.println(mensaje); probando
	}
	
	public static void usoStringBuffer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el primer apellido: ");
        String apellido1 = scanner.nextLine();

        System.out.println("Ingrese el segundo apellido: ");
        String apellido2 = scanner.nextLine();

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(nombre).append(" ").append(apellido1).append(" ").append(apellido2);

        System.out.println("StringBuffer: " + stringBuffer);

        stringBuffer.delete(0, nombre.length() + 1);

        System.out.println("StringBuffer eliminando el nombre: " + stringBuffer);
    }


	public static void main(String[] args) {
		
		ParteI p1 = new ParteI();
		cadenas();
		dam();
		literal();
		arrayString();
		buscaEspacios("Esto es una prueba para ver cuantos espacios hay");
		usoStringBuffer();

	}

}

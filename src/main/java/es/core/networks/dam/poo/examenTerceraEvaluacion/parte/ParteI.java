package es.core.networks.dam.poo.examenTerceraEvaluacion.parte;

import java.util.Scanner;

public class ParteI {

	public static void cadenas() {
		char[] nombre = {'p','a','b','l','o'};
		char[] apellido1 = {'b','i','r','u','k'};
		char[] apellido2 = {'a','b','a','d'};
		
		System.out.println(apellido1.length);
	}
	
	public static void dam() {
		String palabra = "DAM";
		String palabra2 = new String("DAM");
		
		System.out.println(palabra);
		System.out.println(palabra2);
	}
	
	public static void literal() {
		System.out.println("curso de DAM".length());
	}
	
	public static void arrayString() {
		String[] frase = {"Esta","es","la","clase","de","POO"};
		String concatenado = frase[0].concat(frase[2]);
		System.out.println(concatenado);
		String palabraMenor = "";
		String palabraMayor = frase[0];
		
		
		
		for (int i = 0 ; i<frase.length ; i++) {
			if (frase[i].compareTo(palabraMayor)<0) {
				palabraMayor = frase[i];
			}
			if (frase[i].compareTo(palabraMenor)>0) {
				palabraMenor = frase[i];
			}
		}
		
		System.out.println("Palabra Mayor: " + palabraMayor);
		System.out.println("Palabra Menor: " + palabraMenor);
		
	}
	
	public static void buscaEspacios(String frase) {
		int contador = 0;
		for (int i = 0;i<frase.length();i++) {
			if (frase.charAt(i)== ' ') {
				contador++;
			}
		}
		if (contador > 0 ) {
			System.out.println("La cadena introducida tiene " + contador + " espacios.");	
		} else {
			System.out.println("No se han encontrado espacios.");
		}	
	}
	
	public static void usoStringBuffer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca su nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Introduzca su primer apellido: ");
		String apellido1 = sc.nextLine();
		System.out.print("Introduzca su segundo apellido: ");
		String apellido2 = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(nombre + " " + apellido1 + " " + apellido2);
		sb = sb.delete(0, nombre.length());
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		cadenas();
		dam();
		literal();
		arrayString();
		buscaEspacios("Hola");
		usoStringBuffer();
	}
}

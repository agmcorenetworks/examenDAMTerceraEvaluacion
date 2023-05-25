package es.core.networks.dam.poo.examenTerceraEvaluacion.parte;

import java.util.Arrays;
import java.util.Scanner;

public class ParteI {
	//metodos
	//Ejercicio1
	public static void cadenas() {
		//variables
		char[] nombre = {'A','n','a'};
        char[] primerApellido = {'A','y','a','l','a'};
        char[] segundoApellido = {'H','e','r','n','a','n','d','e','z'};
        
        int longitudApellido = primerApellido.length;
        System.out.println("La longitud del apellido es: "+longitudApellido);
	}
	
	//Ejercicio2
	public static void dam() {
		//variables
        String palabra1 = "DAM";
        
        StringBuilder palabra2 = new StringBuilder();
        palabra2.append("DAM");
        
        System.out.println(palabra1);
        System.out.println(palabra2.toString());	
	}
	
	//Ejercicio3
	public static void literal() {
		//variables
		String literal = "Curso de DAM";
		int longitud = literal.length();
		
		System.out.println("Longitud literal: "+longitud);
		
	}
	
	//Ejercicio4
	
	public static void arrayString() {
		String enunciado = "Esta es la clase de POO";
		String [] palabras = enunciado.split(" ");
		
		String concatena = palabras[0] + palabras[2];
		System.out.println("Resultado: "+concatena);
		
		Arrays.sort(palabras);
		String palabraMenor = palabras[0];
		String palabraMayor = palabras[palabras.length-1];
		
		System.out.println("Palabra menor: "+palabraMenor);
		System.out.println("Palabra mayor: "+palabraMayor);
    }
	
	public static void buscaEspacios(String frase) {
		int contador = 0;
		
		for (int i = 0; i<frase.length();i++) {
			if (frase.charAt(i) == ' ') {
				contador = contador+1;
			}
		}
			
		String mensajeSinEspacios = frase.replace(" ", "");
		
		System.out.println("Mensaje: "+ mensajeSinEspacios);
		System.out.println("Numero de espacios: "+contador);
				
	}
	
	public static void usoStringBuffer() {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba su nombre:");
		String cadena1 = sc.nextLine();
		
		System.out.println("Escriba su primer apellido: ");
		String cadena2 = sc.nextLine();
		
		System.out.println("Escriba su segundo apellido: ");
		String cadena3 = sc.nextLine();
		
		StringBuffer composicion = new StringBuffer();
		composicion.append(cadena1).append(cadena2).append(cadena3);
		
		composicion.delete(0, cadena1.length());
		System.out.println(composicion.toString());

	}

	
	public static void main(String [] args) {
		cadenas();
		dam();
		literal();
		arrayString();
		buscaEspacios("Esta es una frase de prueba");
		usoStringBuffer();
	}
	
	

}

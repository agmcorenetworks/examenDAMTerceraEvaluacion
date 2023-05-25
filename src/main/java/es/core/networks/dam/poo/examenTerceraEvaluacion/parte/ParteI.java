package es.core.networks.dam.poo.examenTerceraEvaluacion.parte;

import java.util.Scanner;

public class ParteI {
	
	static void cadenas() {
		char nombre[] = {'p','e','d','r','o'};
  		char primerApellido[] = {'s','a','n','c','h','e','z'};
		char segundoApellido[] = {'p','e','r','e','z'};
		
		System.out.println(primerApellido.length);
		
	}
	
	static void dam() {
		
		String dam1 = "DAM";
		StringBuffer dam2 = new StringBuffer();
		
		System.out.println(dam1);
		System.out.println(dam2.append("DAM"));

	}
	
	static void literal() {
		String cadena = "curso de DAM";
		System.out.println(cadena.length());
	}
	
	static void arrayString() {
		String palabrasFrase[] = {"Esta","es","la","clase","de","POO"};
		System.out.println(palabrasFrase[0]+palabrasFrase[2]);
		
		String menor = palabrasFrase[0];
	    String mayor = palabrasFrase[0];
	    
	    for (String palabra : palabrasFrase) {
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
	
	static void buscaEspacios(String frase) {
		 int contadorEspacios = 0;
		 String fraseNueva = "";
		    for (int i = 0; i < frase.length(); i++) {
		        char caract = frase.charAt(i);
		        if (caract != ' ') {
		            fraseNueva=fraseNueva+caract;
		        } else {
		            contadorEspacios++;
		        }
		    }

		    System.out.println("Mensaje sin espacios: " + fraseNueva);
		    System.out.println("Cantidad de espacios: " + contadorEspacios); 
	}
	
	static void usoStringBuffer() {
		Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Nombre: ");
	    String nombre = sc.nextLine();
	    
	    System.out.print("Primer apellido: ");
	    String primerApellido = sc.nextLine();
	    
	    System.out.print("Segundo apellido: ");
	    String segundoApellido = sc.nextLine();
	    
	    StringBuffer nombreCompleto = new StringBuffer();
	    
	    nombreCompleto.append(nombre).append(" - ").append(primerApellido).append(" - ").append(segundoApellido);
	    
	    nombreCompleto.delete(0, nombre.length());
	    
	    System.out.println("Apellidos: " + nombreCompleto);
		
	}
	
	
}

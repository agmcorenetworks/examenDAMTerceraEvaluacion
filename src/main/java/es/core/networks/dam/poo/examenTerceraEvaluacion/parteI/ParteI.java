package es.core.networks.dam.poo.examenTerceraEvaluacion.parteI;

import java.util.Scanner;

public class ParteI {

	public static void cadenas() {
		char[] nombre = { 'M', 'i', 'g', 'u', 'e' };
		char[] apellido1 = { 'A', 'l', 'v', 'a', 'r', 'e', 'z' };
		char[] apellido2 = { 'R', 'e', 'i', 'n', 'a' };
		System.out.println("La longitud del primer apellido es " + apellido1.length);
	}

	public static void dam() {
		String s1 = "DAM";
		String s2 = new String("DAM");
		System.out.println("String 1: " + s1 + "\nString 2: " + s2);
	}

	public static void literal() {
		String s = "curso de DAM";
		System.out.println("La longitud del literal \"curso de DAM\" es " + s.length());
	}

	public static void arrayString() {
		String[] arr = { "Esta", "es", "la", "clase", "de", "POO" };
		String cadenaConcatenada = arr[0].concat(arr[2]);
		System.out.println("El primer y el tercer elemento del array concatenados es igual a : " + cadenaConcatenada);
		
		String palabraMayor = arr[0];
        String palabraMenor = arr[0];
        
		for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(palabraMayor) > 0) {
                palabraMayor = arr[i];
            }

            if (arr[i].compareTo(palabraMenor) < 0) {
                palabraMenor = arr[i];
            }
        }

        System.out.println("Palabra mayor: " + palabraMayor);
        System.out.println("Palabra menor: " + palabraMenor);
	}

	public static void buscaEspacios(String s) {
		String vacia = "";
		int contadorEspacios = 0;
		if (s.contains(" ")) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == ' ') {
					contadorEspacios += 1;
				} else
					vacia += s.charAt(i);
			}
			System.out.println("La cadena \"" + s + "\" tenia " + contadorEspacios + " espacios. Esta es la cadena sin espacios: \n" + vacia);
		} else {
			System.out.println("Tu cadena no tiene espacios.");
		}

	}
	
	public static void usoStringBuffer() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = sc.next();
		System.out.println("Dime tu primer apellido: ");
		String apellido1 = sc.next();
		System.out.println("Dime tu segundo apellido: ");
		String apellido2 = sc.next();
		sc.close();
		StringBuffer sb1 = new StringBuffer().append(nombre + " ").append(apellido1 + " ").append(apellido2 + " ");
		System.out.println("El StringBuffer con nombres y apellidos es " + sb1);
		sb1.delete(0, nombre.length() + 1);
		System.out.println("El StringBuffer despues de haber eliminado el nombre es " + sb1);
	}
	
	public static void main(String[] args) {
		cadenas();
		dam();
		literal();
		arrayString();
		buscaEspacios("H o l a q u e p a s a");
		usoStringBuffer();
	}

}

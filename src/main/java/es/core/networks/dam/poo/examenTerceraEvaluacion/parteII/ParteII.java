package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

import java.util.Hashtable;

public class ParteII {

	public static void matriz1() {
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();

		}
	}

	public static void invertirMatriz() {
		int[][] matrizInvertir = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int filas = matrizInvertir.length;
		int columnas = matrizInvertir[0].length;

		for (int j = 0; j < columnas; j++) {
			for (int i = 0; i < filas; i++) {
				System.out.print(matrizInvertir[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static Hashtable<String, Integer> getNumeroExtensiones() {
		String extraccionDatos = "hola.rm;usuarios.rm;test.txt;texto.rm;claves.rm;cosas.java;gatitos.rm;perritos.java;saludos.txt;"
				+ "adios.rm;fuego.txt;taza.java;java.txt;cuanto.txt;trece.java";

		Hashtable<String, Integer> extensiones = new Hashtable<String, Integer>();
		

		String[] ficheros = extraccionDatos.split(";");
		
	
		for (String fichero : ficheros) {
		
			String[] partes = fichero.split("\\.");
			if (partes.length == 2) {
				String extension = partes[1];
				if (extensiones.containsKey(extension)) {
					int cantidad = extensiones.get(extension);
					extensiones.put(extension, cantidad + 1);
				} else {
					extensiones.put(extension, 1);
				}
			}
		}

		return extensiones;
	}

	public static void main(String[] args) {
		matriz1();
		System.out.println("-----------");
		invertirMatriz();
		System.out.println(getNumeroExtensiones());
		
	}

}

package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ParteII {
	
	static int[][] matriz1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	
	static int[][] matriz2 = { { 2, 4, 8 }, { 1, 3, 7 }, { 3, 5, 9 } };

	static int[][] matriz3 = { { 1, 3, 5 }, { 2, 4, 6 }, { 3, 5, 7 } };

	static String datos = "hola.rm;usuarios.rm;test.txt;texto.rm;claves.rm;cosas.java;gatitos.rm;perritos.java;saludos.txt; adios.rm;fuego.txt;taza.java;java.txt;cuanto.txt;trece.java";

	public static void imprimeMatrices(int[][] matriz) {
		
		System.out.println("La matriz : \n");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nLa matriz del reves:\n");

		for (int j = 0; j < matriz[0].length; j++) {
			for (int i = 0; i < matriz.length; i++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void sumaMatrices(int[][] matriz1, int [][] matriz2) {

		int filas = Math.max(matriz1.length, matriz2.length);
		int columnas = Math.max(matriz1[0].length, matriz2[0].length);

		int[][] resultado = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				int valor1 = (i < matriz1.length && j < matriz1[i].length) ? matriz1[i][j] : 0;
				int valor2 = (i < matriz2.length && j < matriz2[i].length) ? matriz2[i][j] : 0;

				resultado[i][j] = valor1 + valor2;
			}
		}

		System.out.println("\nLa primera matriz a sumar es:\n");

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				System.out.print(matriz1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nLa segunda matriz a sumar es:\n");

		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nLa suma de las matrices es:\n");

		for (int i = 0; i < resultado.length; i++) {
			for (int j = 0; j < resultado[i].length; j++) {
				System.out.print(resultado[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("");
	}

	public static void getNumeroExtensiones(String d) {
		HashMap<String, Integer> extensiones = new HashMap<String, Integer>();

		String[] ficheros = d.split(";");

		for (String fichero : ficheros) {
			int puntoIndex = fichero.lastIndexOf('.');
			if (puntoIndex >= 0 && puntoIndex < fichero.length() - 1) {
				String extension = fichero.substring(puntoIndex + 1);

				if (extensiones.containsKey(extension)) {
					int cantidad = extensiones.get(extension);
					extensiones.put(extension, cantidad + 1);
				} else {
					extensiones.put(extension, 1);
				}
			}
		}

		Iterator<Map.Entry<String, Integer>> iterator = extensiones.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("Extension: " + key + ", Cantidad de ficheros con esta extension: " + value);
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		
		imprimeMatrices(matriz1);
		sumaMatrices(matriz2,matriz3);
		getNumeroExtensiones(datos);
		
		Circulo c1 = new Circulo(1);
		Circulo c2 = new Circulo(2);
		Circulo c3 = new Circulo(3);

		Cuadrado cu1 = new Cuadrado(1);
		Cuadrado cu2 = new Cuadrado(2);
		Cuadrado cu3 = new Cuadrado(3);

		Circulo[] arrayCirculos = { c1, c2, c3 };
		Cuadrado[] arrayCuadrados = { cu1, cu2, cu3 };
		FiguraGeometrica[] arrayFiguras = { c1, c2, c3, cu1, cu2, cu3 };
		Estadisticas[] arrayEstadisticas = { c1, c2, c3, cu1, cu2, cu3 };

		int numeroDeCirculo = 1;

		for (Circulo c : arrayCirculos) {
			System.out.println("El circulo " + numeroDeCirculo + " tiene un area de " + c.getArea()
					+ " y un perimetro de " + c.getPerimetro());
			numeroDeCirculo++;
		}
		
		System.out.println("");

		int numeroDeCuadrado = 1;

		for (Cuadrado c : arrayCuadrados) {
			System.out.println("El cuadrado " + numeroDeCuadrado + " tiene un area de " + c.getArea()
					+ " y un perimetro de " + c.getPerimetro());
			numeroDeCuadrado++;
		}
		
		System.out.println("");

		int numeroDeFigura = 1;

		for (FiguraGeometrica f : arrayFiguras) {
			String resultado = f instanceof Cuadrado
					? "La figura " + numeroDeFigura + " es un cuadrado. Tiene un area de " + f.getArea()
							+ " y un perimetro de " + f.getPerimetro()
					: "La figura " + numeroDeFigura + " es un circulo. Tiene un area de " + f.getArea()
							+ " y un perimetro de " + f.getPerimetro();
			System.out.println(resultado);
			numeroDeFigura++;
		}
		
		System.out.println("");
		
		int numeroDeEstadistica = 1;
		
		for (Estadisticas e : arrayEstadisticas) {
			String resultado = e instanceof Cuadrado
					? "La estadistica " + numeroDeEstadistica + " es un cuadrado. Tiene un area de " + e.getArea()
							+ " y un perimetro de " + e.getPerimetro()
					: "La estadistica " + numeroDeEstadistica + " es un circulo. Tiene un area de " + e.getArea()
							+ " y un perimetro de " + e.getPerimetro();
			System.out.println(resultado);
			numeroDeEstadistica++;
		}

	}

}

package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

import java.util.Enumeration;
import java.util.Hashtable;

public class ParteII {
	static String datos = "hola.rm;usuarios.rm;test.txt;texto.rm;claves.rm;cosas.java;gatitos.rm;perritos.java;saludos.txt;adios.rm;fuego.txt;taza.java;java.txt;cuanto.txt;trece.java";
	
	public static void pregunta1() {
		int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Matriz Dada");
		System.out.println("");
		for (int fila = 0 ; fila < matriz.length ; fila++) {
			for (int columna = 0 ; columna < matriz.length ; columna++) {
				System.out.print(matriz[fila][columna]);
				System.out.print(" ");
				
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Matriz Invertida");
		System.out.println("");
		for (int fila = 0 ; fila < matriz.length ; fila++) {
			for (int columna = 0 ; columna < matriz.length ; columna++) {
				System.out.print(matriz[columna][fila]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public static void pregunta2(int[][] matriz1 , int[][] matriz2) {
		int [][] resultado = new int[matriz1.length][matriz1.length];
		for (int fila = 0 ; fila < matriz1.length ; fila++) {
			for (int columna = 0 ; columna < matriz1.length ; columna++) {
				resultado[fila][columna] = matriz1[fila][columna] + matriz2[fila][columna];
			}
		}
		System.out.println("Resultado");
		System.out.println("");
		for (int fila = 0 ; fila < resultado.length ; fila++) {
			for (int columna = 0 ; columna < resultado.length ; columna++) {
				System.out.print(resultado[fila][columna]);
				System.out.print(" ");
				
			}
			System.out.println("");
		}
	}
	
	public static void getNumeroExtensiones(String datos) {
		Hashtable <String,Integer> ht = new Hashtable<String,Integer>();
		
		String[] ficheros = datos.split(";");
		for (int i = 0 ; i<ficheros.length ; i++) {
			String[] extensiones = ficheros[i].split("\\.");
			
			if (extensiones.length>1) {
				String extension = extensiones[1];	
				if(ht.containsKey(extension)) {
					ht.put(extension,(ht.get(extension)+1));
				} else {
					ht.put(extension, 1);
				}
			}
		}
		
		Enumeration<String> keys = ht.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Extension: " + key + ", Cantidad: " + ht.get(key));
        }
		
	}
	
	public static void main(String[] args) {
		int[][] matriz1 = {{2,4,8},{1,3,7},{3,5,9}};
		int[][] matriz2 = {{1,3,5},{2,4,6},{3,5,7}};
		pregunta1();
		pregunta2(matriz1,matriz2);
		getNumeroExtensiones(datos);
		
		Circulo c1 = new Circulo(10);
		Circulo c2 = new Circulo(20);
		Circulo c3 = new Circulo(30);
		Cuadrado cua1 = new Cuadrado(4);
		Cuadrado cua2 = new Cuadrado(8);
		Cuadrado cua3 = new Cuadrado(12);
		
		Circulo[] arrayCirculos = {c1,c2,c3};
		Cuadrado[] arrayCuadrados = {cua1,cua2,cua3};
		FiguraGeometrica[] arrayFigura = {c1,c2,c3,cua1,cua2,cua3};
		Estadisticas[] arrayEstadisticas = {c1,c2,c3,cua1,cua2,cua3};
		
		System.out.println("Circulos");
		for (int i = 0 ; i<arrayCirculos.length ; i++) {
			System.out.println("Area: " + arrayCirculos[i].getArea() + " Perimetro: " + arrayCirculos[i].getPerimetro());
		}
		
		System.out.println("Cuadrados");
		for (int i = 0 ; i<arrayCuadrados.length ; i++) {
			System.out.println("Area: " + arrayCuadrados[i].getArea() + " Perimetro: " + arrayCuadrados[i].getPerimetro());
		}
		
		System.out.println("Figuras Geometricas");
		for (int i = 0 ; i<arrayFigura.length ; i++) {
			System.out.println("Area: " + arrayFigura[i].getArea() + " Perimetro: " + arrayFigura[i].getPerimetro());
		}
		
		System.out.println("Estadisticas");
		for (int i = 0 ; i<arrayEstadisticas.length ; i++) {
			System.out.println("Area: " + arrayEstadisticas[i].getArea() + " Perimetro: " + arrayEstadisticas[i].getPerimetro());
		}
		
	}
	
}

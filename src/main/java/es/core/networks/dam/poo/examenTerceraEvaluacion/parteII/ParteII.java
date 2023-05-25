package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

import java.util.HashMap;

public class ParteII {
    private static int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    public static void main(String[] args) {
        // 1. Pintar la matriz original
        System.out.println("Matriz original:");
        pintarMatriz(matriz);
        // mostrar matriz invertida
        System.out.println("\nMatriz invertida:");
        pintarMatrizInvertida(matriz);

        // 2. Sumar dos matrices y mostrar el resultado
        int[][] matriz1 = {
                {2, 4, 8},
                {1, 3, 5},
                {3, 5, 9}
        };
        int[][] matriz2 = {
                {1, 3, 7},
                {2, 4, 6},
                {3, 5, 7}
        };
        System.out.println("\nSuma de matrices:");
        sumarMatrices(matriz1, matriz2);

        // 3. Obtener las extensiones y contar los ficheros
        String datos = "hola.rm;usuarios.rm;test.txt;texto.rm;claves.rm;cosas.java;gatitos.rm;perritos.java;saludos.txt;adios.rm;fuego.txt;taza.java;java.txt;cuanto.txt;trece.java";
        System.out.println("\nConteo de extensiones:");
        getNumeroExtensiones(datos);

        // 4. Crear objetos y calcular área y perímetro
        Circulo circulo1 = new Circulo(5);
        Circulo circulo2 = new Circulo(3);
        Circulo circulo3 = new Circulo(7);

        Cuadrado cuadrado1 = new Cuadrado(4);
        Cuadrado cuadrado2 = new Cuadrado(6);
        Cuadrado cuadrado3 = new Cuadrado(2);

        Circulo[] circulos = {circulo1, circulo2, circulo3};
        Cuadrado[] cuadrados = {cuadrado1, cuadrado2, cuadrado3};
        FiguraGeometrica[] figuras = {circulo1, circulo2, circulo3, cuadrado1, cuadrado2, cuadrado3};
        Estadisticas[] estadisticas = {circulo1, circulo2, circulo3, cuadrado1, cuadrado2, cuadrado3};

        System.out.println("\nCalculo de area y perimetro:");
        calcularAreaYPerimetro(circulos);
        calcularAreaYPerimetro(cuadrados);
        calcularAreaYPerimetro(figuras);
        calcularAreaYPerimetro(estadisticas);
    }

    // 1. Pintar matriz original
    public static void pintarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 1. Pintar matriz invertiendo filas por columnas
    public static void pintarMatrizInvertida(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }


    // 2. Sumar dos matrices
    public static void sumarMatrices(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            System.out.println("Las matrices no tienen las mismas dimensiones");
            return;
        }

        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        pintarMatriz(resultado);
    }

    // 3. Contar extensiones de ficheros
    public static void getNumeroExtensiones(String datos) {
        String[] ficheros = datos.split(";");
        HashMap<String, Integer> extensiones = new HashMap<>();

        for (String fichero : ficheros) {
            String[] partes = fichero.split("\\.");
            if (partes.length > 1) {
                String extension = partes[1];
                extensiones.put(extension, extensiones.getOrDefault(extension, 0) + 1);
            }
        }

        for (String extension : extensiones.keySet()) {
            int cantidad = extensiones.get(extension);
            System.out.println(extension + ": " + cantidad);
        }
    }

    // 4. Calcular área y perímetro de figuras
    public static void calcularAreaYPerimetro(Estadisticas[] figuras) {
        for (Estadisticas figura : figuras) {
            System.out.println(figura.getName());
            System.out.println("Area: " + figura.getArea());
            System.out.println("Perimetro: " + figura.getPerimetro());
            System.out.println();
        }
    }
}

interface Estadisticas {
    String getName();
    double getArea();
    double getPerimetro();
}


abstract class FiguraGeometrica implements Estadisticas {
    public abstract String getName();

    @Override
    public double getArea() {
        return 0.0;
    }

    @Override
    public double getPerimetro() {
        return 0.0;
    }
}

class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public String getName() {
        return "Circulo";
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }
}

class Cuadrado extends FiguraGeometrica {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public String getName() {
        return "Cuadrado";
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double getPerimetro() {
        return 4 * lado;
    }
}


package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

import java.util.HashMap;

public class ParteII {
    public static void pintarMatriz() {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Matriz original: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Matriz invertida:");
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }
    
    public static void sumarMatrices() {
        int[][] matriz1 = {
            {2, 4, 8},
            {1, 3, 7},
            {3, 5, 9}
        };
        
        int[][] matriz2 = {
            {1, 3, 5},
            {2, 4, 6},
            {3, 5, 7}
        };
        
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        
        int[][] resultado = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        System.out.println("Matriz resultante de la suma:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void getNumeroExtensiones() {
        String datos = "hola.rm;usuarios.rm;test.txt;texto.rm;claves.rm;cosas.java;gatitos.rm;perritos.java;saludos.txt;adios.rm;fuego.txt;taza.java;java.txt;cuanto.txt;trece.java";
        String[] ficheros = datos.split(";");
        
        HashMap<String, Integer> extensiones = new HashMap<>();
        
        for (String fichero : ficheros) {
            String[] partes = fichero.split("\\.");
            
            if (partes.length == 2) {
                String extension = partes[1];
                
                if (extensiones.containsKey(extension)) {
                    int contador = extensiones.get(extension);
                    extensiones.put(extension, contador + 1);
                } else {
                    extensiones.put(extension, 1);
                }
            }
        }
        
        System.out.println("Extensiones encontradas:");
        for (String extension : extensiones.keySet()) {
            int cantidad = extensiones.get(extension);
            System.out.println(extension + ": " + cantidad);
        }
    }
    
    interface Estadisticas {
        double getArea();
        double getPerimetro();
    }
    
    abstract static class FiguraGeometrica implements Estadisticas {
        public abstract String getName();
    }
    
    static class Circulo extends FiguraGeometrica {
        private double radio;
        
        public Circulo(double radio) {
            this.radio = radio;
        }
        
        @Override
        public double getArea() {
            return Math.PI * radio * radio;
        }
        
        @Override
        public double getPerimetro() {
            return 2 * Math.PI * radio;
        }
        
        @Override
        public String getName() {
            return "Circulo";
        }
    }
    
    static class Cuadrado extends FiguraGeometrica {
        private double lado;
        
        public Cuadrado(double lado) {
            this.lado = lado;
        }
        
        @Override
        public double getArea() {
            return lado * lado;
        }
        
        @Override
        public double getPerimetro() {
            return 4 * lado;
        }
        
        @Override
        public String getName() {
            return "Cuadrado";
        }
    }
    
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(3);
        Circulo circulo2 = new Circulo(5);
        Circulo circulo3 = new Circulo(2);
        
        Cuadrado cuadrado1 = new Cuadrado(4);
        Cuadrado cuadrado2 = new Cuadrado(2);
        Cuadrado cuadrado3 = new Cuadrado(6);
        
        Circulo[] circulos = {circulo1, circulo2, circulo3};
        Cuadrado[] cuadrados = {cuadrado1, cuadrado2, cuadrado3};
        
        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = circulo1;
        figuras[1] = circulo2;
        figuras[2] = circulo3;
        figuras[3] = cuadrado1;
        figuras[4] = cuadrado2;
        figuras[5] = cuadrado3;
        
        Estadisticas[] estadisticas = new Estadisticas[6];
        estadisticas[0] = circulo1;
        estadisticas[1] = circulo2;
        estadisticas[2] = circulo3;
        estadisticas[3] = cuadrado1;
        estadisticas[4] = cuadrado2;
        estadisticas[5] = cuadrado3;
        
        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.getName());
            System.out.println("Area: " + figura.getArea());
            System.out.println("Perimetro: " + figura.getPerimetro());
            System.out.println();
        }
        
        for (Estadisticas figura : estadisticas) {
            System.out.println(figura.getClass().getSimpleName());
            System.out.println("Area: " + figura.getArea());
            System.out.println("Perimetro: " + figura.getPerimetro());
            System.out.println();
        }
    }
}

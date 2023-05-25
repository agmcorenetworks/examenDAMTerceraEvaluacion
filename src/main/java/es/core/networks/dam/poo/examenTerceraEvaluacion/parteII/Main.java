package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class Main {
	 public static void main(String[] args) {
	        Circulo circulo1 = new Circulo(5.0);
	        Circulo circulo2 = new Circulo(7.5);
	        Circulo circulo3 = new Circulo(3.2);

	        Cuadrado cuadrado1 = new Cuadrado(4.0);
	        Cuadrado cuadrado2 = new Cuadrado(6.0);
	        Cuadrado cuadrado3 = new Cuadrado(2.5);

	        Circulo[] circulos = {circulo1, circulo2, circulo3};
	        Cuadrado[] cuadrados = {cuadrado1, cuadrado2, cuadrado3};

	        FiguraGeometrica[] figuras = {circulo1, circulo2, circulo3, cuadrado1, cuadrado2, cuadrado3};

	        Estadisticas[] estadisticas = {circulo1, circulo2, circulo3, cuadrado1, cuadrado2, cuadrado3};

	        for (Circulo circulo : circulos) {
	            System.out.println("Area del circulo: " + circulo.getArea());
	            System.out.println("Perimetro del circulo: " + circulo.getPerimetro());
	        }

	        for (Cuadrado cuadrado : cuadrados) {
	            System.out.println("Area del cuadrado: " + cuadrado.getArea());
	            System.out.println("Perimetro del cuadrado: " + cuadrado.getPerimetro());
	        }

	        for (FiguraGeometrica figura : figuras) {
	            System.out.println("Nombre de la figura: " + figura.getName());
	            System.out.println("Area de la figura: " + figura.getArea());
	            System.out.println("Perimetro de la figura: " + figura.getPerimetro());
	        }

	        for (Estadisticas estadistica : estadisticas) {
	            System.out.println("Area de la figura: " + estadistica.getArea());
	            System.out.println("Perimetro de la figura: " + estadistica.getPerimetro());
	        }
	    }
}

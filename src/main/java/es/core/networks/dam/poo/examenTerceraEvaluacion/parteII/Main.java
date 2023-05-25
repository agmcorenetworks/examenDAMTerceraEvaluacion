package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class Main {

	public static void main(String[] args) {
		
        // 3 objetos de Circulo
        Circulo circulo1 = new Circulo(5.0);
        Circulo circulo2 = new Circulo(3.0);
        Circulo circulo3 = new Circulo(7.0);

        // 3 objetos de Cuadrado
        Cuadrado cuadrado1 = new Cuadrado(4.0);
        Cuadrado cuadrado2 = new Cuadrado(2.0);
        Cuadrado cuadrado3 = new Cuadrado(6.0);

        // array de Circulo e insertar los circulos
        Circulo[] circulos = {circulo1, circulo2, circulo3};

        // array de Cuadrado e insertar los cuadrados
        Cuadrado[] cuadrados = {cuadrado1, cuadrado2, cuadrado3};

        // array de FiguraGeometrica e insertar todos los objetos
        FiguraGeometrica[] figuras = {circulo1, circulo2, circulo3, cuadrado1, cuadrado2, cuadrado3};

        // array de Estadisticas e insertar todos los objetos
        Estadisticas[] estadisticas = {circulo1, circulo2, circulo3, cuadrado1, cuadrado2, cuadrado3};

        // Recorrer todos los arrays y llamar a los métodos getArea y getPerimetro
        for (FiguraGeometrica figura : figuras) {
            System.out.println("Nombre: " + figura.getName());
            System.out.println("Area: " + figura.getArea());
            System.out.println("Perimetro: " + figura.getPerimetro());
            System.out.println();
        }
    }
}

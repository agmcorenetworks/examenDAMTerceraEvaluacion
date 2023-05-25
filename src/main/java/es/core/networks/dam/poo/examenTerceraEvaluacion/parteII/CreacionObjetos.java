package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class CreacionObjetos {

	public static void main(String[] args) {

		// crear 3 objetos tipo circulo y 3 de tipo cuadrado
		Circulo c1 = new Circulo(3);
		Circulo c2 = new Circulo(5);
		Circulo c3 = new Circulo(8);

		Cuadrado cuad1 = new Cuadrado(5);
		Cuadrado cuad2 = new Cuadrado(10);
		Cuadrado cuad3 = new Cuadrado(3);

		// crear un array de tipo circulo e insertar los circulos
		Circulo[] circuloArray = { c1, c2, c3 };

		// crear un array de tipo cuadrado e insertar los cuadrado
		Cuadrado[] cuadradoArray = { cuad1, cuad2, cuad3 };

		// crear un array de tipo FiguraGeometrica e insertar todos los objetos
		FiguraGeometrica[] figArray = { c1, c2, c3, cuad1, cuad2, cuad3 };

		// crear un array de tipo Estadisticas e insertar todos los objetos
		Estadisticas[] estaArray = { c1, c2, c3, cuad1, cuad2, cuad3 };

		// recorrer todos los arrays llamando al método calcularArea y calcularPerimetro
		//Recorriendo el array de figuras
		for (FiguraGeometrica figura : figArray) {
			System.out.println("area: " + figura.getArea());
			System.out.println("Perimetro: " + figura.getPerimetro());
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		//recorriendo el array de estadisticas
		  for (Estadisticas estadistica : estaArray) {
	            System.out.println("area: " + estadistica.getArea());
	            System.out.println("Perimetro: " + estadistica.getPerimetro());
	            System.out.println();
	        }
	}

}

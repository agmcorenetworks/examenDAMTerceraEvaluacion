package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class ArrayFiguras {
	
	
	//NOTA. He ido haciendo los métodos según leía en el enunciado, por lo que he creado clases distintas para círculo y cuadrado. Cuadno llegué al de meter las figuras de uno y de otro no sabía muy bien donde ponerlo así que lo he metido en una clase nueva (esta) donde he pegado el código de ambas clases anteriores además de crear el array para ambas. Clean Code mal.
	
	public static void main(String[] args) {
        Circulo cir1 = new Circulo(13.2);
        Circulo cir2 = new Circulo(7.6);
        Circulo cir3 = new Circulo(10.2);

        Cuadrado cua1 = new Cuadrado(4.18);
        Cuadrado cua2 = new Cuadrado(6.7);
        Cuadrado cua3 = new Cuadrado(20.6);

        Circulo[] circulos = {cir1, cir2, cir3};
        Cuadrado[] cuadrados = {cua1, cua2, cua3};

        FiguraGeometrica[] figuras = {cir1, cir2, cir3, cua1, cua2, cua3};

        Estadisticas[] estadisticas = {cir1, cir2, cir3, cua1, cua2, cua3};

        for (Circulo circulo : circulos) {
            System.out.println("Área del círculo: " + circulo.getArea());
            System.out.println("Perímetro del círculo: " + circulo.getPerimetro());
        }

        for (Cuadrado cuadrado : cuadrados) {
            System.out.println("Área del cuadrado: " + cuadrado.getArea());
            System.out.println("Perímetro del cuadrado: " + cuadrado.getPerimetro());
        }

        for (FiguraGeometrica figura : figuras) {
            System.out.println("Área de la figura: " + figura.getArea());
            System.out.println("Perímetro de la figura: " + figura.getPerimetro());
        }

        for (Estadisticas estadistica : estadisticas) {
            System.out.println("Área de la figura: " + estadistica.getArea());
            System.out.println("Perímetro de la figura: " + estadistica.getPerimetro());
        }
    }
	}



package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class Circulo extends FiguraGeometrica {
	
	private double radio;
	private final double PI = 3.14;
	
	//constructor	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	//SOBREESCRIBO METODO PADRE
	
	@Override
	 public String getName() {
        return "Es un Círculo";
    }

	public double getArea() {
		return PI * (this.radio * this.radio); 

	}

	public double getPerimetro() {
		return 2 * PI * radio;
	}

}

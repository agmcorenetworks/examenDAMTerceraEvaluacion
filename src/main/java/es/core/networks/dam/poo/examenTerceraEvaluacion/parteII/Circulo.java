package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class Circulo extends FiguraGeometrica {
	double radio;

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * (radio*radio);
	}

	@Override
	public double getPerimetro() {
		return  2 * Math.PI * radio;
	}

	@Override
	public String getName() {
		return "El Circulo";
	}
	
	public Circulo(double radio) {
		this.radio = radio;
	}
}

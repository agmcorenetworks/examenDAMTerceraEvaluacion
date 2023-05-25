package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class Circulo extends FiguraGeometrica {
	
	double radio;
	
	public Circulo (int radio) {
		this.radio = radio;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radio * radio;
	}
	
	@Override
	public double getPerimetro () {
		return Math.PI * radio * 2;
	}
	
	@Override
	public String getName() {
		return "Esto es un circulo de radio " + radio;
	}
	
}

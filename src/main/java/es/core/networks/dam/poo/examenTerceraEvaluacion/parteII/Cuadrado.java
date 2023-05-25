package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class Cuadrado extends FiguraGeometrica {

	int lado;

	public Cuadrado (int lado) {
		this.lado = lado;
	}
	
	@Override
	public double getArea() {
		return lado * lado;
	}

	@Override
	public double getPerimetro() {
		return lado * 4;
	}
	
	@Override
	public String getName() {
		return "Esto es un cuadrado de lados " + lado;
	}
}

package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class Cuadrado extends FiguraGeometrica {
	double lado;
	@Override
	public double getArea() {
		
		return lado * lado;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return lado * 4;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "El Cuadrado";
	}
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
}

package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class Cuadrado  extends FiguraGeometrica {
	double lado;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Es la clase cuadrado";
	}
	Cuadrado(double lado){
		this.lado=lado;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}
	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return lado*4;
	}

}

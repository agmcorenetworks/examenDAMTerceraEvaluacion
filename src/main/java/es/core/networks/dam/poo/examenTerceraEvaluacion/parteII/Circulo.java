package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class Circulo extends FiguraGeometrica{
	private double radio;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Es la clase circulo";
	}
	Circulo(double radio){
		this.radio=radio;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.1416*(radio*radio);
	}
	
	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*3.1416*radio;
	}


}

package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

class Cuadrado extends FiguraGeometrica {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double getPerimetro() {
        return 4 * lado;
    }

    @Override
    public String getname() {
        return "Cuadrado";
    }
    
    public static void main(String[] args) {
    	
    	//Creamos cuadrados
    	
    	Cuadrado cua1 = new Cuadrado(4.18);
    	Cuadrado cua2 = new Cuadrado(6.7);
    	Cuadrado cua3 = new Cuadrado(20.6);
    	
    	//y los arrays
    	
    	Cuadrado[] cuadrados = new Cuadrado[3];
    	cuadrados[0] = new Cuadrado(4.18);
    	cuadrados[1] = new Cuadrado(6.7);
    	cuadrados[2] = new Cuadrado(20.6);

    	
    	
    	
	}
}
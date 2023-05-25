package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String getname() {
        return "Círculo";
    }
    


    
    public static void main(String[] args) {
    	
    	//creamos circulos
    	
    	Circulo cir1 = new Circulo(13.2);
        Circulo cir2 = new Circulo(7.6);
        Circulo cir3 = new Circulo(10.2);
		
        
        // y los arrays
        
        Circulo[] circulos = new Circulo[3];
        circulos[0] = new Circulo(13.2);
        circulos[1] = new Circulo(7.6);
        circulos[2] = new Circulo(10.2);

	}
    
    
}
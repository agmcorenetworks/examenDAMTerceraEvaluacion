package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class parteII {
static int [][] matriz={ {1,2,3},{4,5,6},{7,8,9} };
static String datos="hola.rm;usuarios.rm;test.txt;texto.rm;claves.rm;cosas.java;gatitos.rm;perritos.java;saludos.txt;adios.rm;fuego.txt;taza.java;java.txt;cuanto.txt;trece.java";

	static void sumarMatrices(int[][]m1,int[][]m2) {
//	int[][] m3= new int[m1.length][m1[0].length];
	for (int i=0;i<m1.length;i++) {
		for (int j=0;j<m1[i].length;j++) {
			System.out.print(m1[i][j]+m2[i][j]+ " "); 
		}
		System.out.println("");
	}
}

	void getNumeroExtensiones(String fichero){
	
}

public static void main(String[] args) {

	//printear matriz
	for (int i=0;i<matriz.length;i++) {
		for (int j=0;j<matriz[i].length;j++) {
			System.out.print(matriz[i][j]+ " ");
		}
		System.out.println("");
	}
	
	//espacio
	System.out.println("");
	
	//invertida
	for (int i=0;i<matriz.length;i++) {
		for (int j=0;j<matriz[i].length;j++) {
			System.out.print(matriz[j][i]+ " ");
		}
		System.out.println("");
	}
	
	//espacio
	System.out.println("");
	
	//sumar
	int [][] m1={ {2,4,8},{1,3,7},{3,5,9} };
	int [][] m2={ {1,3,5},{2,4,6},{3,5,7} };
	sumarMatrices(m1, m2);
	
	//espacio
	System.out.println("");
	
	//ejercicio 3 
	
	//espacio
	System.out.println("");
	
	//ejercicio 4
	Cuadrado cu1= new Cuadrado(1);
	Cuadrado cu2= new Cuadrado(2);
	Cuadrado cu3= new Cuadrado(3);
	Circulo ci1= new Circulo(1);
	Circulo ci2= new Circulo(2);
	Circulo ci3= new Circulo(3);
	Circulo[] aci1 = {ci1,ci2,ci3};
	Cuadrado[] acu1 = {cu1,cu2,cu3};
	FiguraGeometrica[] fg1= {cu1,cu2,cu3,ci1,ci2,ci3};
	Estadisticas[] e1= {cu1,cu2,cu3,ci1,ci2,ci3};
	//ARRAY CIRCULO
	for (int i=0;i<aci1.length;i++) {
		System.out.println(aci1[i].getArea());
		System.out.println(aci1[i].getPerimetro());
	}
	//espacio
	System.out.println("");

	//ARRAY CUADRADO
	for (int i=0;i<acu1.length;i++) {
		System.out.println(acu1[i].getArea());
		System.out.println(acu1[i].getPerimetro());
	}
	
	//espacio
	System.out.println("");
	
	//ARRAY FIGURAGEOMETRICA
	for (int i=0;i<fg1.length;i++) {
		System.out.println(fg1[i].getArea());
		System.out.println(fg1[i].getPerimetro());
	}

	//espacio
	System.out.println("");
	
	//ARRAY ESTADISTICAS
	for (int i=0;i<e1.length;i++) {
		System.out.println(e1[i].getArea());
		System.out.println(e1[i].getPerimetro());
	}
	
	
}
}

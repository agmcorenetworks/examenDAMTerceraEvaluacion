package es.core.networks.dam.poo.examenTerceraEvaluacion.parte;

import java.util.Scanner;

public class parteI {
 static void cadena() {
	char nombre[]= {'d','a','n','i'};
	char apellido1[]= {'o','s','a'};
	char apellido2[]= {'g','u','z','m','a','n'};
	
	System.out.println(apellido1.length);
 }
 static void dam() {
	 String DAM1= "DAM";
	 StringBuffer DAM2 = new StringBuffer();
	 DAM2.append("DAM");
	 
	 System.out.println(DAM1);
	 System.out.println(DAM2);	 
 }
 static int literal() {
	 return "curso de DAM".length();
 }
 static void arrayString() {
	 String[] s1= {"Esta","es","la","clase","de","POO"};
	 System.out.println(s1[0]+s1[2]);
	 
	 String mayor=s1[0];
	 String menor=s1[0];
	 for(int i=0; i<s1.length;i++) {
		 if(s1[i].compareTo(mayor)<0) {
			 mayor=s1[i];
		 }
		 if(s1[i].compareTo(menor)>0) {
			 menor=s1[i];
		 }
	 }
	System.out.println("Mayor "+mayor+" y menor "+menor);
 }
static void buscaEspacios(String frase){
	 String fraseSinEsp="";
	 int contador=0;
	 for (int i = 0; i < frase.length(); i++) {
         char caracter = frase.charAt(i);
         if (caracter != ' ') {
             fraseSinEsp=fraseSinEsp+caracter;
         } else {
             contador++;
         }
     }
	 System.out.println("Frase sin espacios: "+fraseSinEsp);
	 System.out.println("Cantidad de espacios: "+contador);
 }
static void usoStringBuffer(){
	System.out.println("Dime tu nombre: ");
	Scanner sc1= new Scanner(System.in);
	String nombre = sc1.nextLine();
	System.out.println("Dime tu primer apellido: ");
	Scanner sc2= new Scanner(System.in);
	String apellido1 = sc2.nextLine();
	System.out.println("Dime tu segundo apellido: ");
	Scanner sc3= new Scanner(System.in);
	String apellido2 = sc3.nextLine();
	//System.out.println(nombre+ " "+apellido1 +" "+ apellido2);
	StringBuffer sb1 = new StringBuffer(nombre+", "+apellido1+", "+apellido2);
	System.out.println(sb1);
	System.out.println(sb1.delete(0, nombre.length()));
}

 public static void main(String[] args) {
	cadena();
	dam();
	System.out.println(literal());
	arrayString();
	buscaEspacios("me repites ese numerin");
	usoStringBuffer();
	
}
}

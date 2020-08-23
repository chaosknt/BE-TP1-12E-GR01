package ar.edu.ort.tp1.ej04;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner(System.in); 

	public static void main(String[] args) {
		AnioV2 a = new AnioV2();
		
		int numMes = ingresarFecha("Ingrese un Mes del año");
		System.out.println("Ingresó "+a.getNombreDelMes(numMes));
		System.out.println("Dias transcurridos antes de "+a.getNombreDelMes(numMes)+" :"+a.diasTranscurridos(numMes));
		
		int [] cumples = new int[4];
		for(int i=0; i < cumples.length; i++){
			int dia = ingresarFecha("Ingrese día de cumpleaños");
			int mes = ingresarFecha("Ingrese mes de cumpleaños");
			cumples[i] = a.calcularDiasTranscurridos(dia, mes);
		}
		
		for(int i=0; i < cumples.length; i++){
			System.out.println(cumples[i]);
		}
	}

	private static int ingresarFecha(String mens) {
		int num;
		do{
			System.out.println(mens);
			num = Integer.parseInt(input.nextLine());
		}while(num<0);
		return num;
	}

}

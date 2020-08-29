package ar.edu.ort.tp1.ej04yej05;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner(System.in); 

	public static void main(String[] args) {
		AnioV2 a = new AnioV2();
		
		int numMes = ingresarFecha("Ingrese un Mes del a�o");
		System.out.println("Ingres� "+a.getNombreDelMes(numMes));
		System.out.println("Dias transcurridos antes de "+a.getNombreDelMes(numMes)+" :"+a.diasTranscurridos(numMes));
		
		System.out.println("Ingresar fecha actual");
		
		int dia = ingresarFecha("Ingrese d�a");
		int mes = ingresarFecha("Ingrese mes");
		System.out.println("dias transcurrridos desde el comienzo hasta la fecha ingresada: " + a.calcularDiasTranscurridos(dia, mes));
		
		System.out.println("El cumplea�os de Pagani es el dia " + a.calcularDiasTranscurridos(21, 8) + " del a�o");
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

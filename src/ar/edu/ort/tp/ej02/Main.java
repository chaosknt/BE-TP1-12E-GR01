package ar.edu.ort.tp.ej02;

import java.util.Scanner;

public class Main {
	
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		Competencia comp1 = null;
		
	int menu;
	
	do 
	{
		menu = menu();			
		switch(menu) 
		{
			case 1: comp1 = crearCompetencia();
				 menu = 0;
				break;
			
			case 2:ingresarDatos(comp1);
				break;
			
			case 3:calcularGanador(comp1);
				   mostrarGanador(comp1);	
				break;		
		}
		
	}while(menu != 4);			
	
	System.out.println("Programa terminado");
						
	}
	
	public static int menu() 
	{
		int numero = 0;
		
		while(numero < 1 || numero > 4)
		{
		System.out.println("1.-Crear competencia, 2.- Ingresar Nombre/tiempo de los participantes, 3.- Calcular Ganador, 4.- Salir");
		 numero = Integer.parseInt(in.nextLine());
		}
		return numero;
	}
	
	public static Competencia crearCompetencia() 
	{
		System.out.println("Ingrese el nombre de la competencia");
		String nombre = in.nextLine();
		
		System.out.println("Ingrese la cantidad de participantes");
		int participantes = Integer.parseInt(in.nextLine());
		
		Competencia comp1 = new Competencia(nombre, participantes);
		
		return comp1;				
	}
	
	public static void ingresarDatos(Competencia comp1)
	{
		if(comp1 == null) 
		{
			System.out.println("No se ha creado la competencia todavia...");
		}else
		{
		comp1.setDatos();
		}
						
	}
	
	public static void calcularGanador (Competencia comp1)
	{
		comp1.calcularGanador();
	}
	
	public static void mostrarGanador(Competencia comp1) 
	{
		comp1.mostrarGanador();
	}

}

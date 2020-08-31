package ar.edu.ort.tp1.ej02yej03;

import java.util.Scanner;

public class Main {	
	
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	Competencia comp1 =  new Competencia ("carrera");
	
	comp1.setDatos("Mariano", 1.1f);
	comp1.setDatos("Sofia", 1.2f);
	comp1.setDatos("Patricio", 1.3f);
	comp1.setDatos("Jorge", 3.1f);
	comp1.setDatos("Lucas", 1.1f);
	comp1.setDatos("Dario", 2);
	comp1.setDatos("Carlos", 4);	
	comp1.setDatos("Fulano", 0.5f);
	
	comp1.mostrarParticipantes();
	System.out.println("--------------------");	
	
	System.out.println("Mostrando ganador(ejercico 2)");
	comp1.mostrarGanadorUnico();
	System.out.println("--------------------");		
	
	System.out.println("Mostrando terna ganadores (ejercico 3)");
	comp1.mostrarGanador();					
	
	in.close();
						
}	
	
	public static Competencia crearCompetencia() 
	{
		System.out.println("Ingrese el nombre de la competencia");
		String nombre = in.nextLine();						
		Competencia comp1 = new Competencia(nombre);		
		return comp1;				
	}
	
	public static void ingresarDatos(Competencia comp1)
	{
		if(comp1 == null) 
		{
			System.out.println("No se ha creado la competencia todavia...");
		}else
		{
			int exit;
			do
			{
				crearParticipante(comp1);
				System.out.println("Desea agregar otro? [1] = Si | [2] = No");
				exit = validarNumero("Error, las opciones son 1 o 2", 1, 2);
				
			}while(exit == 1);
			
		}
						
	}
	
	public static void crearParticipante(Competencia comp1) 
	{
		
		String nombre = null;
		float tiempo = 0;
		System.out.println("Ingresar Nombre");
		nombre = in.nextLine();
		System.out.println("Ingresar Tiempo");
		tiempo = Float.parseFloat(in.nextLine());
		
		comp1.setDatos(nombre, tiempo);
		
	}
	
	public static int validarNumero(String mensaje, int desde, int hasta) 
	{
		int retorno = Integer.parseInt(in.nextLine());
		while(retorno < desde || retorno > hasta) 
		{
			System.out.println(mensaje);
			retorno = Integer.parseInt(in.nextLine());
		}
		
		return retorno;		
	}
	
	public static void calcularGanador (Competencia comp1)
	{
		comp1.mostrarGanador();
	}
	
	

}

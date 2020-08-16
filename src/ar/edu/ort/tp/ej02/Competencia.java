package ar.edu.ort.tp.ej02;

import java.util.Scanner;

public class Competencia {
	
	public static Scanner in = new Scanner(System.in);
	
	private String nombre;
	private float [] tiempos;
	private String [] participantes;
	
	public Competencia(String nombre, int cantidad) 
	{
		this.nombre = nombre;
		participantes = new String [cantidad];
		this.tiempos = new float [cantidad];
		
	}
	
	public void setDatos() 
	{
		for(int i = 0; i < participantes.length; i++)
		{
			System.out.println("Ingrese los datos del participante: " + i);
			System.out.println("Ingrese el nombre del participante");
			participantes[i] = nombre();
			System.out.println("Ingrese el tiempo");
			tiempos[i] = tiempo(); 
		}
	}
	
	public void mostrar()
	{
		for(int i = 0; i < participantes.length; i++)
		{
			System.out.println("Nombre: " + participantes[i] + " Tiempo: " + tiempos[i]);
		}
	}
	
	private String nombre() 
	{		
		return in.nextLine();
	}
	
	private float tiempo() 
	{
		return in.nextFloat();
	}
		
}

package ar.edu.ort.tp.ej02;

import java.util.ArrayList;
import java.util.Scanner;

public class Competencia {
	
	public static Scanner in = new Scanner(System.in);
	
	private String nombre;
	private float [] tiempos;
	private String [] participantes;
	private ArrayList<Ganador> ganador;
	
	public Competencia(String nombre, int cantidad) 
	{
		this.nombre = nombre;
		participantes = new String [cantidad];
		this.tiempos = new float [cantidad];
		ganador = new ArrayList<Ganador>();		
		
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
	
	public void mostrarParticipantes()
	{
		System.out.println("Nombre | Tiempo");
		for(int i = 0; i < participantes.length; i++)
		{
			System.out.println(participantes[i] + " | " + tiempos[i]);
		}
	}
	
	public void calcularGanador() 
	{
		float aux = Float.MAX_VALUE;			
		for(int i = 0; i < tiempos.length; i++) 
		{
			if(tiempos[i] < aux)
			{
				aux = tiempos[i];
				ganador.clear();
				ganador.add(new Ganador(participantes[i], tiempos[i]));
			}else if(tiempos[i] == aux) 
			{
				ganador.add(new Ganador(participantes[i], tiempos[i]));
			}
			
		}
				
	}
	
	public void mostrarGanador() 
	{	
		if(ganador.size() > 1)
		{
			System.out.println("Hubo empate en el primer puesto");
		}
		recorrerLista();
	}
	
	private void recorrerLista()
	{
		for(Ganador g : ganador) 
		{
			System.out.println(g.toString());
		}
	}
	
	private String nombre() 
	{		
		return in.nextLine();
	}
	
	private float tiempo() 
	{
		float num = Float.parseFloat(in.nextLine());
		return num;		
	}
	
	public String getNombre() {
		return nombre;
	}
		
}

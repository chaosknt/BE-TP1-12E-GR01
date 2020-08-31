package ar.edu.ort.tp1.ej02yej03;

import java.util.ArrayList;
import java.util.Scanner;

public class Competencia {
	
	public static Scanner in = new Scanner(System.in);
	
	private String nombre; //nombre de la competencia
	private ArrayList<Participante> participante;
	private ArrayList<Participante> ganador; // ejercicio 02
	private Podio ganadores;
			
	public Competencia(String nombre) 
	{
		this.nombre = nombre;
		participante = new ArrayList<Participante>();
		ganador = new ArrayList<Participante>();
		ganadores = new Podio();					
	}
	
	public void setDatos(String nombre, float tiempo) 
	{
		participante.add(new Participante(nombre, tiempo));
	}	
	
	public void mostrarParticipantes()
	{
		System.out.println("Nombre | Tiempo");
		for(Participante p: participante) 
		{
			System.out.println(p.toString());
		}
	}
	
	private void calcularGanadorUnico() // solo para la primera posicion (ejercicio 2)
	{
		float aux = Float.MAX_VALUE;
		float tiempoParticipante;
		for(Participante p: participante) 
		{
			tiempoParticipante = p.getTiempo();
			if(tiempoParticipante < aux)
			{
				aux = tiempoParticipante;
				ganador.clear();
				ganador.add(p);
			}else if(tiempoParticipante == aux)
			{
				ganador.add(p);
			}
		}
	}
	
	public void mostrarGanadorUnico()// ejercicio 2
	{
		calcularGanadorUnico();
		if(ganador.size() > 1) 
		{
			System.out.println("Hubo empate en el primer lugar");
			
		}
		
		for(Participante g: ganador) 
		{
			System.out.println(g);		
		}
		
	}					
	public void calcularGanador() 
	{
		System.out.println(participante.size());
		float tiempoParticipante = 0f;
		for(Participante p: participante) 
		{
			tiempoParticipante = p.getTiempo();
			if(ganadores.getTiempoPrimero() > tiempoParticipante) 
			{				
				ganadores.agregarNuevoPrimerLugar(tiempoParticipante, p);
			}else if(ganadores.getTiempoPrimero() == tiempoParticipante) 
			{
				ganadores.agregarPrimero(p);
			}else if(ganadores.getTiempoSegundo() > tiempoParticipante) 
			{
				ganadores.agregarNuevoSegundoLugar(tiempoParticipante, p);
			}else if(ganadores.getTiempoSegundo() == tiempoParticipante)
			{
				ganadores.agregarSegundo(p);
			}else if(ganadores.getTiempoTercero() > tiempoParticipante) 
			{
				ganadores.agregarNuevoTercerLugar(tiempoParticipante, p);
			}else if(ganadores.getTiempoTercero() ==  tiempoParticipante) 
			{
				ganadores.agregarTercero(p);
			}
			
		}
	}			
			
	public void mostrarGanador() 
	{	
		calcularGanador();		
		 ganadores.imprimir();		
	}			
	
	public String getNombre() 
	{
		return nombre;
	}
		
}

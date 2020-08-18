package ar.edu.ort.tp1.ej02;

import java.util.ArrayList;

public class Podio {
	
	private ArrayList<Participante> primero;
	private ArrayList<Participante> segundo;
	private ArrayList<Participante> tercero;
	
	Podio()
	{
		primero = new ArrayList<Participante>();
		segundo = new ArrayList<Participante>();
		tercero = new ArrayList<Participante>();
	}
	
	public void agregarPrimero(Participante p) 
	{
		primero.add(p);
	}
	
	public void agregarSegundo(Participante p) 
	{
		segundo.add(p);
	}
	
	public void agregarTercero(Participante p)
	{
		tercero.add(p);
	}
	
	public void vaciarPrimero() 
	{
		primero.clear();
	}
	
	public void vaciarSegundo() 
	{
		segundo.clear();
	}
	
	public void vaciarTercero() 
	{
		tercero.clear();
	}

	

}

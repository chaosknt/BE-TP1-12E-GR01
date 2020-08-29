package ar.edu.ort.tp1.ej01;

import java.util.ArrayList;

public class Grupo {
	private String nombreGrupo;
	private ArrayList<String> integrantes;
	
	public Grupo(String nombre) 
	{
		setNombre(nombre);
		integrantes = new ArrayList<String>();
	}
	
	public String getNombre() 
	{
		return nombreGrupo;
	}
	
	private void setNombre(String nombre)
	{
		nombreGrupo = nombre;
	}
	
	public int getCantidadIntegrantes()
	{
		return integrantes.size();
	}
	
	public void agregarIntegrante(String nombreIntegrante) 
	{
		if(obtenerPosicionIntegrante(nombreIntegrante) == -1)
		{
			integrantes.add(nombreIntegrante);
			System.out.println("["+nombreIntegrante+"]"+" fue asignado al grupo " + "["+ getNombre() + "]");
		}else
		{
			System.out.println("El integrante ya fue agregado");
		}
		
	}
	
	private int obtenerPosicionIntegrante(String nombreIntegrante)
	{
		int indice = 0;
		int retorno = -1;
		
		while(indice <  getCantidadIntegrantes() && !integrantes.get(indice).equals(nombreIntegrante)) 
		{
			indice++;
		}
		
		if(indice < getCantidadIntegrantes()) 
		{
			retorno = indice;
		}
		
		return retorno;
	}
	
	public String obtenerIntegrante(int posicion)
	{
		String retorno = null;
		if(posicion != -1 && posicion < getCantidadIntegrantes()) {
			retorno = integrantes.get(posicion);
		}
		return retorno;
	}
	
	public String buscarIntegrante(String nombre) 
	{
		String retorno = null;
		int indice = obtenerPosicionIntegrante(nombre);
		
		if(indice != -1) {
			retorno = integrantes.get(indice);
		}
		
		return retorno;
	}
	
	public String removerIntegrante(String nombreIntegrante) 
	{
		String retorno = null;
		int indice = obtenerPosicionIntegrante(nombreIntegrante);
		if(indice != -1) 
		{
			retorno = integrantes.remove(indice);
		}
		return retorno;
		
	}
	
	private void mostrarIntegrantes()
	{
		int integrantes = getCantidadIntegrantes();
		if(integrantes > 0) 
		{
			System.out.println("Cantidad de integrantes: " + integrantes);
			for(String  i: this.integrantes) 
			{
				System.out.println(i);
			}
		}else
		{
			System.out.println("La lista esta vacia");
		}
	}
	
	public void mostrar() 
	{
		mostrarIntegrantes();
	}
	
	public void vaciar() 
	{
		integrantes = new ArrayList<String>();
	}
	
}

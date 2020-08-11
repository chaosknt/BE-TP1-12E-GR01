package ar.edu.ort.tp1.ej01;

import java.util.ArrayList;

public class Grupo {
	private String nombreGrupo;
	private ArrayList<String> integrantes;
	
	public Grupo(String nombre) 
	{
		nombreGrupo = nombre;
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
		if(posicion != -1 && posicion < getCantidadIntegrantes()) {
			return integrantes.get(posicion);
		}else {
			return null;
		}
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
	
	
}

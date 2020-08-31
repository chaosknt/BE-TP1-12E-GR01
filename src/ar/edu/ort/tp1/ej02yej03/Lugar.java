package ar.edu.ort.tp1.ej02yej03;

import java.util.ArrayList;

public class Lugar {
	private float tiempo;
	private ArrayList<Participante> ganador;
	
	Lugar()
	{
		tiempo = Float.MAX_VALUE;
		ganador = new ArrayList<Participante>();
	}
	
	public float getTiempo() 
	{
		return tiempo;
	}
	
	public void setTiempo(float tiempo) 
	{
		this.tiempo = tiempo; 
	}
	
	public void agregar(Participante p) 
	{
		ganador.add(p);
	}
	
	public void vaciar() 
	{
		ganador.clear();
	}

	public void imprimirResultado() 
	{
				
		for(Participante p: ganador)
		{
			System.out.println(p.toString());
		}		
	}
	
	public ArrayList<Participante> devolverLista()
	{
		return ganador;
	}
	
	public void asignarLista(ArrayList<Participante> lista) 
	{
		ganador = lista;
	}
	
	
}

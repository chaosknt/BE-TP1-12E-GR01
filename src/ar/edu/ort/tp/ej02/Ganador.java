package ar.edu.ort.tp.ej02;

public class Ganador {
	private String nombre;
	private float tiempo;
	
	public Ganador(String nombre, float tiempo)
	{
		this.nombre = nombre;
		this.tiempo = tiempo;
	}


	@Override
	public String toString() {
		return "Ganador [nombre=" + nombre + ", tiempo=" + tiempo + "]";
	}
	
	
}

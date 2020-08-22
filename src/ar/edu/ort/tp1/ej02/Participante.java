package ar.edu.ort.tp1.ej02;

public class Participante {
	private String nombre;
	private float tiempo;
	
	public Participante(String nombre, float tiempo)
	{
		this.nombre = nombre;
		this.tiempo = tiempo;
	}

	public float getTiempo() 
	{
		return tiempo;
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	@Override
	public String toString() {
		return "Participante [nombre=" + nombre + ", tiempo=" + tiempo + "]";
	}

	
	
	
}

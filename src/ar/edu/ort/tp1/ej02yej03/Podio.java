package ar.edu.ort.tp1.ej02yej03;

public class Podio {
	
	private Lugar primero;
	private Lugar segundo;
	private Lugar tercero;
	
	
	Podio(){
		primero = new Lugar();
		segundo = new Lugar();
		tercero = new Lugar();
	}
	
	public float getTiempoPrimero() 
	{
		return primero.getTiempo();
	}
	
	public float getTiempoSegundo()
	{
		return segundo.getTiempo();
	}
	
	public float getTiempoTercero() 
	{
		return tercero.getTiempo();
	}
	
	public void setTiempoPrimero(float t) 
	{
		primero.setTiempo(t);
	}
	
	public void setTiempoSegundo(float t) 
	{
		segundo.setTiempo(t);
	}
	
	public void setTiempoTercero(float t) 
	{
		tercero.setTiempo(t);
	}
	
	public void agregarPrimero(Participante p) 
	{
		primero.agregar(p);
	}
	
	public void agregarSegundo(Participante p)
	{
		segundo.agregar(p);
	}
	
	public void agregarTercero(Participante p)
	{
		tercero.agregar(p);
	}
	
	public void vaciarPrimero() 
	{
		primero.vaciar();
	}
	
	public void vaciarSegundo()
	{
		segundo.vaciar();
	}
	
	public void vaciarTercero() 
	{
		tercero.vaciar();
	}
	
	public void imprimir() 
	{
		System.out.println("Primero puesto");
		mostrarPrimero();
		System.out.println("--------------------");
		System.out.println("Segundo puesto");
		mostrarSegundo();
		System.out.println("--------------------");
		System.out.println("Tercer puesto");
		mostrarTercero();
	}
	
	private void mostrarPrimero() 
	{
		primero.imprimirResultado();
	}
	
	private void mostrarSegundo()
	{
		segundo.imprimirResultado();
	}
	
	private void mostrarTercero()
	{
		tercero.imprimirResultado();
	}

}

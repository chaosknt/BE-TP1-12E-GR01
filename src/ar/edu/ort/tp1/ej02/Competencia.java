package ar.edu.ort.tp1.ej02;

import java.util.ArrayList;
import java.util.Scanner;

public class Competencia {
	
	public static Scanner in = new Scanner(System.in);
	
	private String nombre;//nombre de la competencia
	private ArrayList<Participante> participante;
	private Podio ganadores;
	
	public Competencia(String nombre) 
	{
		this.nombre = nombre;
		participante = new ArrayList<Participante>();
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
	
	private void calcularGanador() 
	{
		float tiempo = 0;
		int posicion;
		int menor = 1;
		int igual = 2;
		int mayor = 3;
		for(Participante p: participante) 
		{
			tiempo = p.getTiempo();
			posicion = calcularPosicion(tiempo, ganadores.getTiempoPrimero());
			//comparo con el primero lugar
			if(posicion  == menor) 
			{
				ganadores.vaciarPrimero();
				ganadores.agregarPrimero(p);
				ganadores.setTiempoPrimero(tiempo);
			}else if(posicion == igual) 
			{
				ganadores.agregarPrimero(p);
			}else if(posicion == mayor) 
			{
				posicion = calcularPosicion(tiempo, ganadores.getTiempoSegundo());
				//comparo con el segundo lugar
				if(posicion == menor) 
				{
					ganadores.vaciarSegundo();
					ganadores.agregarSegundo(p);
					ganadores.setTiempoSegundo(tiempo);
				}else if(posicion == igual) 
				{
					ganadores.agregarSegundo(p);
				}else if(posicion == mayor)
				{
					posicion = calcularPosicion(tiempo, ganadores.getTiempoTercero());
					//comparo con el tercer lugar
					if(posicion == menor) 
					{
						ganadores.vaciarTercero();
						ganadores.agregarTercero(p);
						ganadores.setTiempoTercero(tiempo);
					}else if(posicion == igual) 
					{
						ganadores.agregarTercero(p);
					}
				}
			}
			
		}
				
	}
	
	private int calcularPosicion(float tiempoParticipante, float TiempoPodio) 
	{
		// 1 es menor
		// 2 es igual
		// 3 es mayor		
		int retorno;
		if(tiempoParticipante < TiempoPodio) 
		{
			retorno = 1;
		}else if(tiempoParticipante > TiempoPodio) 
		{
			return 3;
		}else 
		{
			retorno = 2;
		}
		
		return retorno;
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

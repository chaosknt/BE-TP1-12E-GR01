package ar.edu.ort.tp1.ej04;

public class Anio {	
	
	private String[] meses = {"En",
							"Febrero",
							"Marzo",
							"Abril",
							"Mayo",
							"Junio",
							"Julio",
							"Agosto",
							"Septiembre",
							"Octubre",
							"Noviembre",
							"Diciembre"};
	
	private int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public String getNombreDelMes(int numeroMes){
		return meses[numeroMes-1];
	}
	
	public int diasTranscurridos(int numeroMes) 
	{	
		int sumaMes = 0;
		for(int i = 0; i < numeroMes -1; i++) 
		{
			sumaMes += dias[i];
		}
		return sumaMes;
	}
	
	public int calcularDiasTranscurridos(int dia, int mes) 
	{
		int diasTranscurridos = dia + diasTranscurridos(mes);			
		
		return diasTranscurridos;
	}

	
	
	
}

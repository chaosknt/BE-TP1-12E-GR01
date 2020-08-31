package ar.edu.ort.tp1.ej04yej05;

public class AnioV2 {
			
	private Meses[] meses = {Meses.ENERO,
			Meses.FEBRERO,
			Meses.MARZO,
			Meses.ABRIL,
			Meses.MAYO,
			Meses.JULIO,
			Meses.JULIO,
			Meses.AGOSTO,
			Meses.SEPTIEMBRE,
			Meses.OCTUMBRE,
			Meses.NOVIEMBRE,
			Meses.DICIEMBRE};
	
		
	private int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
	//private int[] diasT = {0,31,59,90,120,151,181,212,243,273,304,334};
			
	public AnioV2(){}
	
	public Meses getNombreDelMes(int numeroMes){
		return meses[numeroMes-1];
	}
	
	public int diasTranscurridos(int numeroMes) {	
		int retorno= 0;
		if(numeroMes > 1)
		{
			for(int i = 0; i < numeroMes - 1; i++)
			{
				retorno += dias[i];
			}
		}
		return retorno;
	}
	
	public int calcularDiasTranscurridos(int dia, int mes) {
		int diasTranscurridos = dia + diasTranscurridos(mes);			
		return diasTranscurridos;
	}
	
}

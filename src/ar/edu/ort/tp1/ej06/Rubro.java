package ar.edu.ort.tp1.ej06;

public class Rubro {
	private String nombre;
	private double [] gasto;
	
	Rubro(String nombre)
	{
		//Es el constructor. Recibe el nombre o descripción del rubro. Debe inicializar el
		//arreglode importes
		this.nombre = nombre;
		gasto = new double [12];
		
	}
	
	private void inicializarGastos()
	{
		//Inicializa el arreglo de importes.
		gasto = new double[12];
		
	}
	
	public void agregarGasto(Mes mes, double gasto) 
	{
		//Acumula el importe en la posición correspondiente al mes indicado.
		int indice = devolverIndice(mes);
		this.gasto[indice] += gasto;
		
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public double getTotalGastos(Mes mes) 
	{
		//Devuelve el importe acumulado de gastos para el mes indicado.
		int indice = devolverIndice(mes);
		return gasto[indice];
	}
	
	public double getGastoAcumulado()
	{
		double retorno = 0;
		for(int i = 0; i < gasto.length; i++) 
		{
			retorno += gasto[i];
		}
		return retorno;
	}
	
		
	private int devolverIndice(Mes mes)
	{
		int retorno = 0;
		
		switch(mes)
		{
		case ENERO: retorno = 1;
			break;
		case FEBRERO: retorno = 2;
			break;
		case MARZO: retorno = 3;
			break;
		case ABRIL: retorno = 4;
			break;
		case MAYO: retorno = 5;
			break;
		case JUNIO: retorno = 6;
			break;
		case JULIO: retorno = 7;
			break;
		case AGOSTO: retorno = 8;
			break;
		case SEPTIEMBRE: retorno = 9;
			break;
		case OCTUBRE: retorno = 10;
			break;
		case NOVIEMBRE: retorno = 11;
			break;
		case DICIEMBRE: retorno = 12;
			break;
		}
		
		return retorno;
	}
	
	
}

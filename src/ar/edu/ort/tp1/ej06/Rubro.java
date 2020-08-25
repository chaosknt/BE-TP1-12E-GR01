package ar.edu.ort.tp1.ej06;

public class Rubro {
	private String nombre;
	private double [] gasto;
	
	Rubro(String nombre)
	{
		//Es el constructor. Recibe el nombre o descripción del rubro. Debe inicializar el
		//arreglode importes
		this.nombre = nombre;
		inicializarGastos();
		
	}
	//funcion para testear
	public void mostrarAnio() 
	{
		for(int i = 0; i < gasto.length; i++) 
		{
			System.out.println(gasto[i]);
		}
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
	
	public double getTotalGastos(int mes) 
	{
		return gasto[mes + 1];
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
		case ENERO: retorno = 0;
			break;
		case FEBRERO: retorno = 1;
			break;
		case MARZO: retorno = 2;
			break;
		case ABRIL: retorno = 2;
			break;
		case MAYO: retorno = 4;
			break;
		case JUNIO: retorno = 5;
			break;
		case JULIO: retorno = 6;
			break;
		case AGOSTO: retorno = 7;
			break;
		case SEPTIEMBRE: retorno = 8;
			break;
		case OCTUBRE: retorno = 9;
			break;
		case NOVIEMBRE: retorno = 10;
			break;
		case DICIEMBRE: retorno = 11;
			break;
		}
		
		return retorno;
	}
	
	
}

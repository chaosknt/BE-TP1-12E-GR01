package ar.edu.ort.tp1.ej06;

import java.util.ArrayList;

public class GastoAnual {
	private ArrayList<Rubro> gastos;
	
	GastoAnual()
	{
		gastos = new ArrayList<Rubro>();
	}
	
	public void agregarGasto(Mes mes, String nombreRubro, double importe)
	{
		/*Agrega el importe gastado al rubro que corresponda y en el mes indicado. Si el
		rubro no se encuentra registrado en la colección se lo agregará, y cuando ya 
		exista se acumulará en este el valor del gasto. Pero debe controlarse que el
		importe ingresado sea mayor que cero.*/		
		Rubro aux = obtenerRubro(nombreRubro);
		aux.agregarGasto(mes, importe);
		System.out.println("Operacion realizada.");
	}
	
	private Rubro obtenerRubro(String nombreRubro) 
	{
		/* Obtiene y devuelve el Rubro a partir de su nombre. Cuando éste no exista deberá crearlo*/
		Rubro retorno = buscarRubro(nombreRubro);
		if(retorno == null) 
		{
			retorno = crearRubro(nombreRubro);
		}
		return retorno;
	}
	
	private Rubro crearRubro(String nombreRubro)
	{
		Rubro retorno = new Rubro (nombreRubro);
		gastos.add(retorno);
		return retorno;
	}
	
	private Rubro buscarRubro(String nombreRubro) 
	{
		//Busca y devuelve un Rubro a partir de su nombre. Cuando no lo encuentre deberá volver null
		int indice = 0;
		Rubro retorno = null;
		while(indice < gastos.size() && !gastos.get(indice).getNombre().equals(nombreRubro))
		{
			indice++;
		}
		
		if(indice < gastos.size()) 
		{
			retorno = gastos.get(indice);
		}		
		return retorno;
	}
	
	private double[][] consolidarGastos()
	{
		/*Genera un arreglo bidimensional consolidando en una sola estructura todos los
		gastos del año. La matriz debe medir 12 (la cantidad de meses del año) por la
		cantidad de Rubros existentes, y cada celda debe contener el importe
		acumulado para el rubro en ese mes.*/
		return null;
	}
	
	public double gastoAcumulado(Mes mes)
	{
		//Devuelve el importe del gasto acumulado en el mes indicado
		double retorno = 0;
		for(Rubro g: gastos)
		{
			retorno += g.getTotalGastos(mes);
		}
		return retorno;
	}
	
	public double gastoAcumulado(String nombreRubro)
	{
		//Devuelve el importe del gasto acumulado en el rubro indicado. Si el rubro no
		//existe deberá devolver -1.
		double retorno = -1;
		Rubro gAcumulado = buscarRubro(nombreRubro);
		if(gAcumulado != null) 
		{
			retorno = gAcumulado.getGastoAcumulado();
		}
		return retorno;
	}
	
	public void informarConsumosPorMes() 
	{
		//Muestra los consumos por mes (discriminado por cada rubro de gasto y
		//acumulado)
	}
	
	public void informarPromedioMensualPorRubro()
	{
		//Muestra los consumos promedio por mes en cada rubro.
	}
	
	public void informarMesMayorConsumo() 
	{
		//Calcula y muestra nombre e importe acumulado del mes con mayor consumo
		//total (puede ser uno o más de uno).
	}
}

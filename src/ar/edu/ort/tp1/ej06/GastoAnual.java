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
		rubro no se encuentra registrado en la colecci�n se lo agregar�, y cuando ya 
		exista se acumular� en este el valor del gasto. Pero debe controlarse que el
		importe ingresado sea mayor que cero.*/
	}
	
	private Rubro obtenerRubro(String nombreRubro) 
	{
		/* Obtiene y devuelve el Rubro a partir de su nombre. Cuando �ste no exista deber� crearlo*/
		return null;
	}
	
	private Rubro buscarRubro(String nombreRubro) 
	{
		//Busca y devuelve un Rubro a partir de su nombre. Cuando no lo encuentre deber� volver null
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
		gastos del a�o. La matriz debe medir 12 (la cantidad de meses del a�o) por la
		cantidad de Rubros existentes, y cada celda debe contener el importe
		acumulado para el rubro en ese mes.*/
		return null;
	}
	
	public double gastoAcumulado(Mes mes)
	{
		//Devuelve el importe del gasto acumulado en el mes indicado
		return 0;
	}
	
	public double gastoAcumulado(String nombreRubro)
	{
		//Devuelve el importe del gasto acumulado en el rubro indicado. Si el rubro no
		//existe deber� devolver -1.
		return 0;
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
		//total (puede ser uno o m�s de uno).
	}
}

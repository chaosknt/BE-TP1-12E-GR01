package ar.edu.ort.tp1.ej06;

import java.util.ArrayList;
	
public class GastoAnual {
	private static final int MESES = 12;
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
	
	//funcion para testear 
	public void verGasto() 
	{
		for(Rubro g: gastos) 
		{
			g.mostrarAnio();
		}
	}
	
	private Rubro obtenerRubro(String nombreRubro) 
	{
		/* Obtiene y devuelve el Rubro a partir de su nombre. Cuando éste no exista deberá crearlo*/
		Rubro retorno = buscarRubro(nombreRubro);
		
		if(retorno == null) 
		{
			System.out.println("El rubro " + nombreRubro + " no existe, se va crear");
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
	
	public double[][] consolidarGastos()
	{
		/*Genera un arreglo bidimensional consolidando en una sola estructura todos los
		gastos del año. La matriz debe medir 12 (la cantidad de meses del año) por la
		cantidad de Rubros existentes, y cada celda debe contener el importe
		acumulado para el rubro en ese mes.*/
		
		double [][] retorno = new double [MESES][gastos.size()];		
		for(int m = 0; m < retorno.length; m++) 
		{
			for(int g = 0; g < retorno[m].length; g++)
			{
				retorno[m][g] = gastos.get(g).getTotalGastos(m);
			}
		}
		return retorno;
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
		System.out.println("Consumos por mes:");
		
		double [][]consolidarGasto = consolidarGastos();
		Rubro gasto = null;
		
		for(int m = 0; m < consolidarGasto.length; m++) 
		{
			System.out.println("Mes: " + devolverMes(m));
			for(int g = 0; g < consolidarGasto[m].length; g++)
			{
				gasto = gastos.get(g);				
				System.out.println("Rubro: " + gasto.getNombre() + " Importe: " + consolidarGasto[m][g]);							
				
			}
			
		}
	}
	
	public void informarPromedioMensualPorRubro()
	{
		//Muestra los consumos promedio por mes en cada rubro.
		
		System.out.println("Promedio mensual por rubro");
		for(Rubro g: gastos) 
		{
			System.out.println("Nombre: " + g.getNombre() + " Promedio mensual: " + g.getGastoAcumulado() / MESES);
		}
	}
	
	
	public void informarMesMayorConsumo()
	{
		//Calcula y muestra nombre e importe acumulado del mes con mayor consumo
		//total (puede ser uno o más de uno).		
		ArrayList<Mes>info = new ArrayList<Mes>();
		double [][]acumulado = acumuladoMensual();
		double aux = -1;
		
		for(int m = 0; m < acumulado.length; m++)
		{
			for(int g = 0; g < acumulado[m].length; g++)
			{
				if(acumulado[m][g] > aux) 
				{
					aux = acumulado[m][g];
					info.clear();
					info.add(devolverMes(m));
				}else if(acumulado[m][g] == aux)
				{
					info.add(devolverMes(m));
				}
			}
		}
		System.out.println("Informe mayor consumo: ");
		System.out.println("Total: " + aux);
		for(Mes m: info) 
		{
			System.out.println(m);
		}
				
	}	
	
	private double[][] acumuladoMensual()
	{
		double [][] retorno = new double[MESES][1];
		double [][] gastos = consolidarGastos();
		double aux = Double.MIN_VALUE;
		
		for(int m = 0; m < gastos.length; m++)
		{
			for(int g = 0; g < gastos[m].length; g++) 
			{
				aux += gastos[m][g];
				
			}
			retorno[m][0] = aux;
			aux = 0;						
		}		
		return retorno;			
	}
		
				
	public Mes devolverMes(int indice) 
	{
		Mes retorno = null;
		switch(indice)
		{
		case 0: retorno = Mes.ENERO;
			break;
		case 1: retorno = Mes.FEBRERO;
			break;
		case 2: retorno = Mes.MARZO;
			break;
		case 3: retorno = Mes.ABRIL;
			break;
		case 4: retorno = Mes.MAYO;
			break;
		case 5: retorno = Mes.JUNIO;
			break;
		case 6: retorno = Mes.JULIO;
			break;
		case 7: retorno = Mes.AGOSTO;
			break;
		case 8: retorno = Mes.SEPTIEMBRE;
			break;
		case 9: retorno = Mes.OCTUBRE;
			break;
		case 10: retorno = Mes.NOVIEMBRE;
			break;
		case 11: retorno = Mes.DICIEMBRE;
			break;
		}
		return retorno;
	}
}

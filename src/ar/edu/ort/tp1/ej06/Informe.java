package ar.edu.ort.tp1.ej06;

import java.util.ArrayList;

public class Informe {
	
	private ArrayList<Mes> mes;	
	private double acumulado;

	Informe(int indice, double acumulado)
	{		
		this.acumulado = acumulado;
		this.mes = new ArrayList<Mes>();
		this.mes.add(devolverMes(indice));
	}
	
	public void show()
	{
		System.out.println("Acumulado: " + acumulado);
		for(Mes m: mes) 
		{
			System.out.println(m);
		}
	}
	
	public void add(Mes mes) 
	{
		this.mes.add(mes);
	}
	
	public void clear()
	{
		mes.clear();
	}
	
	public void setImporte(double acumulado)
	{
		this.acumulado = acumulado;
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

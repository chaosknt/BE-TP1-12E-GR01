package ar.edu.ort.tp1.ej06;

public class Test {

	public static void main(String[] args) {
		
		/*Rubro gasto = new Rubro("luz");
		
		gasto.agregarGasto(Mes.ENERO, 10);			
		
		System.out.println(gasto.getTotalGastos(Mes.FEBRERO));
		
		System.out.println(gasto.getTotalGastos(Mes.ENERO));
		
		System.out.println(gasto.getGastoAcumulado());
		
		System.out.println("---");
		
		gasto.mostrarAnio();*/
		
		//clase Rubro funciona ok // 
		
		GastoAnual gastos = new GastoAnual();
		
		gastos.agregarGasto(Mes.ENERO, "luz", 10);
		
		System.out.println("---");
		gastos.verGasto();
		
		System.out.println("---");
		
		double a [] [] = gastos.consolidarGastos();
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++) 
			{
				System.out.println(a[i][j]);
			}
		}
		
		
	}

}

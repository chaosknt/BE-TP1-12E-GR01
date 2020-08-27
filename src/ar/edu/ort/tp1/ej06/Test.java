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
		gastos.agregarGasto(Mes.ENERO, "luz", 10);
		
		gastos.agregarGasto(Mes.ENERO, "Gas", 10);
		
		gastos.agregarGasto(Mes.FEBRERO, "Gas", 10);
		gastos.agregarGasto(Mes.FEBRERO, "Gas", 10);
		gastos.agregarGasto(Mes.FEBRERO, "Gas", 10);
		
		System.out.println("---");
		gastos.verGasto();
		
		System.out.println("---");
		
		double a [] [] = gastos.consolidarGastos();
		
		/*for(int i = 0; i < a.length; i++)
		{
			System.out.println("Mes: " + i);
			for(int j = 0; j < a[i].length; j++) 
			{
				System.out.println(a[i][j]);
			}
		}*/
		
		System.out.println(gastos.gastoAcumulado("luz"));
		
		System.out.println(gastos.gastoAcumulado(Mes.ENERO));
		
		gastos.informarConsumosPorMes();
		
		gastos.informarPromedioMensualPorRubro();
		
		gastos.informarMesMayorConsumo();
		
							
		
	}

}

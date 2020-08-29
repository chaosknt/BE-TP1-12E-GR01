package ar.edu.ort.tp1.ej06;

public class Test {

	public static void main(String[] args) {		
		
		GastoAnual gastos = new GastoAnual();
		
		gastos.agregarGasto(Mes.ENERO, "Luz", 10);
		gastos.agregarGasto(Mes.FEBRERO, "Luz", 10);
		gastos.agregarGasto(Mes.MARZO, "Luz", 10);
		
		
	
		
		gastos.agregarGasto(Mes.ENERO, "Gas", 15);
		gastos.agregarGasto(Mes.FEBRERO, "Gas", 15);
		gastos.agregarGasto(Mes.MARZO, "Gas", 15);
		
		
		gastos.agregarGasto(Mes.ENERO,"Agua", 9);
		gastos.agregarGasto(Mes.FEBRERO,"Agua", 9);
		gastos.agregarGasto(Mes.MARZO, "Agua", 9);
		
		
		System.out.println("---");
		
		//double a [] [] = gastos.consolidarGastos();		
		
		System.out.println("Mostrando todo el gasto acumulado para el rubro Luz: "+gastos.gastoAcumulado("Luz"));
		System.out.println("Mostrando todo el gasto acumulado para el rubro Sushi: "+gastos.gastoAcumulado("Sushi"));
		
		System.out.println("Mostrando el gasto acumulado de todos los rubros para el mes de enero: "+gastos.gastoAcumulado(Mes.ENERO));
		
		gastos.informarConsumosPorMes();
		
		gastos.informarPromedioMensualPorRubro();
		
		gastos.informarMesMayorConsumo();
		
							
		
	}

}

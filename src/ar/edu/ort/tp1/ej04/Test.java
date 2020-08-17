package ar.edu.ort.tp1.ej04;

public class Test {

	public static void main(String[] args) {
		
		Anio a = new Anio();
		int dia = 2;
		System.out.println(a.getNombreDelMes(dia));
		
		int dias = a.diasTranscurridos(dia);
		
		System.out.println(dias);
		
		System.out.println(a.calcularDiasTranscurridos(10, 3));

	}

}

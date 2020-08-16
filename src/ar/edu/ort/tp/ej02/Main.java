package ar.edu.ort.tp.ej02;

public class Main {

	public static void main(String[] args) {
		
		Competencia carrera = new Competencia("Carrera", 2);
		
		carrera.setDatos();
		
		carrera.mostrar();
		
		carrera.calcularGanador();

	}

}

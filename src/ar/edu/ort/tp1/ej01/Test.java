package ar.edu.ort.tp1.ej01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros [] = new int [] {1,2,3};
		int aux = 0 ;
		
		for(int i = 0; i < numeros.length; i++) {
			
			aux = numeros[i];
			numeros[i] = numeros[i + 1];
			
		}
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			
			
		}
		
		
	}

}

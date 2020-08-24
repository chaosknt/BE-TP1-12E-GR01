package ar.edu.ort.tp1.ej06;

public class Test {

	public static void main(String[] args) {
		int num [][] = new int [12][1];
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.println("Fila:  " + i);
			for(int j = 0; j < num[i].length; j++) 
			{
				System.out.println(num[i][j]);
			}
		}
		
		
		
	}

}

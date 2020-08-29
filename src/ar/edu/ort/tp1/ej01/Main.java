package ar.edu.ort.tp1.ej01;

public class Main {

	public static void main(String[] args) {
		String nombreGrupo = "GRP01";
		
		Grupo tallerProgramacion = new Grupo(nombreGrupo);
		
		tallerProgramacion.agregarIntegrante("Mariano Pagani");
		tallerProgramacion.agregarIntegrante("Mariano Heffes");
		tallerProgramacion.agregarIntegrante("Nahuel Stellato");
		tallerProgramacion.agregarIntegrante("Tomas Loughry");
		tallerProgramacion.agregarIntegrante("Diego Maradona");
		
		mostrarDatos(tallerProgramacion);
		
		System.out.println("Existe el integrante diego MaRaDoNad? "+ existe("diego MaRaDoNad", tallerProgramacion));
		System.out.println("Existe el integrante Mariano Pagani? "+ existe("Mariano Pagani", tallerProgramacion));
		
		System.out.println("Integrante removido: "+ tallerProgramacion.removerIntegrante("Diego Maradona"));
		System.out.println("Integrante removido: "+ tallerProgramacion.removerIntegrante("Diego Maradona"));
		
		mostrarDatos(tallerProgramacion);
		
		tallerProgramacion.vaciar();
		
		mostrarDatos(tallerProgramacion);
		

	}
	
	public static Boolean existe(String nombre, Grupo grupo) 
	{
		Boolean retorno = false;	
		if(grupo.buscarIntegrante(nombre)!= null) 
		{
			retorno = true;
		}
		return retorno;
	}
	
	public static void mostrarDatos(Grupo grupo)
	{		
		System.out.println("Nombre del grupo: " + grupo.getNombre());
		grupo.mostrar();
	}
		

}

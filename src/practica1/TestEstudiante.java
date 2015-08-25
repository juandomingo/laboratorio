package practica1;
import practica1.Estudiante;

public class TestEstudiante{
	public static void main(String[] args)
	{
		//Estudiante[] estudiantes = new Estudiante[5];
		Estudiante[] estudiantes = {new Estudiante("Antonio","Banderas",114404),
				new Estudiante("Marco","Antonio",104404),
				new Estudiante("Jose","García",10004),
				new Estudiante("Gabriel","Saer",114404),
				new Estudiante("Lykke","Li",114404)
		};
		
		for (Estudiante estudiante : estudiantes) {
			System.out.print(estudiante.toString() + "   ");
			
		}
		if (new Estudiante("AAAAAA","AAAAAA",104404) == new Estudiante("AAAAAA","AAAAAA",104404))
			System.out.print(" == mismos da ok   ");
		if (new Estudiante("BBBBBB","BBBBBB",104404) == new Estudiante("XXXXXX","XXXXXX",104404))
			System.out.print(" == dist da ok   ");
	}
}

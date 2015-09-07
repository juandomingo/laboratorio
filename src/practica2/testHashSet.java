package practica2;
import practica1.Estudiante;


import java.util.ArrayList;
import java.util.Collection;



public class testHashSet {
	public static void main(String[] args) {
		
		HashSetAgregados2<Estudiante> hash = new HashSetAgregados2<>();
		

		
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		estudiantes.add(new Estudiante("Marco","Antonio",104404));
		estudiantes.add(new Estudiante("Jose","Garcia",10004));

			

		System.out.println(hash.getCantidadAgregados());
		hash.addAll((Collection<Estudiante>) estudiantes );
		System.out.println(hash.getCantidadAgregados());
		hash.remove(new Estudiante("Jose","Garcia",10004));
		System.out.println(hash.getCantidadRemovidos());

	}
}

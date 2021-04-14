package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		TreeSet<Profesor> listaProfesores = new TreeSet<Profesor>();
		listaProfesores.add(new Profesor("Astronomia", 10, "Federico",32));
		listaProfesores.add(new Profesor("Matematica", 4, "Jeremias",35));
		listaProfesores.add(new Profesor("Ingenieria", 3, "Martin",25));
		
		Profesor profesorPrueba1 = new Profesor("Ingenieria", 2, "Ornella",24);
		Profesor profesorPrueba2 = new Profesor("Ingenieria", 2, "Ornella",24);
		
		listaProfesores.add(profesorPrueba1);
		listaProfesores.add(profesorPrueba2);
		
		System.out.println("Listado de profesores");		
		Iterator<Profesor> it = listaProfesores.iterator();
		while(it.hasNext())
		{
			Profesor p = (Profesor) it.next();
			System.out.println(p.toString());
		}
		
		System.out.println("Profesores a comparar");

		System.out.println(profesorPrueba1);
		System.out.println(profesorPrueba2);
		System.out.println("Resultado de comparacion");
		System.out.println(profesorPrueba1.equals(profesorPrueba2)?"Son la misma persona.":"No son la misma persona.");
	}
}

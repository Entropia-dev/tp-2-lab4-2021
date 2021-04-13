package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {

		ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
		listaProfesores.add(new Profesor("Astronomia", 10, "Federico",32));
		listaProfesores.add(new Profesor("Matematica", 4, "Jeremias",35));
		listaProfesores.add(new Profesor("Ingenieria", 10, "Martin",22));
		
		Profesor profesorPrueba1 = new Profesor("Ingenieria", 2, "Ornella",24);
		Profesor profesorPrueba2 = new Profesor("Ingenieria", 2, "Ornella",24);
		
		listaProfesores.add(profesorPrueba1);
		listaProfesores.add(profesorPrueba2);
		
		System.out.println("Listado de personas: ");
		ListIterator<Profesor> it = listaProfesores.listIterator();
		while (it.hasNext()) {
			Profesor profesor = it.next();
			it.remove();
			System.out.println(profesor.toString());
		}
		
		System.out.println("Profesores a comparar");
		
		System.out.println(profesorPrueba1);
		System.out.println(profesorPrueba2);
		System.out.println("Resultado de comparacion");
		System.out.println(profesorPrueba1.equals(profesorPrueba2)?"Son la misma persona":"No son la misma persona");
	}

}

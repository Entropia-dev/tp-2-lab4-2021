package ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio3 {

	public static void main(String[] args) {
		ArrayList<IEdificio> edificios = new ArrayList<IEdificio>();
		edificios.add(new Polideportivo("Belgrano", 100.50, 1));
		edificios.add(new EdificioDeOficinas(40, 30.50));
		edificios.add(new Polideportivo("R. Rojas", 40.50, 2));
		edificios.add(new Polideportivo("M. Moreno", 42.50, 2));
		edificios.add(new EdificioDeOficinas(60, 32));
		
		ListIterator<IEdificio> it = edificios.listIterator();
		System.out.println("Listado de Polideportivos y Edificios de oficinas: ");
		while (it.hasNext()) {
			IEdificio edificio = it.next();
			System.out.println(edificio.toString());
		}
	}

}

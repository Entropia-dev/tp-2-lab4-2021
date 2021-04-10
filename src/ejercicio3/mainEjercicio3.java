package ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio3 {

	public static void main(String[] args) {
		
		ArrayList<Inmueble> listaInmuebles = new ArrayList<Inmueble>();
		listaInmuebles.add(new Polideportivo(100.50, 10));
		listaInmuebles.add(new EdificioDeOficinas());
		listaInmuebles.add(new Polideportivo(20.50, 9));
		
		ListIterator<Inmueble> it = listaInmuebles.listIterator();
		
		while (it.hasNext()) {
			Inmueble inmueble = it.next();
			System.out.println(inmueble.toString());
		}

	}

}

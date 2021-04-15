package ejercicio2;

import java.util.Calendar;
public class mainEjercicio2 {

	public static void main(String[] args) {
		
		 System.out.println("Producto fresco");
		 Producto productoFresco = new ProductoFresco(Utilidades.buildCalendar(2030, Calendar.OCTOBER, 10), 
				 						10, Utilidades.buildCalendar(2021, Calendar.MARCH,3), "Argentina");
		 System.out.println(productoFresco.toString());

		 System.out.println("Producto refrigerado");
		 Producto productoRefrigerado = new ProductoRefrigerado(Utilidades.buildCalendar(2022, Calendar.JANUARY, 2), 41, "A01");
		 System.out.println(productoRefrigerado.toString());
		
		 System.out.println("Producto congelado");
		 Producto productoCongelado = new ProductoCongelado(Utilidades.buildCalendar(2021, Calendar.DECEMBER, 9), 100, 18.30);
		 System.out.println(productoCongelado.toString());
	}
}

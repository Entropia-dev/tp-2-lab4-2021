package ejercicio1;

public class Empleado{
	
	//Atributo estatico
	private static int identity = 1000;
	
	//Atributos
	private final int id;
	private String nombre;
	private int edad;
		
	//Metodo estatico que devuelve 
	public static int devuelveProximoId() 
	{
		return identity; 
	}
	
	//Constructor que recibe los parametros "nombre" y la "edad".
	public Empleado(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.id = identity++;
	}
	
	//Constructor vacio.
	public Empleado()
	{
		this("Sin nombre", 99);
	}
	
	//@Override del metodo toString() para que devuelva un string formateado.
	@Override 
	public String toString() 
	{
		return "Empleado " + nombre + ", Edad:" + edad + ", ID: "+ id ;
	}

	//Setter setNombre
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	//Setter setEdad
	public void setEdad(int edad) 
	{
		this.edad = edad;
	}
	 
	//Getter getEdad
	public int getEdad() 
	{
		return edad;
	}
	
	//Getter getNombre
	public String getNombre() 
	{
		return nombre;
	}
	
	//Getter getID
	public int getId() 
	{
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (edad != other.edad)
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
}

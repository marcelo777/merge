package model;

public class Trabajo {
	
	private String nombre;
	private int numero;
	private String direccion;
	
	public Trabajo(String nombre, int numero, String direccion) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Trabajo [nombre=" + nombre + ", numero=" + numero + ", direccion=" + direccion + "]";
	}

}

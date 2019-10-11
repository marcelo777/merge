package model;


public class Categoria {
	private int codCategoria;
	private String Nombre;
	private String Descripcion;

	public Categoria(int codCategoria, String Nombre, String Descripcion) {
		super();
		this.codCategoria = codCategoria;
		this.Nombre = Nombre;
		this.Descripcion = Descripcion;

	}

	public Integer getCodCategoria() {
		return codCategoria;
	}

	public void setCodCategoria(int codCategoria) {
		this.codCategoria = codCategoria;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}




}

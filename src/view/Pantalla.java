package view;

import model.Persona;
import model.Trabajo;

public class Pantalla {
	
	public static void main(String[] args) {
		Persona persona = new Persona(1,"John", "Doe", "Hombre");
		System.out.println(persona);
		Trabajo trabajo = new Trabajo("Panchita",4387639,"IC Norte Dorbigny");
		System.out.println(trabajo);
	}
}

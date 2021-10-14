package dad;

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonSample {

	public static void main(String[] args) {
		
		String nombre, apellidos;
		int edad=0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame un nombre: ");
		nombre=scanner.nextLine();
		while(nombre.isBlank()) {
			System.out.println("Por favor, dame un nombre: ");
			nombre=scanner.nextLine();
		}
		
		System.out.println("Dame un apellido: ");
		apellidos=scanner.nextLine();
		while(apellidos.isBlank()) {
			System.out.println("Por favor, dame un apellido: ");
			apellidos=scanner.nextLine();
		}
		
		System.out.println("Por último, dime la edad: ");
		try{
			edad=scanner.nextInt();
		}catch(Exception e) {
			System.out.println("Eso no es un numero! Asegurate de introducir un numero: ");
			edad=scanner.nextInt();
		}	
		Persona p = new Persona(nombre, apellidos, edad);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
	}

}

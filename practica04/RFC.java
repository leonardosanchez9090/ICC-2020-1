import java.util.Scanner;

/**
	@autor Sanchez Espinoza Leonardo
	@version 27/08/2019

*/

public class RFC {

	public static void main(String[] args) {
		
		// Declaracion de variables
		Scanner scanner = new Scanner(System.in);
		String nombreCompleto = new String();
		String fechaCompleta = new String();
		
		// Scanners
		
		System.out.println("Escribe tu nobre completo en una linea");
		nombreCompleto = scanner.nextLine();
		System.out.println("Escribe tu fecha de nacimiento en el formato dd/mm/aaaa");
		fechaCompleta = scanner.nextLine();
		
		// Convertidor Nombre
		
		char inicialn = nombreCompleto.charAt(0);
		int aPaterno = nombreCompleto.indexOf(" ");
		String inicialesap = nombreCompleto.substring(aPaterno +1, aPaterno +3);
		int aMaterno = nombreCompleto.lastIndexOf(" ");
		String inicialesam = nombreCompleto.substring(aMaterno +1,aMaterno+2);
		
		//Convertidor fecha
		
		String fechaD = fechaCompleta.substring(0 , 2);
		String fechaM = fechaCompleta.substring(3, 5);
		String fechaA = fechaCompleta.substring(8 , 10);
		
		
		// Impresores

		String rfc = (inicialesap) + (inicialesam) + (inicialn) + (fechaA) + (fechaM) + (fechaD);
		rfc = rfc.toUpperCase();
		System.out.println("Tu RFC es " + (rfc));

	}

}
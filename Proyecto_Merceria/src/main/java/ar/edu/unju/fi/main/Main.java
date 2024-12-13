package ar.edu.unju.fi.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Merceria mayorista --> vende por mayor
		// Menos de 5 productos NO VENDE
		// Entre 5 y 15 productos sale 10 USD el envío
		// Más de 15 productos el envío es gratis

		int cantidadProductos;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¡¡¡BIENVENIDO A LA MERCERÍA!!!");
		System.out.println("\nIngrese la cantidad de productos: ");
		cantidadProductos = scanner.nextInt();

		if(cantidadProductos < 5) {
			System.out.println("\nLo siento, la empresa no vende por menos de 5 unidades");
		}else {
			if(5 <= cantidadProductos && cantidadProductos <= 15) {
				System.out.println("\nUsted a seleccionado " + cantidadProductos + " productos");
				System.out.println("El envío le sale 10 USD");
			}else {
				System.out.println("\nUsted a seleccionado " + cantidadProductos + " productos");
				System.out.println("Debido a su compra, el envío es gratis");
			}
		}
		System.out.println("\nEsperamos que haya tenido una gran experiencia, hasta luego!");
		scanner.close();
	}

}

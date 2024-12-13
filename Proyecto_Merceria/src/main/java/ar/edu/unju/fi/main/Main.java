package ar.edu.unju.fi.main;

import java.util.Scanner;

public class Main {

	public static final Double MONTO_INFERIOR = 100.0;
	public static final Double MONTO_SUPERIOR = 300.0;
	public static final Double PRIMER_DESCUENTO = 0.05;
	public static final Double SEGUNDO_DESCUENTO = 0.10;
	
	public static void main(String[] args) {

		// Merceria mayorista --> vende por mayor
		// Menos de 5 productos NO VENDE
		// Entre 5 y 15 productos sale 10 USD el envío
		// Más de 15 productos el envío es gratis

		int cantidadProductos;
		double montoTotal;

		Scanner scanner = new Scanner(System.in);

		System.out.println("¡¡¡BIENVENIDO A LA MERCERÍA!!!");
		try {
			System.out.println("\nIngrese la cantidad de productos: ");
			cantidadProductos = scanner.nextInt();

			if (cantidadProductos < 5) {
				if (cantidadProductos < 0)
					System.out.println("\nAsegúrese de ingresar un número válido");
				else
					System.out.println("\nLo siento, la empresa no vende por menos de 5 unidades");
			} else {
				scanner = new Scanner(System.in);
				System.out.println("\nIngrese el monto total de la compra: ");
				montoTotal = scanner.nextDouble();
				if (5 <= cantidadProductos && cantidadProductos <= 15) {
					System.out.println("\nUsted a seleccionado " + cantidadProductos + " productos");
					System.out.println("El envío le sale $10");
					montoTotal += 10;
				} else {
					System.out.println("\nUsted a seleccionado " + cantidadProductos + " productos");
					System.out.println("Debido a su compra, el envío es gratis");
				}
				if (montoTotal < MONTO_INFERIOR) {
					System.out.println("\nMonto insuficiente para la promoción");
					System.out.println("Para llegar a la promoción le faltan $" + (MONTO_INFERIOR - montoTotal));
					System.out.println("Su monto es de $" + montoTotal);
				}else {
					if(montoTotal >= MONTO_INFERIOR && montoTotal <= MONTO_SUPERIOR) {
						System.out.println("\nUsted obtiene un descuento del 5%");
						montoTotal = calcularDescuento(montoTotal, PRIMER_DESCUENTO);
						System.out.println("Su nuevo monto es de $" + montoTotal);
					}else {
						System.out.println("\nUsted obtiene un descuento del 10%");
						montoTotal = calcularDescuento(montoTotal, SEGUNDO_DESCUENTO);
						System.out.println("Su nuevo monto es de $" + montoTotal);
					}
				}
			}
			System.out.println("\nEsperamos que haya tenido una gran experiencia, hasta luego!");
		} catch (Exception e) {
			System.out.println("\nDebe ingresar un número");
		}
		scanner.close();
	}

	private static Double calcularDescuento(Double monto, Double descuento) {
		return monto - (monto * descuento);
	}
}

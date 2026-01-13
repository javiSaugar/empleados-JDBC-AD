package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		menu();
	}
	
	public static void sysoMenu() {
		System.out.println("MENU-----------");
		System.out.println("1º Crear Empleado");
		System.out.println("2º Leer Empleado");
		System.out.println("3º Borrar Empleado");
		System.out.println("4º Modificar Empleado");
		System.out.println("0º Salir");
		System.out.println("----------------");
	}

	public static void menuSwitch(int opcion) {
		switch (opcion) {
		case 1:
			System.out.println("Menu 1");
			break;
		case 2:
			System.out.println("Menu 2");
			break;
		case 3:
			System.out.println("Menu 3");
			break;
		case 4:
			System.out.println("Menu 4");
			break;
		case 0:
			System.out.println("Saliendo ...");
			break;
		default:
			System.out.println("Intentelo de nuevo");
			break;
		}
	}
	
	public static void menu() {
		int opcion = -1;
		do {
			sysoMenu();
			opcion = pideNumero("Introduzaca su opcion: ");
			menuSwitch(opcion);
		} while (opcion != 0);
	}

	public static int pideNumero(String mensaje) {
		System.out.print(mensaje);
		Scanner teclado = new Scanner(System.in);
		String numeroP = teclado.nextLine();
		int numero=-1;
		try{
			numero = Integer.parseInt(numeroP);
		}catch (NumberFormatException e) {
			System.err.println("Formato numerico equivocado");
		}
		return numero;
	}
	
	public static String pideDato (String mensaje) {
		System.out.println(mensaje);
		Scanner teclado = new Scanner(System.in);
		return teclado.nextLine();
	}
	
}

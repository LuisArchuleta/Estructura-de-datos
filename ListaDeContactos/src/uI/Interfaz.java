package uI;

import java.util.Scanner;

import negocios.ListaDeContactos;

public class Interfaz {
	static Scanner entrada = new  Scanner(System.in);
	static ListaDeContactos ldc = new ListaDeContactos();
	
	public static void lectura() {
		System.out.println("Bienvenido");
		System.out.println("Por favor, escoja una de las siguientes opciones");
		System.out.println("Para acceder a la opcion, escriba el número");
	
		imprimirMenu();			
	}
	private static void imprimirMenu() {
		System.out.println("Por favor, escoja una de las siguientes opciones");
		System.out.println("Para acceder a la opcion, escriba el número");
		System.out.println("****** MENU PRINCIPAL ******");
		System.out.println("1.- Ingresar Nuevo Contacto");
		System.out.println("2.- Mostrar Contactos");
		System.out.println("3.- Modificar Contactos");
		System.out.println("4.- Eliminar Contactos");
		System.out.println("5.- Salir");
		System.out.println("*****************************");
		int opcion = entrada.nextInt();
		switch  (opcion) {
		case 1:
			entrada.nextLine(); // solo limpia la cadena Scanner
			validarAlta(); // si los datos que ingresa el usuario tiene el formato correcto
			break;
		case 2:
			// mostrar todos los contactos
			//mostrarContactos();
			break;
		case 3:
			//entrada.nextLine(); // solo limpia la cadena Scanner
			//validarCambio();
			break;
		case 4:
			//entrada.nextLine(); // solo limpia la cadena Scanner
			//validarBaja();
			break;
		case 5:
			salir();
			break;
		default:
			System.out.println("Opción invalida");
			break;
		}
		
	}
	private static void salir() {
	   System.out.println("Sesion Finalizada");
	   System.out.println("Adios!");
	   System.exit(0);
	}
	
	private static void validarAlta() {
		try{
			String nombres,apellidos,direccion,correo,telefono,celular;
			while(true) {
				System.out.println("Ingresar un nuevo contacto");
				System.out.println("Por favor ingrese la informacion del contacto");
				System.out.println("El nombre debe contener entre 3 y 10 caracteres");
				System.out.println("y el celular debe contener exactamente 10 numeros");
				System.out.println("Los nombres y apellidos no pueden repetirse");
				System.out.println("Nombres:");
				nombres=entrada.nextLine();
				System.out.println("Apellidos:");
				apellidos= entrada.nextLine();
				if(ldc.buscarContacto(nombres,apellidos)!=null) {
					System.out.println("Ya existe un contacto con ese nombre y apellido");
					System.out.println("Si desea agregar nuevamente un contacto");
					System.out.println("Ingrese un nuevo nombre y apellido");
				}
				else {
					break;
				}
			}
			System.out.println("Domicilio:");
			direccion=entrada.nextLine();
			System.out.println("Correo");
			correo=entrada.nextLine();
			System.out.println("Telefono:");
			telefono=entrada.nextLine();
			System.out.println("Celular");
			celular=entrada.nextLine();
			if(ldc.agregarContacto(nombres, apellidos, direccion, correo, telefono, celular)) {
				System.out.println("Contacto agregado con exito");
			}else {
				System.out.println("No se agrego");
				System.out.println("Si desea agregar nuevamente un contacto");
				System.out.println("Seleccione la opcion 1");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		
		}
		imprimirMenu();
	}
	private static void mostrarContactos() {
		System.out.println("Total de elementos: "+ldc.tamanio());
		ldc.mostrarTodosLosContactos();
		imprimirMenu();
	}
	private static void validaBaja() {
		try {
			String nombres,apellidos;
			while(true) {
				System.out.println("Eliminar un contacto");
				System.out.println("Por favor ingrese la informacion del contacto");
				System.out.println("El nombre y appellido deben de existir");
				System.out.println("Nombres:");
				nombres=entrada.nextLine();
				System.out.println("Apellidos:");
				apellidos=entrada.nextLine();
				if(ldc.buscarContacto(nombres, apellidos)==null) {
					System.out.println("Contacto Eliminado");
					System.out.println("Lista de contactos");
					break;
				}else {
					System.out.println("No existe un contacto con ese nombre y apellido");
					System.out.println("Si desea eliminar un contacto");
					System.out.println("Ingrese un contacto nombre y apellido valido");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}


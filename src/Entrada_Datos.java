import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada_Datos {

	public static void main(String[] args) {
		System.out.println("Que quieres hacer? ");
		System.out.println("1- Introducir datos ");
		System.out.println("2.- Salir del programa ");
		Scanner entrada=new Scanner(System.in);
		
		int decision=entrada.nextInt();
		if(decision==1) {
			try {
				pedirDatos();
			}catch(InputMismatchException e) {
				System.out.println("Que diablos metiste");
			}	
		}else {
			System.out.println("Adios");
			System.exit(0);
		}
		
		entrada.close();
		
	}
	
	static void pedirDatos() throws InputMismatchException{ //aqui el metodo lanza la exception
		//try {   No tiene caso que este desde adentro si el metodo esta lanzado la exception, se hara desde fuera
			Scanner entrada=new Scanner(System.in);
			
			System.out.println("Introduce el nombre: ");
			String nombre_usuario=entrada.nextLine();
			
			System.out.println("Introduce edad: ");
			int edad_usuario=entrada.nextInt();
			
			System.out.println("Hola " + nombre_usuario + "el proximo año tendras: " + (edad_usuario+1));
			entrada.close();
			
			
		//}catch(InputMismatchException e) {  //Se podria poner Exception y funcionara igual porque hereda
		//	System.out.println("Que diablos metiste");
		//}
		
		System.out.println("Hemos terminado");
	}

}

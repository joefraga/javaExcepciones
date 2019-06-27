import javax.swing.JOptionPane;

public class Varias_Excepcion {

	public static void main(String[] args) {
		try {
			division();
		}catch(ArithmeticException e) {
			System.out.println("Estas dividiendo por 0");
		}catch(NumberFormatException e) {
			//System.out.prinln(e.getMessage());
			System.out.println("Se ha generado un error de este tipo " + e.getClass().getName());
		}

	}
	
	
	public static void division() {
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Dame otro numero"));
		System.out.println("El resultado de la division es: " + (num1/num2));
	}
	
}

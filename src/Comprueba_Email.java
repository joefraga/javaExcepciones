import javax.management.RuntimeErrorException;
import javax.swing.JOptionPane;

public class Comprueba_Email {

	public static void main(String[] args) {
		String el_mail=JOptionPane.showInputDialog("Introduce email: ");
		try {
			examina_email(el_mail);
		}catch(Exception e) {
			System.out.println("Hay un error en la cuenta");
			e.printStackTrace();
		}
	}

	public static void examina_email (String mail) throws Logitud_Mail_Erronea {
		int arroba=0;
		boolean punto=false;
		
		if(mail.length()<=3) {
			//ArrayIndexOutOfBoundsException mi_excepcion=new ArrayIndexOutOfBoundsException(); este tipo de execption no es correcta y hay que crear una propia
			//throw mi_excepcion;
			throw new Logitud_Mail_Erronea("El mail es demasiado corto y no cumple");
		}
		
		for(int i=0;i<mail.length(); i++) {
			if(mail.charAt(i)=='@'){
				arroba++;
			}
			if(mail.charAt(i)=='.'){
				punto=true;
			}			
		}
		if(punto==true && arroba>0) {
			System.out.println("La cuenta es correcta");
		}else {
			System.out.println("La cuenta no es correcta");
		}
		
	}
}

class Logitud_Mail_Erronea extends RuntimeException{
	public Logitud_Mail_Erronea() {
		
	}
	public Logitud_Mail_Erronea(String mensaje_error) {
		super(mensaje_error);
	}
}
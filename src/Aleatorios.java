import javax.swing.JOptionPane;

public class Aleatorios {

	public static void main(String[] args) {
		int elementos=Integer.parseInt(JOptionPane.showInputDialog("Cuantos elementos tiene la matriz: "));
		int num_aleat[]=new int[elementos];
		
		for(int i=0; i<elementos; i++) {
			num_aleat[i]=(int)(Math.random()*100);
		}
		
		for(int elemen: num_aleat) {
			System.out.println(elemen);
		}
	}

}

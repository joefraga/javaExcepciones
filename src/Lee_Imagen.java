import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Lee_Imagen {

	public static void main(String[] args) {
		VentanaImagen miventana=new VentanaImagen();
		miventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		miventana.setVisible(true);

	}

}

class VentanaImagen extends JFrame{
	VentanaImagen(){
		setTitle("Ventana con imagen");
		setBounds(300,300,500,400);
		Lamina_Imagen milamina=new Lamina_Imagen();
		add(milamina);
	}
}

class Lamina_Imagen extends JPanel {
	private Image imagen;
	
	Lamina_Imagen(){
		try {
			imagen=ImageIO.read(new File("azul.png"));
		}catch(IOException e){
			System.out.println("La imagen no se encuenta");
		}
		
	}
	
	

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(imagen==null) {
			System.out.println("La imagen no se encuenta, no se puede pintar");
		}else {
			int ancho_imagen=imagen.getWidth(this);
			int alto_imagen=imagen.getHeight(this);
			g.drawImage(imagen, 0, 0, null);
		
			for(int i=0;i<300; i++) {
				for(int j=0;i<200; i++) {
					if(i+j>0) {
						g.copyArea(0, 0, ancho_imagen, alto_imagen, ancho_imagen*i, alto_imagen*j);
					}	
				}
			}
		}	
	}
	
}
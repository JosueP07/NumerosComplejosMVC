package operacionesimgmvc;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author Josue Parrado
 */

public class VentanaPrincipal extends JFrame{
    
    private PanelCentro pc;
	private JLabel titulo;
	
	public VentanaPrincipal() {
		setTitle("Banco FdP");
		setSize(500,200);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		inicializarComponentes();
		
		setResizable(false);
		setVisible(true);
	}//Ventana Principal
        
        public void inicializarComponentes(){
            
        }
    
}//Jframe

package operacionesimgmvc;

import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author Josue Parrado
 */
public class PanelCentro extends JPanel{
    
    private PanelReunion pr;
	private PanelBotones pb;
	
	public PanelCentro() {
		setLayout(new GridLayout(1,2));
		inicilizarComponentes();
		setVisible(true);
	}
	
	public void inicilizarComponentes() {
		pr = new PanelReunion();
		pb = new PanelBotones();
		
		add(pr);
		add(pb);
	}

	public PanelReunion getPr() {
		return pr;
	}

	public void setPr(PanelReunion pr) {
		this.pr = pr;
	}

	public PanelBotones getPb() {
		return pb;
	}

	public void setPb(PanelBotones pb) {
		this.pb = pb;
	}
    
}

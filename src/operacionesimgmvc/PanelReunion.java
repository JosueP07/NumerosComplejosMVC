
package operacionesimgmvc;
import java.awt.GridLayout;

import javax.swing.*;
/**
 *
 * @author Josue Parrado
 */
public class PanelReunion extends JPanel{
    
    private PanelInformacion panelinfo;
	private JButton btnVerLista;
	
	public PanelReunion() {
		setLayout(new GridLayout(2,1));
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		panelinfo = new PanelInformacion();
		btnVerLista = new JButton();
		btnVerLista.setText("Ver Lista");
		btnVerLista.setActionCommand("VER");
		
		add(panelinfo);
		add(btnVerLista);
	}

	public PanelInformacion getPanelinfo() {
		return panelinfo;
	}

	public void setPanelinfo(PanelInformacion panelinfo) {
		this.panelinfo = panelinfo;
	}

	public JButton getBtnVerLista() {
		return btnVerLista;
	}

	public void setBtnVerLista(JButton btnVerLista) {
		this.btnVerLista = btnVerLista;
	}
}

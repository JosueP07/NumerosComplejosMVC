package operacionesimgmvc;

import java.awt.GridLayout;

import javax.swing.*;

/**
 *
 * @author Josue Parrado
 */
public class PanelReunion extends JPanel {

    
    private JButton btnVerLista;

    public PanelReunion() {
        setLayout(new GridLayout(2, 1));
        inicializarComponentes();
        setVisible(true);
    }

    public void inicializarComponentes() {
        
        btnVerLista = new JButton();
        btnVerLista.setText("Ver Lista");
        btnVerLista.setActionCommand("VER");

        
        add(btnVerLista);
    }

  
}

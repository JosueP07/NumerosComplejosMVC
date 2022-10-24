package operacionesimgmvc;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Josue Parrado
 */
public class PanelBotones extends JPanel {

    private JButton btnDividir;
    private JButton btnMultiplicar;
    private JButton btnSumar;
    private JButton btnRestar;

    public PanelBotones() {
        setLayout(new GridLayout(2, 2));
        inicializarComponentes();
        setVisible(true);
    }

    public void inicializarComponentes() {
        
        btnDividir= new JButton();
        btnDividir.setText("Dividir");
	btnDividir.setActionCommand("DIVIDIR");	
        
        btnMultiplicar= new JButton();
        btnMultiplicar.setText("Multiplicar");
	btnMultiplicar.setActionCommand("MULTIPLICAR");	
        
        btnSumar= new JButton();
        btnSumar.setText("Sumar");
	btnSumar.setActionCommand("SUMAR");	
        
        btnRestar= new JButton();
        btnRestar.setText("Restar");
	btnRestar.setActionCommand("RESTAR");	

    }

    public JButton getBtnDividir() {
        return btnDividir;
    }

    public void setBtnDividir(JButton btnDividir) {
        this.btnDividir = btnDividir;
    }

    public JButton getBtnMultiplicar() {
        return btnMultiplicar;
    }

    public void setBtnMultiplicar(JButton btnMultiplicar) {
        this.btnMultiplicar = btnMultiplicar;
    }

    public JButton getBtnSumar() {
        return btnSumar;
    }

    public void setBtnSumar(JButton btnSumar) {
        this.btnSumar = btnSumar;
    }

    public JButton getBtnRestar() {
        return btnRestar;
    }

    public void setBtnRestar(JButton btnRestar) {
        this.btnRestar = btnRestar;
    }
    
    

}

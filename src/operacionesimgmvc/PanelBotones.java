
package operacionesimgmvc;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Josue Parrado
 */
public class PanelBotones extends JPanel{
    
    private JButton btnAgregar;
	private JButton btnEliminar;
	private JButton btnActualizar;
	
	
	public PanelBotones() {
		setLayout(new GridLayout(3,1));
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		btnAgregar = new JButton();
		btnAgregar.setText("Agregar");
		btnAgregar.setActionCommand("AGREGAR");		
		
		
		btnEliminar = new JButton();
		btnEliminar.setText("Eliminar");
		btnEliminar.setActionCommand("ELIMINAR");

		
		btnActualizar = new JButton();
		btnActualizar.setText("Actualizar");
		btnActualizar.setActionCommand("ACTUALIZAR");

				
		add(btnAgregar);
		add(btnEliminar);
		add(btnActualizar);
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}
}

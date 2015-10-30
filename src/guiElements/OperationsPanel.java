package guiElements;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class OperationsPanel extends JPanel {

	private JButton addPolygonButton;
	private JButton addConicButton;
	private JButton viewMatrixButton;
	private JButton translateButton;
	private JButton rotateButton;
	private JButton shearButton;
	private JButton scaleButton;
	private JButton reflectButton;
	private JButton removeButton;
	
	public OperationsPanel() {
		
		setBackground(Color.LIGHT_GRAY);
	
		addPolygonButton = new JButton("Add Polygon");
		addConicButton = new JButton("Add Conic");
		viewMatrixButton = new JButton("View Matrix");
		translateButton = new JButton("Translate");
		rotateButton = new JButton("Rotate");
		shearButton = new JButton("Shear");
		scaleButton = new JButton("Scale");
		reflectButton = new JButton("Reflect");
		removeButton = new JButton("Remove");
		
		add(addPolygonButton);
		add(addConicButton);
		add(viewMatrixButton);
		add(translateButton);
		add(rotateButton);
		add(shearButton);
		add(scaleButton);
		add(reflectButton);
		add(removeButton);
		
		this.setSize(400, 800);
		this.setVisible(true);
	}
	
	
	
	
	public void viewMatrix() {
		
	}
	
	public void remove() {
		
	}
	
	
}

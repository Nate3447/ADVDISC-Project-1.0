package guiElements;

import javax.swing.*;
import java.util.ArrayList;
import operations.Point;
import operations.Equation;

public class MainWindow extends JFrame {

	private GraphPanel graphPane;
	private OperationsPanel operationsPane;
	private ArrayList<Point[]> polygons;
	private ArrayList<Equation> conics;
	
	public MainWindow() {
		polygons = new ArrayList<Point[]>();
		conics = new ArrayList<Equation>();
		
		operationsPane = new OperationsPanel();
		operationsPane.setBounds(0, 0, 400, 800);
		graphPane = new GraphPanel();
		graphPane.setBounds(400, 0, 800, 800);
		
		add(operationsPane);
		add(graphPane);
	}
	
	public void showUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ADVDISC Project 1");
		setSize(1200, 800);
		setVisible(true);
	}
	
	public void inputPolygon() {
		
	}
	
	public void inputConic() {
		
	}
	
	public void addPolygon(Point[] polygon) {
		polygons.add(polygon);
		
	}
	
	public void addConic(Equation conic) {
		conics.add(conic);
	}
}

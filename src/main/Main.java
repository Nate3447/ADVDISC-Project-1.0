package main;

import javax.swing.*;
import guiElements.*;
import operations.Matrix;
import operations.MatrixOperations;
import operations.Point;

public class Main {
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				MainWindow mainWindow = new MainWindow();
				mainWindow.showUI();
			}
		});
	}
	
	/* test method
	public static void test() {
		Point[] points = {new Point(1,2), new Point(2,1), new Point(1,2)};
		Matrix matrix1 = new Matrix(points);
		double[][] values2 = {{2,1},{1,2},{2,1}};
		Matrix matrix2 = new Matrix(values2);
		Matrix matrix = MatrixOperations.matrixMultiplication(matrix1, matrix2);
		if(matrix != null) {
			outputMatrix(matrix);
		} else {
			System.out.println("Invalid operation");
		}
	}
	
	public static void outputMatrix(Matrix matrix) {
		System.out.println("Row size = " + matrix.getRowSize());
		System.out.println("Column size = " + matrix.getColumnSize());
		for(int i=0; i<matrix.getColumnSize(); i++) {
			for(int j=0; j<matrix.getRowSize(); j++) {
				if(j==0) {
					System.out.print("[");
				}
				System.out.print(matrix.get(i, j));
				if(j==matrix.getRowSize()-1) {
					System.out.println("]");
				} else {
					System.out.print(" ");
				}
			}
		}
	}
	*/
}

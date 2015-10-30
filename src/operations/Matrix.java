package operations;

public class Matrix {
	
	private double[][] matrix;
	private int rowSize;
	private int columnSize;
	
	public Matrix(Equation equation) {
		matrix = new double[1][equation.getDegree()+1];
		
	}
	
	// not complete
	public Matrix(Equation[] equations) {
		// get highest degree
		int high = equations[0].getDegree();
		for(int i=1; i<equations.length; i++) {
			if(equations[i].getDegree() > high) {
				high = equations[i].getDegree();
			}
		}
		matrix = new double[equations.length][3];
		for(int i=0; i<equations.length; i++) {
			
		}
	}
	
	public Matrix(Point[] points) {
		rowSize = points.length;
		columnSize = 2;
		matrix = new double[2][rowSize];
		for(int i=0; i<rowSize; i++) {
			set(0, i, points[i].getX());
			set(1, i, points[i].getY());
		}
	}
	
	public Matrix(double[][] matrix) {
		this.matrix = matrix;
		rowSize = matrix[0].length;
		columnSize = matrix.length;
	}
	
	public Matrix(int rows, int columns) {
		matrix = new double[rows][columns];
		rowSize = columns;
		columnSize = rows;
	}

	public double[][] getMatrix() {
		return matrix;
	}
	
	public int getRowSize() {
		return rowSize;
	}

	public int getColumnSize() {
		return columnSize;
	}
	
	public void setRow(double[] content, int row) {
		for(int i=0; i<rowSize; i++) {
			set(row, i, content[i]);
		}
	}
	
	public double[] getRow(int row) {
		double[] rowContents = new double[rowSize];
		
		for(int i=0; i<rowSize; i++) {
			rowContents[i] = matrix[row][i];
		}
		
		return rowContents;
	}
	
	public void setColumn(double[] content, int column) {
		for(int i=0; i<columnSize; i++) {
			set(i, column, content[i]);
		}
	}
	
	public double[] getColumn(int column) {
		double[] columnContents = new double[columnSize];
		
		for(int i=0; i<columnSize; i++) {
			columnContents[i] = matrix[i][column];
		}
		
		return columnContents;
	}
	
	public void set(int row, int column, double value) {
		matrix[row][column] = value;
	}
	
	public double get(int row, int column) {
		return matrix[row][column];
	}
}

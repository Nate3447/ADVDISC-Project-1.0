package operations;

public abstract class MatrixOperations {
	
	public static Matrix matrixAddition(Matrix matrix1, Matrix matrix2) {
		if(matrix1.getRowSize() != matrix2.getRowSize() || matrix1.getColumnSize() != matrix2.getColumnSize()) {
			return null;
		}
		int rows = matrix1.getRowSize();
		int columns = matrix1.getColumnSize();
		Matrix result = new Matrix(rows, columns);
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; i++) {
				result.set(i, j, matrix1.get(i, j) + matrix2.get(i, j));
			}
		}
		return result;
	}
	
	public static Matrix matrixSubtraction(Matrix matrix1, Matrix matrix2) {
		if(matrix1.getRowSize() != matrix2.getRowSize() || matrix1.getColumnSize() != matrix2.getColumnSize()) {
			return null;
		}
		int rows = matrix1.getRowSize();
		int columns = matrix1.getColumnSize();
		Matrix result = new Matrix(rows, columns);
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; i++) {
				result.set(i, j, matrix1.get(i, j) - matrix2.get(i, j));
			}
		}
		return result;
	}
	
	public static Matrix scalarMultiplication(Matrix matrix, double constant) {
		Matrix result = new Matrix(matrix.getRowSize(), matrix.getColumnSize());
		for(int i=0; i<matrix.getRowSize(); i++) {
			for(int j=0; j<matrix.getColumnSize(); j++) {
				result.set(i, j, matrix.get(i, j) * constant);
			}
		}
		return result;
	}
	
	// tested and working
	public static Matrix matrixMultiplication(Matrix matrix1, Matrix matrix2) {
		if(matrix1.getRowSize() != matrix2.getColumnSize()) {
			System.out.println("Matrices cannot be multiplied.");
			return null;
		}
		Matrix result = new Matrix(matrix1.getColumnSize(), matrix2.getRowSize());
		for(int i=0; i<result.getColumnSize(); i++) {
			for(int j=0; j<result.getRowSize(); j++) {
				result.set(i, j, dotProduct(matrix1.getRow(i), matrix2.getColumn(j)));
			}
		}
		return result;
	}
	
	// tested and working
	public static double dotProduct(double[] matrix1, double[] matrix2) {
		double result = 0;
		for(int i=0; i<matrix1.length; i++) {
			result += matrix1[i] * matrix2[i];
		}
		return result;
	}
	
	// not done
	/*
	public Matrix powerOfMatrix(Matrix matrix1, int exponent) {
		
	}
	*/
	
	public static Matrix transpose(Matrix matrix) {
		Matrix result = new Matrix(matrix.getColumnSize(), matrix.getRowSize());
		for(int i=0; i<matrix.getRowSize(); i++) {
			result.setRow(matrix.getColumn(i), i);
		}
		return result;
	}
	
	public static Matrix getIdentityMatrix(int size) {
		Matrix result = new Matrix(size, size);
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(i == j) {
					result.set(i, j, 1);
				} else {
					result.set(i, j, 0);
				}
			}
		}
		return result;
	}
	
	// not done
	public static Matrix getRowEchelon(Matrix matrix) {
		Matrix result = new Matrix(matrix.getRowSize(), matrix.getColumnSize());
		
		return result;
	}
	
	
	// not done
	public static Matrix getReducedRowEchelon(Matrix matrix) {
		Matrix result = new Matrix(matrix.getRowSize(), matrix.getColumnSize());
		
		return result;
	}
	
}

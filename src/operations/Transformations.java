package operations;


public abstract class Transformations {
	
	// FOR CONICS: FIND NEW VERTICE, CHECK DIFFERENCE FROM OLD VERTICE, MOVE ALL POINTS AND PUT IN POINT ARRAY
	
	// change position of polygon
	public static Matrix translate(Matrix matrix, double xChange, double yChange) {
		Matrix addedMatrix = new Matrix(2, matrix.getRowSize());
		
		for(int i=0; i<matrix.getRowSize(); i++) {
			addedMatrix.set(0, i, xChange);
			addedMatrix.set(1, i, yChange);
		}
		
		return MatrixOperations.matrixAddition(matrix, addedMatrix);
	}
	
	public static Matrix rotate(Matrix matrix, double angle) {
		Matrix rotationMatrix = new Matrix(2, 2);
		if(angle > 0) {
			rotationMatrix = getClockwiseRotationMatrix(angle);
		} else if(angle < 0){
			rotationMatrix = getCounterClockwiseRotationMatrix(-angle);
		}
		if(angle == 0) {
			return matrix;
		} else {
			return MatrixOperations.matrixMultiplication(matrix, rotationMatrix);
		}
	}
	
	public static Matrix shearX(Matrix matrix, double value) {
		return MatrixOperations.matrixMultiplication(matrix, getShearXMatrix(value));
	}
	
	public static Matrix shearY(Matrix matrix, double value) {
		return MatrixOperations.matrixMultiplication(matrix, getShearYMatrix(value));
	}
	
	public static Matrix scale(Matrix matrix, double xScalingFactor, double yScalingFactor) {
		return MatrixOperations.matrixMultiplication(matrix, getScalingMatrix(xScalingFactor, yScalingFactor));
	}
	
	// reflect polygon
	public static Matrix reflect(Matrix matrix, boolean reflectX, boolean reflectY, boolean reflectOrigin) {
		Matrix result = matrix;
		
		if(reflectX) {
			result = MatrixOperations.matrixMultiplication(result, getXReflectionMatrix());
		}
		if(reflectY) {
			result = MatrixOperations.matrixMultiplication(result, getYReflectionMatrix());
		}
		if(reflectOrigin) {
			result = MatrixOperations.matrixMultiplication(result, getOriginReflectionMatrix());
		}
		
		return result;
	}
	
	// Convert vertex matrix into point array
	public static Point[] getMatrixPoints(Matrix matrix) {
		Point[] result = new Point[matrix.getRowSize()];
		for(int i=0; i<matrix.getRowSize(); i++) {
			result[i] = new Point(matrix.get(0, i), matrix.get(1,i));
		}
		return result;
	}
		
	// Operation Matrices
	public static Matrix getClockwiseRotationMatrix(double degrees) {
		Matrix result = new Matrix(2, 2);
		result.set(0, 0, Math.cos(degrees));
		result.set(0, 1, Math.sin(degrees));
		result.set(1, 0, -Math.sin(degrees));
		result.set(1, 1, Math.cos(degrees));
		return result;
	}
	public static Matrix getCounterClockwiseRotationMatrix(double degrees) {
		Matrix result = new Matrix(2, 2);
		result.set(0, 0, Math.cos(degrees));
		result.set(0, 1, -Math.sin(degrees));
		result.set(1, 0, Math.sin(degrees));
		result.set(1, 1, Math.cos(degrees));
		return result;
	}
	public static Matrix getXReflectionMatrix() {
		Matrix result = new Matrix(2, 2);
		result.set(0, 0, 1);
		result.set(0, 1, 0);
		result.set(1, 0, 0);
		result.set(1, 1, -1);
		return result;
	}
	public static Matrix getYReflectionMatrix() {
		Matrix result = new Matrix(2, 2);
		result.set(0, 0, -1);
		result.set(0, 1, 0);
		result.set(1, 0, 0);
		result.set(1, 1, 1);
		return result;
	}
	public static Matrix getOriginReflectionMatrix() {
		Matrix result = new Matrix(2, 2);
		result.set(0, 0, -1);
		result.set(0, 1, -0);
		result.set(1, 0, 0);
		result.set(1, 1, -1);
		return result;
	}
	public static Matrix getShearXMatrix(double value) {
		Matrix result = new Matrix(2, 2);
		result.set(0, 0, 1);
		result.set(0, 1, value);
		result.set(1, 0, 0);
		result.set(1, 1, 1);
		return result;
	}
	public static Matrix getShearYMatrix(double value) {
		Matrix result = new Matrix(2, 2);
		result.set(0, 0, 1);
		result.set(0, 1, 0);
		result.set(1, 0, value);
		result.set(1, 1, 1);
		return result;
	}
	public static Matrix getScalingMatrix(double xScalingFactor, double yScalingFactor) {
		Matrix result = new Matrix(2, 2);
		result.set(0, 0, xScalingFactor);
		result.set(0, 1, 0);
		result.set(1, 0, 0);
		result.set(1, 1, yScalingFactor);
		return result;
	}
}

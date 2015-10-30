package operations;

public class Term {
	private double constant;
	private int degree;
	
	public Term(double constant, int degree) {
		this.constant = constant;
		this.degree = degree;
	}
	
	public double getConstant() {
		return constant;
	}
	
	public void setConstant(double constant) {
		this.constant = constant;
	}
	
	public int getDegree() {
		return degree;
	}
	
	public void setDegree(int degree) {
		this.degree = degree;
	}
}

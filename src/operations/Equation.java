package operations;

public class Equation {
	
	private Term[] terms;
	private int degree;
	
	public Equation(Term[] termInput) {
		terms = termInput;
		for(int i=0; i<terms.length; i++) {
			// sort
		}
	}

	public Term[] getTerms() {
		return terms;
	}
	
	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}
}

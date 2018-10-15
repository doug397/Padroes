package br.com.padroes.comportamental.visitor;

public class Aluno implements IElement {
	
	private double score;
	private double altura;
	

	public Aluno(double score, double altura) {
		super();
		this.score = score;
		this.altura = altura;
	}



	@Override
	public void accept(IVisitor v) {
		v.visitAluno(this);
		
	}
	
	

	public double getScore() {
		return score;
	}



	public void setScore(double score) {
		this.score = score;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}

}

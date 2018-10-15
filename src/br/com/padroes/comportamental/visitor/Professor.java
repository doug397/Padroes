package br.com.padroes.comportamental.visitor;

public class Professor implements IElement {
	
	private double altura;
	private int numeroDePublicacoes;
	

	public Professor(double altura, int numeroDePublicacoes) {
		super();
		this.altura = altura;
		this.numeroDePublicacoes = numeroDePublicacoes;
	}
	
	@Override
	public void accept(IVisitor v) {
		v.visitProfessor(this);
		
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public int getNumeroDePublicacoes() {
		return numeroDePublicacoes;
	}


	public void setNumeroDePublicacoes(int numeroDePublicacoes) {
		this.numeroDePublicacoes = numeroDePublicacoes;
	}



}

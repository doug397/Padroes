package br.com.padroes.comportamental.visitor2;


public class Aluno implements Element {

	private double nota;
	private boolean dormir;
	
	public Aluno(int nota) {
		this.nota = nota;
		this.dormir = false;
	}
	@Override
	public void accept(IVisitor visitor) {
		visitor.visitAluno(this);
	}
	
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public boolean isDormir() {
		return dormir;
	}
	public void setDormir(boolean dormir) {
		this.dormir = dormir;
	}
	
}

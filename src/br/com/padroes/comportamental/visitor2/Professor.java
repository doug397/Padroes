package br.com.padroes.comportamental.visitor2;

public class Professor implements Element {
	
	private int nivel;
	private boolean dormir;
	
	public Professor() {
		this.nivel = 0;
		this.dormir = false;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visitProfessor(this);
	}
	
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public boolean isDormir() {
		return dormir;
	}

	public void setDormir(boolean dormir) {
		this.dormir = dormir;
	}

}

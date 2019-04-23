package br.com.padroes.estrutural.bridge2;

public abstract class Abstration {
	
	protected Implemantor implemantor;
	
	public Abstration(Implemantor implementor) {
		this.implemantor = implementor;
	}

	public void operation() {
		implemantor.operationImp();
		
	}
	
	public void setImplementor(Implemantor implementor) {
		this.implemantor = implemantor;
	}
}

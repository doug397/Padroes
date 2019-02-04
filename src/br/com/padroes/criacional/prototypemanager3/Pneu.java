package br.com.padroes.criacional.prototypemanager3;



public class Pneu implements IPrototype {
	
	private String marca;
	
	public Pneu() {
		marca = "Pneu";
	}
	
	public Pneu(String marca) {
		this.marca = marca;
	}

	@Override
	public IPrototype clonar() {
		System.out.println("|Clonando Pneu marca:" +marca);
		return new Pneu(marca);
	}

}

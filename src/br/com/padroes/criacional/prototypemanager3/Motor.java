package br.com.padroes.criacional.prototypemanager3;


public class Motor implements IPrototype {
	
	private String modelo;
	
	public Motor() {
		this.modelo ="Motor";
	}
	

	public Motor(String modelo) {
		super();
		this.modelo = modelo;
	}



	@Override
	public IPrototype clonar() {
		System.out.println("|Clonando Motor "+ modelo);
		return new Motor(modelo);
	}
}

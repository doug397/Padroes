package br.com.padroes.criacional.prototype2;

public class Aro16 implements IPrototype {

	
	private String marca;
	
	public Aro16() {
		marca = "Aro 12";
	}
	
	public Aro16(String marca) {
		this.marca = marca;
	}


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public IPrototype clonar() {
		System.out.println("Clonando Aro12 marca :"+marca);
		return new Aro16(marca);
	}


	
	

}

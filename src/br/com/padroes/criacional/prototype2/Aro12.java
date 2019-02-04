package br.com.padroes.criacional.prototype2;


public class Aro12 implements IPrototype {
	
	private String marca;
	
	public Aro12() {
		marca = "Aro 12";
	}
	
	public Aro12(String marca) {
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
		System.out.println("Clonando Aro 12 marca: "+marca);
		return new Aro12(marca);
	}

}

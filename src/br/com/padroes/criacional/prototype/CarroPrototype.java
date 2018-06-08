package br.com.padroes.criacional.prototype;

public abstract class CarroPrototype {
	
	protected double valorCompra;
	
	public abstract String exibirInfro();
	
	public abstract CarroPrototype clonar();
	
	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	

}

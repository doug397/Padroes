package br.com.padroes.criacional.prototype;

public class FiestaPrototype extends CarroPrototype{
	
	protected FiestaPrototype(FiestaPrototype fiestaPrototype){
		this.valorCompra =fiestaPrototype.getValorCompra();
	}
	
	 public FiestaPrototype() {
		valorCompra = 0.0;
	}

	@Override
	public String exibirInfro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CarroPrototype clonar() {
		// TODO Auto-generated method stub
		return new FiestaPrototype(this);
	}

}

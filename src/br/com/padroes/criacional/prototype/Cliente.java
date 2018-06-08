package br.com.padroes.criacional.prototype;

public class Cliente {

	public static void main(String[] args) {
		FiestaPrototype prototipoFiesta = new FiestaPrototype();
		
		CarroPrototype fiestaNovo = prototipoFiesta.clonar();
		fiestaNovo.setValorCompra(29.000);
		
		CarroPrototype fiestaUsado = prototipoFiesta.clonar();
		fiestaUsado.setValorCompra(20.000);
		
		System.out.println(fiestaNovo.getValorCompra());
		System.out.println(fiestaUsado.getValorCompra());
	}

}

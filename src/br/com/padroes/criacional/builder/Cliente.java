package br.com.padroes.criacional.builder;

public class Cliente {

	public static void main(String[] args) {
		
		ConcessionariaDirector concessionaria =
				new ConcessionariaDirector(new FiatBuilder());
		
		concessionaria.construirCarro();
		CarroProduto carro = concessionaria.getCarro();
		
		   System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
		            + "\nAno: " + carro.anodeFabricacao + "\nMotor: "
		            + carro.dscMotor + "\nValor: " + carro.preco);
		 
		    System.out.println();

	}

}

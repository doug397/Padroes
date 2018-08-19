package br.com.padroes.criacional.singleton;

public class FabricaDeCarro {
	
	private static FabricaDeCarro instancia;
	
	private FabricaDeCarro(){
		
	}
	
	public static FabricaDeCarro getInstancia(){
		if(instancia ==  null){
			instancia = new FabricaDeCarro();
		}
		
		return instancia;
	}

}

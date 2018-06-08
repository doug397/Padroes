package br.com.padroes.criacional.singleton;

public class FabricaDeCarro {
	
	public static FabricaDeCarro instancia;
	
	protected FabricaDeCarro(){
		
	}
	
	public static FabricaDeCarro getInstancia(){
		if(instancia ==  null){
			instancia = new FabricaDeCarro();
		}
		
		return instancia;
	}

}

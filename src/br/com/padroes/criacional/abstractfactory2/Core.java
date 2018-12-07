package br.com.padroes.criacional.abstractfactory2;


public class Core {
	
	public void criarCarro(ICarroFactory factory) {
		
		IPneu pneu = factory.createPneu();
		pneu.calibrar();
		
		IMotor motor = factory.createMotor();
		motor.ligar();
		
		IChassi chassi = factory.createChassi();
		chassi.clonar();
		
		IBanco banco = factory.createBanco();
		banco.reclinar();
	}

}

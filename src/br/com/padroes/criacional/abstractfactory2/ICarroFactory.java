package br.com.padroes.criacional.abstractfactory2;

public interface ICarroFactory {
	
	IMotor createMotor();
	IPneu createPneu();
	IChassi createChassi();
	IBanco createBanco();

}

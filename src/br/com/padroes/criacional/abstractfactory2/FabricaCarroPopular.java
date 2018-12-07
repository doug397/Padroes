package br.com.padroes.criacional.abstractfactory2;

public class FabricaCarroPopular implements ICarroFactory {

	@Override
	public IMotor createMotor() {
		// TODO Auto-generated method stub
		return new Motor10();
	}

	@Override
	public IPneu createPneu() {
		// TODO Auto-generated method stub
		return new Aro10();
	}

	@Override
	public IChassi createChassi() {
		// TODO Auto-generated method stub
		return new ChassiPopular();
	}

	@Override
	public IBanco createBanco() {
		// TODO Auto-generated method stub
		return new BancoTecido();
	}

}

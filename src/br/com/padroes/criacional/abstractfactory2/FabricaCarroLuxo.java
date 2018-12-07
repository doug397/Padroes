package br.com.padroes.criacional.abstractfactory2;

public class FabricaCarroLuxo implements ICarroFactory{

	@Override
	public IMotor createMotor() {
		// TODO Auto-generated method stub
		return new Motor30();
	}

	@Override
	public IPneu createPneu() {
		// TODO Auto-generated method stub
		return new Aro16();
	}

	@Override
	public IChassi createChassi() {
		// TODO Auto-generated method stub
		return new ChassiBlindado();
	}

	@Override
	public IBanco createBanco() {
		// TODO Auto-generated method stub
		return new BancoCouro();
	}

}

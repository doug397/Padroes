package br.com.padroes.criacional.prototypemanager3;


public class Main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	
		
		
		IPrototype prototipo = new Pneu();
  
//		System.out.println(prototipo.getClass().getName());
//		Class clazz = Class.forName("br.com.pneu.Motor"); 
//		IPrototype object = (IPrototype) clazz.newInstance();
		
		Factory factory = Factory.getInstance();
		factory.addPrototype("Pneu", prototipo);
		factory.create("Pneu",50);
		

	}

}

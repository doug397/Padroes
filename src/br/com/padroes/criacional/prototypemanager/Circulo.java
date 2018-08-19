package br.com.padroes.criacional.prototypemanager;

public class Circulo implements IPrototype {
	
	private double centerX;
    private double centerY;
    
    public Circulo() {
    	
    	this.centerX =  0;
    	this.centerY = 0;
    }
    public Circulo(double centerX,double centerY) {
    	
    	this.centerX = centerX;
    	this.centerY = centerY;
    	
    }
	
	public IPrototype clone() {
		System.out.println("Clonando Circulo");
		return new Circulo(centerX,centerY);
		
	}

}

package br.com.padroes.criacional.prototypemanager;

public class Triangulo implements IPrototype {
	
	private double centerX;
    private double centerY;
    
    public Triangulo() {
    	centerX  = 0;
    	centerY = 0;
    
    }
    
    public Triangulo(double centerX,double centerY ) {
    	this.centerX = centerX;
    	this.centerY = centerY;
    }
    
    
	public IPrototype clone() {
		System.out.println("Clonando Triangulo");
		return new Triangulo(centerX,centerY);
		
	}

}

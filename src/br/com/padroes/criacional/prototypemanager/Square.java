package br.com.padroes.criacional.prototypemanager;

public class Square implements IPrototype {
	
	
	private double centerX;
    private double centerY;
    
    public Square() {
    	centerX = 0;
    	centerY = 0;
    }
    
    public Square(double centerX, double centerY) {
    	this.centerX = centerX;
    	this.centerY = centerY;
    	
    }
	
	public IPrototype clone() {
		System.out.println("Clonando Square");
		return new Square(centerX,centerY);
		
	}

}

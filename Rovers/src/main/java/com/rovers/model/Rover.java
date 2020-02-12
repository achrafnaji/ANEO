package com.rovers.model;

public class Rover {
	private int x;
	private int y;
	private CardinalCompass cardinalCompass;
	
	
	public Rover() {
		
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public CardinalCompass getCardinalCompass() {
		return cardinalCompass;
	}
	public void setCardinalCompass(CardinalCompass cardinalCompass) {
		this.cardinalCompass = cardinalCompass;
	}
	public Rover(int x, int y, char c) {
		super();
		this.x = x;
		this.y = y;
	
		 switch(c){
         case 'N':
        	 this.cardinalCompass = cardinalCompass.N;
             break;
         case 'W':
        	 this.cardinalCompass = cardinalCompass.W;
             break;
         case 'E':
        	 this.cardinalCompass = cardinalCompass.E;
             break;
         case 'S':
        	 this.cardinalCompass = cardinalCompass.S;
             break;
         default:
        	 System.out.println("character not exist ");
             }
	}

	@Override
	public String toString() {
		return x+" "+y+" "+cardinalCompass;
	}
	
	




}

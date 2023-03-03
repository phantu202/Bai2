package com;

public class Geometric {
	private String color;
	private String filled;
	
	public Geometric() {
		
	}
	public Geometric(String color, String filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String setColor) {
		this.color = setColor;
	}
	
	public String getFilled() {
		return this.filled;
	}
	
	public void setFilled (String setFilled) {
		this.filled = setFilled;
	}
	
	public String toString() {
		return "Geometric [color=" + color + ", filled=" + filled + "]";
	}
	
	
	
	
}

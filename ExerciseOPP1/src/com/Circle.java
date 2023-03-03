package com;

public class Circle extends Geometric {
	
	private double radius;
	
	public Circle() {
		
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, String filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public static double getArea (double radius) {
		double getArea = 3.14 * radius * radius;
		return getArea;
	}
	
	public static double getPerimeter (double radius) {
		double getPerimeter = 3.14 * 2 * radius;
		return getPerimeter;
	}
	
	public static double getDiameter (double radius) {
		double getDiameter = 2 * radius;
		return getDiameter;
	}

	@Override
	public String toString() {
		return "Circle [radius = " + radius + 
				", color = " + getColor() + 
				", filled = " + getFilled() + 
				", area = " + getArea(radius) +
				", perimeter = " + getPerimeter(radius) +
				", diameter = " + getDiameter(radius) + "]";
	}
	
	public void printCircle () {
		System.out.println(toString());
	}
	
	
}

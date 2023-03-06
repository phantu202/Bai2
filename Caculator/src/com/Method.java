package com;

public class Method {
	private double elementA;
	private double elementB;
	private int caculation;

	public Method() {

	}

	public Method(double elementA, double elementB, int caculation) {

		this.elementA = elementA;
		this.elementB = elementB;
		this.caculation = caculation;
	}

	public double getElementA() {
		return elementA;
	}

	public void setElementA(double elementA) {
		this.elementA = elementA;
	}

	public double getElementB() {
		return elementB;
	}

	public void setElementB(double elementB) {
		this.elementB = elementB;
	}

	public int getCaculation() {
		return caculation;
	}

	public void setCaculation(int caculation) {
		this.caculation = caculation;
	}
	
	public static double sum (double elementA, double elementB) {
		double sum = elementA + elementB;
		return sum;
	}
	
	public static double subtraction (double elementA, double elementB) {
		double subtraction = elementA - elementB;
		return subtraction;
	}

	public static double multiplication (double elementA, double elementB) {
		double multiplication = elementA*elementB;
		return multiplication;
	}
	
	public static double division (double elementA, double elementB) {
		double division = elementA/elementB;
		return division;
	}
	
	public static void result (double elementA, double elementB, int caculation) {
		double result;
		switch (caculation) {
		case 1: 
			result = sum(elementA, elementB);
			break;
		case 2: 
			result = subtraction(elementA, elementB);
			break;
		case 3:
			result = multiplication(elementA, elementB);
			break;
		case 4: 
			result = division(elementA, elementB);
			break;
		default:
			System.out.println("Phép tính không hợp lệ");	
			return;
		}
		System.out.println("Kết quả của phép tính là: " + result);
		
		
		
	}
	
}

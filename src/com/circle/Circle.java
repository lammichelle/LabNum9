package com.circle;

public class Circle {

	public double radius;
	public double area;
	public double circumference;
	//these are instance variables
	
	
	public Circle (double radius) {
		this.radius = radius; // this is to make distinction between parameters and variables
	}
	
	//this method will format numbers to the nearest 2 decimal places
	private String formatNumber(double x) {
		String formattedNumber = String.format("%.2f", x);
		return formattedNumber;
	}
	
	
	public double getCircumference() {
		double circumference = 2 * Math.PI  * radius;
		return circumference;
	}
	
	
	public String getFormattedCircumference() {
	
		String formattedCircumference = formatNumber(getCircumference());
		return formattedCircumference;
	}
		
	public double getArea() {
		double area = Math.PI * (radius * radius);
		return area;
	}
	
	public String getFormattedArea() {
		String formattedArea = formatNumber(getArea());
		return formattedArea;
		
	}
	

}

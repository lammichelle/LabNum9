package com.circle;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Circle Tester");
		Scanner scan = new Scanner(System.in);
		String answer = "yes";
		
		do {
		//using validator
		double userRadius = Validator.getDouble(scan,  "Enter radius: ");
		Circle circle1 = new Circle (userRadius);
		
		System.out.println("Circumference: " + circle1.getFormattedCircumference());
		System.out.println("Area: " + circle1.getFormattedArea() ); //utilizing the circle package
		
		System.out.println("Continue? (yes/no):");
		answer = scan.next();
		if (answer.equalsIgnoreCase("no")) {
			System.out.println("Goodbye.");
		}
		
		}while(answer.equalsIgnoreCase("yes"));
		
		scan.close();
	}

}

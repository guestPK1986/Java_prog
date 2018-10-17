package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main (String[] args) {

		hello("world");

		double len = 5;
		System.out.println("Square of square with side " + len + " = " + area(len));

		double a = 4;
		double b = 6;
		System.out.println("Square of rectangle with sides " + a + " and " + b + " = " + area(a,b));
	}


	public static void hello (String something){
		System.out.println("Hello " + something + "!");
	}

	public static double area (double l){

		return l*l;
	}

	public static double area (double a, double b){

		return a*b;
	}
}
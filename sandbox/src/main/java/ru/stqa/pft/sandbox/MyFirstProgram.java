package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

public class MyFirstProgram {
  @Test
	public static void main (String[] args) {
		Square s = new Square();
		s.l = 5;
		System.out.println("Square of square with side " + s.l + " = " + area(s));
	}

	public static double area(Square s) {
		return s.l * s.l;
	}
}
package com.synechron.java.abstrac;

public class Triangle extends Geometry 
{
	@Override
	void shape() {
		System.out.println("This is a triangle");
	}
	@Override
	void area() {
		System.out.println("Area of a triangle is .5 * b * h");
	}
}

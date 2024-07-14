package com.synechron.java.abstrac;

public class Circle extends Geometry
{

	@Override
	void area() {
		System.out.println("Area of circle PI * r * r");
		
	}
	
	@Override
	void shape() {
		System.out.println("Circle");
		
	}
}
